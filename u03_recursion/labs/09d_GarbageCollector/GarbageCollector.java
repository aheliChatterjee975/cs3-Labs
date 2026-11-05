import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class GarbageCollector extends JPanel implements MouseListener
{
	private int mouseX, mouseY;
	private boolean mouseClicked;
	private Grid trashMap;
	private final static int rows = 20;
	private final static int cols = 20;

	public GarbageCollector()
	{
		mouseClicked = false;
		trashMap = new Grid(rows,cols);
		for(int r=0; r<trashMap.getNumRows(); r++)
		{
			for(int c=0; c<trashMap.getNumCols(); c++)
			{
				int num = (int)(Math.random()*2);
				if(num == 1) {
					trashMap.setSpot(r,c,new ColoredCell(r*rows+10, c*cols+10, 10, 10, true, Color.ORANGE));
            }
            else {
               trashMap.setSpot(r,c,new ColoredCell(r*rows+10, c*cols+10, 10, 10, false, Color.ORANGE));
            }  
				//else
					//load in a different Cell
			}
		}

		setBackground(Color.white);
		setVisible(true);

		addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e)
	{
		mouseX=e.getX();
		mouseY=e.getY();
		mouseClicked = true;
		repaint();
	}

	public void paintComponent( Graphics window )
	{
		super.paintComponent(window);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
		window.setColor(Color.blue);
		window.drawString("Lab24c",420,40);
		window.drawString("THE GARBAGE COLLECTOR LAB", 420,55);
		if (mouseClicked)
		{
			int c = mouseY/cols;
			int r = mouseX/rows;
			pickUpTrash(r,c, window);
			mouseClicked = false;
		}
		drawTrashMap(window);
	}

	public void drawTrashMap( Graphics window  )
	{
      for(int r = 0; r < trashMap.getNumRows(); r++) {
         for(int c = 0; c < trashMap.getNumCols(); c++) {
            Cell cell = trashMap.getSpot(r,c);
            cell.draw(window);
          }
      }
	}

	public void pickUpTrash( int r, int c, Graphics window )
	{
	   if(r < trashMap.getNumRows() && r >= 0 && c < trashMap.getNumCols() && c >= 0) {
         ColoredCell cell = (ColoredCell)trashMap.getSpot(r,c);
         if(cell!=null && cell.getFilled()) {
            cell.setFilled(false);
            pickUpTrash(r+1,c, window);
            pickUpTrash(r-1,c, window);
            pickUpTrash(r,c-1, window);
            pickUpTrash(r,c+1, window);
         }
      }
	}

	public void mouseEntered(MouseEvent e) { }
	public void mouseExited(MouseEvent e) { }
	public void mousePressed(MouseEvent e) { }
	public void mouseReleased(MouseEvent e) { }
}
