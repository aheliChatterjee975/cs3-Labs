import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

class BinarySearchTree
{
   private TreeNode root;

   public BinarySearchTree() {
      root = null;
   }

//    public TreeNode getRoot() {
//       return root;
//    }
      
   public void add(Comparable val) {
      // Call recursive version and store into instance variable
   }

   // Does nothing if one attempts to add a duplicate value.
   private TreeNode add(Comparable val, TreeNode tree) {
      // If tree doesn't exist, return a new node storing val
   
      Comparable treeValue = tree.getValue();
      int dirTest = val.compareTo(treeValue);      
      
      if(dirTest < 0) {
         // recursive call add method on left child inside
         // a call to this node's setLeft method:
         tree.setLeft(add(val, tree.getLeft()));
      }
      // Otherwise, if this value is larger do the same on the right:
   
      // Note that there won't be a case for compareTo producing zero
      // since our Binary Search Tree won't allow duplicates.
   
      // return a reference to the current node;
      return null;
   }
   
   public void inOrder() {
      inOrder(root);
      System.out.println();
   }

   private void inOrder(TreeNode tree) {
      //If this node exists
         // call this method on the left child
         // print the current value
         // call this method on the right child
   }

   public void preOrder() {
      preOrder(root);
      System.out.println();
   }

   private void preOrder(TreeNode tree) {
   
   }

   public void postOrder() {
      postOrder(root);
      System.out.println();
   }

   private void postOrder(TreeNode tree) {
   
   }

   public void revOrder() {
      revOrder(root);
      System.out.println();
   }

   private void revOrder(TreeNode tree) {
   
   }

   // Method getNumNodes
   public int getNumNodes() {
      return getNumNodes(root);
   }

   private int getNumNodes(TreeNode tree) {
      //If this node doesn't exist
         // return an appropriate value
   
      // return the expression that sums one for this node plus
      // the result of calling this method on the left child
      // and the recursive call on the right child
      return  0;
   }   

   public void clear() {
      root = null;
   }

   public int getNumLeaves() {
      return getNumLeaves(root);
   }

   private int getNumLeaves(TreeNode tree) {
      // If this node doesn't exist
         // return an appropriate value
      // If this node is a leaf
         // return one
         
      // return the expression that sum the result 
      // of calling this method on the left child
      // and the recursive call on the right child
      return  0;
   }
   
   private boolean isLeaf(TreeNode node) {
      return false;
   }

   private boolean hasOneChild(TreeNode node) {
      return false;
   }
   
   private boolean hasTwoChildren(TreeNode node) {
      return false;
   }   

   // Check for Full Binary Tree   
   public boolean isFull() {
      return isFull(root);
   }
      
   private boolean isFull(TreeNode node) {
      // Respond appropriately to these four cases:
      // This node doesn't exist, this node is a leaf,
      // this node has one child, or this node has two children.
      // The last case is the only one that recursively calls isFull.
   
      return false;
   }   
   
      
   public boolean isPerfect() {
      // Check to see if this tree obeys the formula for a perfect tree
      // that relates the number of levels and number of nodes:
      return false;
   }

   public double getTotal() {
      return getTotal(root);
   }   

   // This version only works if the tree stores Integer objects.
   public double getTotal(TreeNode node) {
      if (node == null) {
         return 0.0;
      } 
      Integer value = (Integer)node.getValue();
      return value + getTotal(node.getLeft()) + getTotal(node.getRight());
   }  

   // This version works no matter what kind of Number object is stored.
   // The NotANumberException is my own construct and is defined inside
   // this class at the very end of the class.
   public double getTotal2(TreeNode node) throws NotANumberException {
      if (node == null) {
         return 0.0;
      }
      if ( !(node.getValue() instanceof Number) ) {
         String msg = (node.getValue() + "Is not a number. " +
                       "Only call this method for types that extend Number");
         throw new NotANumberException(msg);
      }   
      double value = ((Number)node.getValue()).doubleValue();
      return value + getTotal2(node.getLeft()) + getTotal2(node.getRight());
   }
    
   public Comparable getSmallest() {
      return getSmallest(root);
   }
   
   // Method getSmallest  (iterative version)
   private Comparable getSmallest(TreeNode tree) {
      if(tree == null)
         throw new IllegalStateException("The tree is empty!");
      // Loop until you're at the left-most node. 
      // Then remove the left-most node's value.
      
      return null;
   }  
  
   public Comparable getLargest() {
      return getLargest(root);
   }
   
   // Method getLargest  (iterative version)
   private Comparable getLargest(TreeNode tree) {
      if(tree == null)
         throw new IllegalStateException("The tree is empty!");
      // Loop until you're at the right-most node. 
      // Then remove the right-most node's value.
      
      return null;
   }      

   public boolean search(Comparable val) {
      return search(val, root);
   }

   private boolean search(Comparable val, TreeNode tree) {
      if(tree != null) {
         int dirTest = val.compareTo(tree.getValue());
         // if we found val: 
            return true;
         // Otherwise, if val is less than this node's value
            // return the result of a recursive call on the left child
         // Otherwise ...
         
      }
      return false;
   }
        
   public int getNumLevels() {
      return getNumLevels(root);
   }
      
   private int getNumLevels(TreeNode tree) {
      if(tree==null)   
         return 0;
      else {
         // Calculate the number of levels by summing one for this level with the greater 
         // of the two recursive calls on the children of this node:
         return 0;
      }
   }

   // Method getHeight
   public int getHeight() {
      return getHeight(root);
   }

   private int getHeight(TreeNode tree) {
      return getNumLevels(tree) - 1;
   }
      
   public int getDiameter() {
      return getDiameter(root);
   }

   private int getDiameter(TreeNode tree) {
        /* base case if tree is empty */
      if (tree == null) 
         return 0;    
   
        /* get the diameter going through this node */
      int thisDiameter = 0; 
              
        /* get the diameter of left and right subtrees */
      int leftDiameter = 0; 
      int rightDiameter = 0; 
   
        /* Return max of following three 
         1) Diameter of left subtree 
         2) Diameter of right subtree 
         3) 1 + (# of levels in left subtree) + (# of levels in left subtree right subtree) */
      return 0;
      //return Collections.max(Arrays.asList(new Integer[] {thisDiameter, leftDiameter, rightDiameter}));
   }  

   public void remove(Comparable val) {
      root = remove(val, root);
   }
  
   private TreeNode remove(Comparable val, TreeNode tree) {
      if(tree == null)
         return null;
      int dirTest = val.compareTo(tree.getValue());
      // if val is smaller than the value stored by this node: 
         // recursive call add method on left child inside
         // a call to this node's setLeft method:
      // Otherwise, if this value is larger do the same on the right:

      // Otherwise:
         // If the node doesn't have right child
            // Replace this node with its left child
         // Otherwise:
            // Find the smallest value in the right sub-tree, which is the successor of this node's value
            // Replace this node's value with its successor
            // Remove the successor from the right sub-tree of this node, and set the right child of this node to the result of the remove 

      return tree;
   }  

   @Override
   public String toString()
   {
      return toString(root);
   }

   private String toString(TreeNode tree)
   {
      if(tree == null)
         return "";
      // Perform an in-order traversal:   
      return "";
   }
      
   //===========================================//
   // These are helper methods provided for you //
   //===========================================// 
   public void levelOrder() {
      levelOrder(root);
      System.out.println("\n");
   }

   private void levelOrder(TreeNode tree) {
      if(tree==null)
         return;
        
      Queue<TreeNode> level = new LinkedList<TreeNode>();
      level.add(tree);
      while(!level.isEmpty()) {
         TreeNode node = level.remove();
         out.print(node.getValue() + " ");
         if(node.getLeft()!=null) {
            level.add(node.getLeft());
         }
         if(node.getRight()!=null) {
            level.add(node.getRight());
         }
      }
   }
 
   public void levelOrderWithNulls() {
      levelOrderWithNulls(root);
      System.out.println("\n");
   }

   private void levelOrderWithNulls(TreeNode tree) {
      if(tree==null)
         return;
     
      Queue<TreeNode> level = new LinkedList<TreeNode>();
      level.add(tree);
      int prevLevelSize = 1;
      int spot = 0;      
      while(!level.isEmpty() && !allElementsNull(level)) {
         TreeNode node = level.remove();
         out.print( node == null ? "null " : node.getValue() + " ");
         if(node == null) {
            level.add(null);
            level.add(null);
         }
         else if(node.getLeft()!=null && node.getRight()==null) {
            level.add(node.getLeft());
            level.add(null);
         }
         else if(node.getLeft()==null && node.getRight()!=null) {
            level.add(null);  
            level.add(node.getRight());
         } else {
            level.add(node.getLeft());
            level.add(node.getRight());
         }
         spot++;
         if (spot == prevLevelSize) {
            prevLevelSize *= 2;
            spot = 0;
            out.print("| ");
         }
      }
   } 
   
   private boolean allElementsNull(Collection<TreeNode> list) {
      for (Object object : list) {
         if (object != null)
            return false;
      }
      return true;
   }
    
   public void printTree() {
      int numLevels = getNumLevels(root);
      ArrayList<TreeNode> nodes = new ArrayList<TreeNode>();
      nodes.add(root);
      printTree(nodes, 1, getNumLevels());
      //This line would replace the previous three!
      //printTree(Collections.singletonList(root), 1, getNumLevels());
   }

   private void printTree(List<TreeNode> nodes, int level, int numLevels) {
      if (numLevels > 6)
         return;
      if (nodes.isEmpty() || allElementsNull(nodes))
         return;
   
      int floor = numLevels - level;
      int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0))); 
      int firstSpaces = (int) Math.pow(2, (floor)); //-1?
      int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;
   
      printSpaces(firstSpaces);
   
      List<TreeNode> newNodes = new ArrayList<TreeNode>();
      for (TreeNode node : nodes) {
         if (node != null) {
            System.out.printf("%3s", node.getValue().toString());
            newNodes.add(node.getLeft());
            newNodes.add(node.getRight());
         } else {
            newNodes.add(null);
            newNodes.add(null);
            System.out.print(" ");
         }
      
         printSpaces(betweenSpaces);
      }
      System.out.println("");
   
      for (int i = 1; i <= endgeLines; i++) {
         for (int j = 0; j < nodes.size(); j++) {
            printSpaces(firstSpaces - i);
            if (nodes.get(j) == null) {
               printSpaces(endgeLines + endgeLines + i + 1);
               continue;
            }
         
            if (nodes.get(j).getLeft() != null)
               System.out.print("  /");
            else
               printSpaces(3);
         
            printSpaces(i + i - 1);
         
            if (nodes.get(j).getRight() != null)
               System.out.print("\\");
            else
               printSpaces(1);
         
            printSpaces(endgeLines + endgeLines - i);
         }
      
         System.out.println("");
      }
   
      printTree(newNodes, level + 1, numLevels);
   }

   private void printSpaces(int count) {
      for (int i = 0; i < count; i++)
         System.out.print(" ");
   }
   
   // A new type of exception to be thrown by the getSmallest and getLargest methods: 
   class NotANumberException extends Exception
   {
      public NotANumberException(String errorMessage) {
         super(errorMessage);
      }
   }
}