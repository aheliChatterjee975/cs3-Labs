//package graphs07_dijkstra_matrix;

import static java.lang.System.*;
//import static graphs07_dijkstra_matrix.Letters.LETTERS;
import java.util.*;
import java.io.*;

public class Runner_AdjMatrix_Dijkstras2 {
   public static void main(String[] args) throws IOException {
      Scanner file = new Scanner(new File("matrices.dat"));
      String line = "";
      while (file.hasNext()) {
         line = file.nextLine();
         if (line.charAt(0) != '#') {
            break;
         }
      }
      int graphCount = Integer.parseInt(line);
      for (int graphNum = 1; graphNum <= graphCount; ++graphNum) {
         out.println("Graph " + graphNum + ":");
         int numVertices = Integer.parseInt(file.nextLine());
         int[][] matrix = new int[numVertices][numVertices];
         for (int i=0; i<numVertices; ++i) {
            String row = file.nextLine();
            int j=0;
            for (String v : row.split(" +")) {
               matrix[i][j++] = Integer.parseInt(v);
            }
         }
         AdjMatrix_Dijkstras graph = new AdjMatrix_Dijkstras(matrix);
         out.println(graph);
         int dfsStart = Integer.parseInt(file.nextLine());
         out.print("DFS recursive starting at " + Letters.LETTERS[dfsStart] + ": ");
         graph.printDfsRecur(dfsStart);
         out.print("DFS iter -> starting at " + Letters.LETTERS[dfsStart] + ":   ");
         graph.printDfsIter_Forward(dfsStart);      
         out.print("DFS iter <- starting at " + Letters.LETTERS[dfsStart] + ":   ");
         graph.printDfsIter_Backward(dfsStart);
         int bfsStart = Integer.parseInt(file.nextLine());
         out.print("BFS starting at " + Letters.LETTERS[bfsStart] + ":           ");
         graph.printBFS(bfsStart);
         out.println("\n");
         String dijkstraStarts = file.nextLine();
         for (String num : dijkstraStarts.split(" ")) {
            int dijkstraStart = Integer.parseInt(num);
            out.println("Dijkstra's Algorithm starting at " + Letters.LETTERS[dijkstraStart] + ": \n");
            graph.dijkstras(dijkstraStart);  
            out.println();    
         }
         file.nextLine();
         out.println();
      }
   }
}

