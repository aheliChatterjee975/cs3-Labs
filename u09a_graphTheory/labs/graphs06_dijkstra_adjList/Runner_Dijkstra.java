import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Runner_Dijkstra
{
   public static void main1( String[] args ) throws IOException
   { 
      String edges = "AB7 AD5 BC8 BD9 BE7 CE5 DE15 DF6 EF8 EG9 FG11";
      //Graph_String_Dijkstras grapher = new Graph_String_Dijkstras(false, edges);
      Graph_List_Dijkstras grapher = new Graph_List_Dijkstras(false, edges);
      out.println(grapher);
      grapher.dijkstra("A");
   }
    
   public static void main( String[] args ) throws IOException
   { 
      Scanner file = new Scanner(new File("graphs.dat"));
      int howManyTimes = file.nextInt();
      file.nextLine();
      for(int x = 1; x <= howManyTimes; x++)
      {
         boolean directed = false;
         String graphType = file.nextLine();
         out.println("Graph #" + x + " - " + graphType);
         if (graphType.equalsIgnoreCase("Directed Graph")) {
            directed = true;
         }
         String connections = file.nextLine();
         //Graph_String_Dijkstras grapher = new Graph_String_Dijkstras(directed, connections);
         Graph_List_Dijkstras grapher = new Graph_List_Dijkstras(directed, connections);
         out.println(grapher + "\n");

         String dijkstraStarts = file.nextLine();
         for (String dijkstraStart : dijkstraStarts.split(" ")) {
            out.println("Dijkstra's Algorithm starting at " + dijkstraStart + ": \n");
            grapher.dijkstra(dijkstraStart);  
            out.println();    
         }      
         out.println();
      }
   }
}
