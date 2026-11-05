import java.util.Iterator;
//import MyArrayList;

public class MyArrayListTester
{
   public static void main(String[] args) {
      MyArrayList<String> list = new MyArrayList<String>(5);

      System.out.println("The capacity of list is now " + list.capacity());

      System.out.println("Adding \"Banana\" to the list.");
      list.add("Banana");

      System.out.println("Adding \"Apple\" to the list.");
      list.add("Apple");

      System.out.println("Adding \"Orange\" to the list.");
      list.add("Orange");

      System.out.println("Adding \"Orange\" to the list.");
      list.add("Orange");

      System.out.println("Adding \"Lemon\" to the list.");
      list.add("Lemon");

      System.out.println("Adding \"Orange\" to the list.");
      list.add("Pear");

      System.out.println("Adding \"Peach\" to the list.");
      list.add("Peach");

      System.out.println("\nThe capacity of list is now " + list.capacity());
      System.out.println("The size of the list is now " + list.size());

      System.out.println("\nAdding \"Grapefruit\" at position 2");
      list.add(2, "Grapefruit");

      System.out.println("Replacing the element at position 5 with Pear");
      list.set(6, "Pear");

      System.out.println("\nTesting the list iterator:");
      Iterator<String> itr = list.iterator();

      while (itr.hasNext())
      {
         String str = itr.next();

         if (str.equals("Orange"))
            itr.remove();

         System.out.print(str + " ");
      }

      System.out.println("\n\nTesting the for each statement:");
      for (String s : list)
         System.out.print(s + " ");

      System.out.println("\n\nRemoving Lemon from the list:");
      list.remove("Lemon");

      System.out.println("\nTesting the toString() method:");
      System.out.println(list);

      System.out.println("\nTesting the toArray() method:");
      Object[] array = list.toArray();

      for (Object obj : array)
         System.out.print(obj + " ");

      System.out.println("\n\nThe list is empty: " + list.isEmpty());

      System.out.println("Clearing the list.");
      list.clear();

      System.out.println("The list is empty: " + list.isEmpty());

      System.out.println();
   }
}


