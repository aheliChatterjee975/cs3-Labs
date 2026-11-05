public class DoubleListNode implements Linkable
{
   private Comparable listNodeValue;
   private DoubleListNode nextListNode;
   private DoubleListNode prevListNode;

   public DoubleListNode()
   {
      listNodeValue = null;
      nextListNode = null;
      prevListNode = null;
   }

   public DoubleListNode(Comparable value, DoubleListNode prev, DoubleListNode next)
   {
      listNodeValue=value;
      nextListNode=next;
      prevListNode=prev;
   }

   public Comparable getValue()
   {
      return listNodeValue;
   }

   public DoubleListNode getPrev()
   {
      return prevListNode;
   }
   
   public DoubleListNode getNext()
   {
      return nextListNode;
   }

   public void setValue(Comparable value)
   {
      listNodeValue = value;
   }
   
   public void setPrev(Linkable prev)
   {
      prevListNode = (DoubleListNode)prev;
   }

   public void setNext(Linkable next)
   {
      nextListNode = (DoubleListNode)next;
   }
}
