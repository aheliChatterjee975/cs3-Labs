public interface StackInterface<E> 
{
   //Instantiate like this:
   //
   // Stack stack = new LinkedList();
   //

   public E push(E item); 
      
   public E pop();

   public E peek(); 
   
   public boolean isEmpty();


}
