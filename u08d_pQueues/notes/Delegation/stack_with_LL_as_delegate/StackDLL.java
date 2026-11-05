package java.util;

public class StackDLL<E> 
{
   LinkedList<E> list;

   //Instantiate like this:
   //
   // Stack stack = new Stack();
   //
   public StackDLL() {
      list = new LinkedList<E>();
   }
   
   public E push(E item) {
      list.push(item);
      return item;
   }
   
   public E pop() {
      return list.pop();
   }

   public E peek() {
      return list.peek();
   }

   public boolean empty() {
      return list.isEmpty();
   }

   public int search(Object o) {
      int i = list.lastIndexOf(o);
   
      if (i >= 0) {
         return list.size() - i;
      }
      return -1;
   }
}
