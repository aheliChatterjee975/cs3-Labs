import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public class ColoredCell extends Cell
{
	private boolean filled;
	private Color color;
	
	public ColoredCell()
	{
		super(5,5,5,5);
		setFilled(false);
		setColor(Color.BLUE);		
	}

	public ColoredCell(boolean fill)
	{
      setFilled(fill);
      setColor(Color.BLUE);		

	}

	public ColoredCell(int x, int y, boolean fill)
	{
      setPos(x,y);
      setFilled(fill);
      setColor(Color.BLUE);		

	}

	public ColoredCell(int x, int y, int w, int h, boolean fill)
	{
      setPos(x,y);
      setWidth(w);
      setHeight(h);
      setFilled(fill);
      setColor(Color.BLUE);		

	}

	public ColoredCell(int x, int y, int w, int h, boolean fill, Color c)
	{
      setPos(x,y);
      setWidth(w);
      setHeight(h);
      setFilled(fill);
      setColor(c);
	}

	public void setFilled(boolean fill)
	{
      filled = fill;
	}

	public void setColor(Color c)
	{
      color = c;
	}
	
	public boolean getFilled()
	{
		return filled;
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public void draw(Graphics window)
	{
		window.setFont(new Font("TAHOMA",Font.BOLD,28));
		window.setColor(getColor());
		window.drawRect(getX(),getY(),getWidth(),getHeight());
      if(filled) {
         window.setColor(Color.GREEN);
         window.fillRect(getX(),getY(),getWidth(),getHeight());
      }
	}
	
	public String toString()
	{
		return super.toString() + " " + getFilled() + " " + getColor();
	}
}

