
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Canvas;

public class GameBoard extends Canvas implements MouseListener
{
    private int mouseX, mouseY;
    private boolean mouseClicked, gameOver;
    private int mouseButton, prevMouseButton;
    private Grid board;

    private final static int WIDTH = 150;
    private final static int HEIGHT = 150;
    private final static int SCALE = 50;
    private final static int BOARDSIZE = 3;

    public GameBoard()
    {
        mouseClicked = false;
        gameOver = false;
        mouseX = mouseY = 0;
        mouseButton = 0;
        prevMouseButton = -1;

        board = new Grid(BOARDSIZE, BOARDSIZE);

        addMouseListener(this);
        setBackground(Color.WHITE);
    }

    public void mouseClicked(MouseEvent e)
    {
        if (gameOver)
            return;

        mouseClicked = true;
        mouseX = e.getX();
        mouseY = e.getY();
        mouseButton = e.getButton();
        repaint();
    }

    public void paint(Graphics window)
    {
        window.setColor(Color.WHITE);
        window.fillRect(0, 0, 800, 600);

        window.setFont(new Font("TAHOMA", Font.BOLD, 12));
        window.setColor(Color.BLUE);
        window.drawString("TIC TAC TOE", 420, 55);
        window.drawString("Left click = X (green)", 420, 85);
        window.drawString("Right click = O (red)", 420, 105);

        // Draw the 3x3 board
        window.setColor(Color.BLACK);
        window.drawRect(50, 50, WIDTH, HEIGHT);
        window.drawLine(100, 50, 100, 200);
        window.drawLine(150, 50, 150, 200);
        window.drawLine(50, 100, 200, 100);
        window.drawLine(50, 150, 200, 150);

        board.drawGrid(window);

        if (mouseClicked)
        {
            markBoard();
            mouseClicked = false;

            board.drawGrid(window);

            if (determineWinner(window))
            {
                gameOver = true;
            }
        }
    }

    public void markBoard()
    {
        // Only allow clicks inside the board
        if (mouseX < 50 || mouseX >= 200 ||
            mouseY < 50 || mouseY >= 200)
        {
            return;
        }

        int r = (mouseY - 50) / SCALE;
        int c = (mouseX - 50) / SCALE;

        // Do not overwrite an occupied square
        if (board.getSpot(r, c) != null)
            return;

        // Left click places X
        if (mouseButton == MouseEvent.BUTTON1)
        {
            board.setSpot(r, c,
                new Piece(55 + c * SCALE, 55 + r * SCALE,
                          40, 40, "X", Color.GREEN));
        }
        // Right click places O
        else if (mouseButton == MouseEvent.BUTTON3)
        {
            board.setSpot(r, c,
                new Piece(55 + c * SCALE, 55 + r * SCALE,
                          40, 40, "O", Color.RED));
        }
    }

    public boolean determineWinner(Graphics window)
    {
        String winner = "";

        // Check horizontal wins
        for (int r = 0; r < 3; r++)
        {
            Piece a = (Piece) board.getSpot(r, 0);
            Piece b = (Piece) board.getSpot(r, 1);
            Piece c = (Piece) board.getSpot(r, 2);

            if (a != null && b != null && c != null &&
                a.getName().equals(b.getName()) &&
                a.getName().equals(c.getName()))
            {
                winner = a.getName() + " wins!";
            }
        }

        // Check vertical wins
        for (int c = 0; c < 3; c++)
        {
            Piece a = (Piece) board.getSpot(0, c);
            Piece b = (Piece) board.getSpot(1, c);
            Piece d = (Piece) board.getSpot(2, c);

            if (a != null && b != null && d != null &&
                a.getName().equals(b.getName()) &&
                a.getName().equals(d.getName()))
            {
                winner = a.getName() + " wins!";
            }
        }

        // Check diagonal from top-left to bottom-right
        Piece a = (Piece) board.getSpot(0, 0);
        Piece b = (Piece) board.getSpot(1, 1);
        Piece c = (Piece) board.getSpot(2, 2);

        if (a != null && b != null && c != null &&
            a.getName().equals(b.getName()) &&
            a.getName().equals(c.getName()))
        {
            winner = a.getName() + " wins!";
        }

        // Check diagonal from top-right to bottom-left
        a = (Piece) board.getSpot(0, 2);
        b = (Piece) board.getSpot(1, 1);
        c = (Piece) board.getSpot(2, 0);

        if (a != null && b != null && c != null &&
            a.getName().equals(b.getName()) &&
            a.getName().equals(c.getName()))
        {
            winner = a.getName() + " wins!";
        }

        if (!winner.equals(""))
        {
            window.setFont(new Font("TAHOMA", Font.BOLD, 22));
            window.setColor(Color.ORANGE);
            window.drawString(winner, 320, 355);
            return true;
        }

        // Check for a tie
        if (board.drawGrid(window))
        {
            window.setFont(new Font("TAHOMA", Font.BOLD, 22));
            window.setColor(Color.ORANGE);
            window.drawString("Cat's game - no winner!", 280, 355);
            return true;
        }

        return false;
    }

    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }
    public void mousePressed(MouseEvent e) { }
    public void mouseReleased(MouseEvent e) { }
}

