//package graphs6b_dijkstra_matrix;

import static java.lang.System.*;
//import static graphs6b_dijkstra_matrix.Letters.LETTERS;
import java.util.*;
import java.io.*;

public class Runner_AdjMatrix_Dijkstras {

       
   public static void main(String[] args) {
  
                       // A  B  C  D  E  F
      int[][] matrix1 = {{0, 0, 2, 8, 3, 0}, // A
                         {0, 0, 0, 6, 0, 0}, // B
                         {0, 3, 0, 4, 9, 0}, // C
                         {0, 0, 0, 0, 0, 0}, // D is a sink
                         {0, 0, 0, 0, 0, 0}, // E is a sink
                         {1, 0, 0, 0, 0, 0}  // F is
                        };         //    ^----- a source
      out.println("Graph one:");
      AdjMatrix_Dijkstras graph1 = new AdjMatrix_Dijkstras(matrix1);
      out.println(graph1);
      out.print("DFS recursive: ");
      graph1.printDfsRecur(5);
      out.print("DFS iter ->:   ");
      graph1.printDfsIter_Forward(5);      
      out.print("DFS iter <-:   ");
      graph1.printDfsIter_Backward(5);         
      out.print("BFS:           ");
      graph1.printBFS(5);
      out.println("\n");
      out.println("Dijkstra's Algorithm starting at F:");
      graph1.dijkstras(5);
      out.println();
       
                       //  A   B   C   D   E   F
      int[][] matrix2 = {{  0, 22,  0, 15,  3,  0},  // A
                         {  0,  0,  0,  4,  0,  0},  // B
                         {  0,  1,  0,  0,  0,  0},  // C
                         {  0,  0, 25,  0,  0,  6},  // D
                         {  0,  0,  0,  2,  0,  0},  // E
                         {  0,  0,  8,  0,  0,  0},  // F
                        };
      out.println("Graph two:");
      AdjMatrix_Dijkstras graph2 = new AdjMatrix_Dijkstras(matrix2);
      out.println(graph2);
      out.print("DFS recursive starting at A: ");
      graph2.printDfsRecur(0);
      out.print("DFS iter -> starting at A:   ");
      graph2.printDfsIter_Forward(0);      
      out.print("DFS iter <- starting at A:   ");
      graph2.printDfsIter_Backward(0);         
      out.print("BFS starting at D:           ");
      graph2.printBFS(3);
      out.println("\n");
      out.println("Dijkstra's Algorithm starting at A:");
      graph2.dijkstras(0);
      out.println("\n");
      out.println("Dijkstra's Algorithm starting at B:");
      graph2.dijkstras(1);            
      out.println();

     // Same as matrix2, but symmetric since it's an undirected graph.
     
                        //  A   B   C   D   E   F
      int[][] matrix3 = {{  0, 22,  0, 15,  3,  0},  // A
                         { 22,  0,  1,  4,  0,  0},  // B
                         {  0,  1,  0, 25,  0,  8},  // C
                         { 15,  4, 25,  0,  2,  6},  // D
                         {  3,  0,  0,  2,  0,  0},  // E
                         {  0,  0,  8,  6,  0,  0},  // F
                        };    
                        
      out.println("Graph three:");
      AdjMatrix_Dijkstras graph3 = new AdjMatrix_Dijkstras(matrix3);
      out.println(graph3);
      out.print("DFS recursive starting at C: ");
      graph3.printDfsRecur(2);
      out.print("DFS iter -> starting at C:   ");
      graph3.printDfsIter_Forward(2);      
      out.print("DFS iter <- starting at C:   ");
      graph3.printDfsIter_Backward(2);         
      out.print("BFS starting at F: ");
      graph3.printBFS(5);
      out.println("\n");
      out.println("Dijkstra's Algorithm starting at E:");
      graph3.dijkstras(4);
      out.println();

                                     //  A    B    C    D    E    F    G
      int[][] matrix4 = new int[][]{ {   0,   7,   0,   5,   0,   0,   0 },
                                     {   7,   0,   8,   9,   7,   0,   0 },
                                     {   0,   8,   0,   0,   5,   0,   0 },
                                     {   5,   9,   0,   0,  15,   6,   0 },
                                     {   0,   7,   5,  15,   0,   8,   9 },
                                     {   0,   0,   0,   6,   8,   0,  11 },
                                     {   0,   0,   0,   0,   9,  11,   0 },
                                   };
      out.println("Graph four:");
      AdjMatrix_Dijkstras graph4 = new AdjMatrix_Dijkstras(matrix4);
      out.println(graph4);
      out.print("DFS recursive starting at A: ");
      graph4.printDfsRecur(0);
      out.print("DFS iter -> starting at A:   ");
      graph4.printDfsIter_Forward(0);      
      out.print("DFS iter <- starting at A:   ");
      graph4.printDfsIter_Backward(0);         
      out.print("BFS starting at A:           ");
      graph4.printBFS(0);
      out.println("\n");
      out.println("Dijkstra's Algorithm starting at A:  ");
      graph4.dijkstras(0);
      out.println();

                                      //  A    B    C    D    E    F    G    H
      int[][] matrix5 = new int[][]{  {   0,   6,   1,   3,   0,   0,   5,   0 },
                                      {   6,   0,   0,   0,   3,   0,   6,   3 },
                                      {   1,   0,   0,   1,   0,   0,   0,   0 },
                                      {   3,   0,   1,   0,   2,   8,   0,   0 },
                                      {   0,   3,   0,   2,   0,   0,   0,   4 },
                                      {   0,   0,   0,   8,   0,   0,   0,   5 },
                                      {   5,   6,   0,   0,   0,   0,   0,   0 },
                                      {   0,   3,   0,   0,   4,   5,   0,   0 },
                                     };
      out.println("\nGraph five:");
      AdjMatrix_Dijkstras graph5 = new AdjMatrix_Dijkstras(matrix5);
      out.println(graph5);
      out.print("DFS recursive starting at A: ");
      graph5.printDfsRecur(0);
      out.print("DFS iter -> starting at A:   ");
      graph5.printDfsIter_Forward(0);      
      out.print("DFS iter <- starting at A:   ");
      graph5.printDfsIter_Backward(0);         
      out.print("BFS starting at A:           ");
      graph5.printBFS(0);
      out.println("\n");
      out.println("Dijkstra's Algorithm starting at A:");
      graph5.dijkstras(0);
   }
}