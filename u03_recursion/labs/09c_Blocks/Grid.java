import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Grid
{
   private String[][] grid;
   private boolean[][] visited;
   
   public Grid()
	{
	}

	public Grid(int rows, int cols, String[] vals)
	{
      setGrid(rows,cols,vals);
	}
	
	public void setGrid(int rows, int cols, String[] vals)
	{
      visited = new boolean[rows][cols];
      grid = new String[rows][cols];
      for(int r = 0; r < rows; r++) {
         for(int c = 0; c < cols; c++) {
            int random = (int) (Math.random() * vals.length);
            grid[r][c] = vals[random];
         }
      }
            
	}

	public int findMax(String val)
	{
		int max = 0;
      for(int r = 0; r < visited.length; r++) {
         for(int c = 0; c < visited[r].length; c++) {
            visited[r][c] = false;
         }
      }
      for(int r = 0; r < grid.length; r++) {
         for(int c = 0; c < grid[r].length; c++) {
            if(grid[r][c].equals(val) && visited[r][c] == false) {
               int size = findMax(r,c,val);
               if(size > max) {
                  max = size;
               }
            }
          }
       }
      
		return max;
	}

	private int findMax(int r, int c, String search)
	{
      int count = 0;
      if(r < grid.length && r >= 0 && c < grid[0].length && c >= 0) {
         if(grid[r][c].equals(search) && visited[r][c]==false) {
         visited[r][c] = true;
         count = 1 + 
            findMax(r+1,c, search) + 
            findMax(r-1,c, search) + 
            findMax(r,c-1, search) +
            findMax(r,c+1, search);
         }
      }
		return count;
	}

	public String toString()
	{
		String output="";
      for(int i = 0; i < grid.length; i++) {
         for(int j = 0; j < grid[i].length; j++) {
            output+=grid[i][j] + " ";
         }
         output+= "\n";
      }
		return output;
	}
}

