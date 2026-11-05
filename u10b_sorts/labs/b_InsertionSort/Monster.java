public class Monster implements Comparable<Monster>
{
   String name;
   
   public Monster(String n)
   {
      name = n;
   }
      
   public int compareTo(Monster m)
   {
      return name.compareTo(m.name);
   }
   
   public String toString()
   {
      return name;
   }
}
