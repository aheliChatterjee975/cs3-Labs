//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class BST_Runner
{
   static BinarySearchTree tree;
   
   public static void main( String args[] ) throws NotANumberException
   {
      tree = new BinarySearchTree();
   
      //Use if you change your add() method to return a boolean:
      //out.println("tree.add(90) == " + tree.add(90));
      //out.println("tree.add(90) == " + tree.add(90));
      
      tree.add(90);  out.println("tree.add(90)");
      tree.add(90);  out.println("tree.add(90) <-- shouldn't add!!!");
      tree.add(100); out.println("tree.add(100)");
      tree.add(80);  out.println("tree.add(80)");
      tree.add(70);  out.println("tree.add(70)");
      tree.add(98);  out.println("tree.add(98)");
      out.println();
      out.println("*** Expected tree structure after these additions ***");
      out.println();             
      out.println("                      90              ");
      out.println("              80                100   ");
      out.println("         70                 98        ");
      out.println();
      testTree();
   
      tree.add(85);  out.println("tree.add(85)");
      out.println();
      out.println("*** Expected tree structure after these additions ***");
      out.println();
      out.println("                      90              ");
      out.println("              80                100   ");
      out.println("         70       85        98        ");
      out.println();
      testTree();
      
      //More nodes:
      tree.add(98);  out.println("tree.add(98)");
      tree.add(120); out.println("tree.add(120)");
      out.println();      
      out.println("*** Expected tree structure after these additions ***");
      out.println();
      out.println("                      90                  ");
      out.println("              80                100       ");
      out.println("         70       85        98       120  ");
      out.println();
      testTree();
      
      //for repl
      tree.add(72); out.println("tree.add(72)");
      tree.add(52); out.println("tree.add(52)");
      tree.add(30); out.println("tree.add(30)");
      tree.add(64); out.println("tree.add(64)");
      tree.add(57); out.println("tree.add(57)");
      tree.add(91); out.println("tree.add(91)");
      tree.add(93); out.println("tree.add(93)");
      tree.add(92); out.println("tree.add(92)");
      out.println();      
      out.println("*** Expected tree structure after these additions ***");
      out.println();
      out.println("                                                                 90                                                                   \n");
      out.println("                               80                                                                 100                                 \n");
      out.println("              70                                85                                98                               120                \n");
      out.println("      52              72                <>              <>                91              <>                <>              <>        ");
      out.println("  30      64      <>      <>        <>      <>      <>      <>        <>      93      <>      <>        <>      <>      <>      <>    ");
      out.println("<>  <>  57  <>  <>  <>  <>  <>    <>  <>  <>  <>  <>  <>  <>  <>    <>  <>  92  <>  <>  <>  <>  <>    <>  <>  <>  <>  <>  <>  <>  <>  ");
      out.println();      
      testTree();
      /*
      tree.add(94); out.println("tree.add(94)");
      tree.add(95); out.println("tree.add(95)");
      tree.add(96); out.println("tree.add(96)");
      tree.add(97); out.println("tree.add(97)");      
      tree.add(121);
      tree.add(122);
      tree.add(123);
      tree.add(124);
      tree.add(125);
      tree.add(126);
      tree.add(127);
      tree.add(90);
      tree.add(100);
      tree.add(77);
      tree.add(23);
      tree.add(11);
      tree.add(28);
      tree.add(48);
      */
      
      testRemoveMethod();  
      
      tree.clear();
      IO.println("Tree after calling clear: ");
      testTree();
   }
   
   private static void testTree() {
      tree.levelOrderWithNulls();
   
      out.println("IN ORDER from toString: " + tree.toString());
      out.print("              IN ORDER: ");
      tree.inOrder();
      out.print("             PRE ORDER: ");
      tree.preOrder();
      out.print("            POST ORDER: ");
      tree.postOrder();
      out.print("         REVERSE ORDER: ");
      tree.revOrder();
      out.println();
      out.println(tree.isFull()?"The tree is full.":"The tree is not full.");
      out.println(tree.isPerfect()?"The tree is perfect.":"The tree is not perfect.");
      out.println(tree.search(100)?"The tree contains 100!":"The does not contain 100."); 
      out.println(tree.search(114)?"The tree contains 114!":"The does not contain 114.");
      
      out.println("\nNumber of nodes is " + tree.getNumNodes());
      out.println("Number of leaves is " + tree.getNumLeaves());
      out.println("Number of levels is " + tree.getNumLevels());
      out.println("Tree height is " + tree.getHeight());
      try {
         out.println("The smallest tree node " + tree.getSmallest());   
         out.println("The largest tree node " + tree.getLargest());
      } catch (Exception e) {
         out.println(e.getMessage());
      }
      out.println("Tree diameter is " + tree.getDiameter());
      out.println("Sum of all nodes: " + tree.getTotal()); 
      //out.println("The max width: " + tree.getMaxWidth());
      out.println();
      //pause();
   }
   
   private static void testRemoveMethod() {
      out.println("Level order before removing any nodes - using level order traversal.");
      tree.levelOrderWithNulls();
      
      //Uncomment when ready to test 
      tree.remove(90);
      out.println("Tree after removing 90.");
      tree.levelOrderWithNulls();
      
      tree.remove(70);
      out.println("Tree after removing 70.");
      tree.levelOrderWithNulls();
            
      tree.remove(85);
      out.println("Tree after removing 85.");
      tree.levelOrderWithNulls();
   
      tree.remove(98);
      out.println("Tree after removing 98.");
      tree.levelOrderWithNulls();
   
      tree.remove(80);
      out.println("Tree after removing 80.");
      tree.levelOrderWithNulls();
   
      tree.remove(120); 
      out.println("Tree after removing 120.");
      tree.levelOrderWithNulls();
   
      tree.remove(100);                
      out.println("Tree after removing 100.");
      tree.levelOrderWithNulls();       
   }   
   
   public static void pause(int delay) {
      try
      {
         Thread.currentThread();
         Thread.sleep(delay);
      }
      catch(InterruptedException e) { }
   }
    
   private static void pause() {
      System.out.println("Press ENTER to continue...");
      (new java.util.Scanner(System.in)).nextLine();
   }
}

/*
Template for tree with 6 levels:

      out.println("                                                                 xx                                                                   ");
      out.println("                               xx                                                                  xx                                 ");
      out.println("              xx                                xx                                xx                                xx                ");
      out.println("      xx              xx                xx              xx                xx              xx                xx              xx        ");
      out.println("  xx      xx      xx      xx        xx      xx      xx      xx        xx      xx      xx      xx        xx      xx      xx      xx    ");
      out.println("xx  xx  xx  xx  xx  xx  xx  xx    xx  xx  xx  xx  xx  xx  xx  xx    xx  xx  xx  xx  xx  xx  xx  xx    xx  xx  xx  xx  xx  xx  xx  xx  ");

      out.println("                                                                 90                                                                   \n");
      out.println("                               80                                                                 100                                 \n");
      out.println("              70                                85                                98                               120                \n");
      out.println("      52              72                __              __                91              __                __              __        ");
      out.println("  30      64      __      __        __      __      __      __        __      93      __      __        __      __      __      __    ");
      out.println("__  __  57  __  __  __  __  __    __  __  __  __  __  __  __  __    __  __  92  __  __  __  __  __    __  __  __  __  __  __  __  __  ");
      out.println();   

      out.println();
      out.println("                                                                 90                                                                   \n");
      out.println("                               80                                                                 100                                 \n");
      out.println("              70                                85                                98                               120                \n");
      out.println("      52              72                <>              <>                91              <>                <>              <>        ");
      out.println("  30      64      <>      <>        <>      <>      <>      <>        <>      93      <>      <>        <>      <>      <>      <>    ");
      out.println("<>  <>  57  <>  <>  <>  <>  <>    <>  <>  <>  <>  <>  <>  <>  <>    <>  <>  92  <>  <>  <>  <>  <>    <>  <>  <>  <>  <>  <>  <>  <>  ");
      out.println();          

      out.println();
      out.println("                                                                 90                                                                   \n");
      out.println("                               80                                                                 100                                 \n");
      out.println("              70                                85                                98                               120                \n");
      out.println("      52              72                __              __                91              __                __              __        ");
      out.println("  30      64                                                          __      93                                                      ");
      out.println("__  __  57  __                                                      __  __  92  __                                                    ");
      out.println();      

      out.println();
      out.println("                                                                 90                                                                   \n");
      out.println("                               80                                                                 100                                 \n");
      out.println("              70                                85                                98                               120                \n");
      out.println("      52              72                                                  91                                                          ");
      out.println("     /   \\                                                                  \\                                                         ");
      out.println("  30      64                                                                  93                                                      ");
      out.println("         /                                                                   /                                                        ");
      out.println("        57                                                                  92                                                        ");
      out.println();           
      */