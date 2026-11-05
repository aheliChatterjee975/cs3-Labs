import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class StaticDraw extends JFrame implements MouseListener, MouseMotionListener
{
	//change BufferedImage from static to non-static and run the program.
   //When it's static, when you draw on one panel you're drawing on all because they're 
   //they're all sharing the same canvas.
   //When it's non-static, each window has it's own canvas, so what you draw only 
   //appears in that window.
	private  BufferedImage buffer = null; 
	
	private Color color = null;
	private MyPanel screen;
	private int numberOfFrames = 6;   // Keep this value to 6 or less
	private int width = 534; //267;
	private static StaticDraw[] m;
	private int oldX, oldY;
	
	private class MyPanel extends JPanel
	{
		public void paintComponent(Graphics g) {
			g.drawImage(buffer, 0, 0, null);
		}
	}

	public static void main(String args[]) {
    	new StaticDraw();
    }
    
    StaticDraw() {
    	m = new StaticDraw[numberOfFrames];
    	Point p[] = new Point[numberOfFrames];
    	
    	int half = numberOfFrames/2;
    	for (int i = 0; i < half; i++)
    	{
    		p[i] = new Point(i * width, 0); 
			p[i + half] = new Point(i * width, width);
    	}
    	for (int i = 0; i < numberOfFrames; i++)
    	{
    		m[i] = new StaticDraw("StaticDemo" + (i + 1));
    		m[i].setLocation(p[i]);
    	}
    }
    
    StaticDraw(String title) {
    	super(title);
    	color = new Color(rgb(), rgb(), rgb());
    	screen = new MyPanel();
    	screen.addMouseListener(this);
    	screen.addMouseMotionListener(this);
    	buffer = new BufferedImage(width, width, BufferedImage.TYPE_3BYTE_BGR);
    	clearBuffer();
    	this.setSize(width, width);
    	this.getContentPane().add(screen);
    	this.setVisible(true);
	}
	
	private int rgb() {
		return (int) (Math.random() * 256);
	}
	
	public void clearBuffer() {
		Graphics g = buffer.getGraphics();
		g.setColor(Color.white);
		g.fillRect(0, 0, width, width);
	}
	
	public static void redraw() {
		for (int i = 0; i < m.length; i++)
			m[i].repaint();
	}
	
	// MouseListener Methods
	public void mouseExited(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {
		oldX = e.getX();
		oldY = e.getY();
	}
	public void mouseClicked(MouseEvent e) {}
	
	// MouseMotionListener Methods
	public void mouseMoved(MouseEvent e) {}
	public void mouseDragged(MouseEvent e) {
		Graphics g = buffer.getGraphics();
		g.setColor(color);
		g.drawLine(e.getX(), e.getY(), oldX, oldY);
		oldX = e.getX();
		oldY = e.getY();
		redraw();
	}
	
}
    