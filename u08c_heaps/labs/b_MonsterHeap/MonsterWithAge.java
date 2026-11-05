public class MonsterWithAge implements Comparable<MonsterWithAge>
{
   private int height, weight, age;
   
   public MonsterWithAge(int ht, int wt, int age)
   {
      height = ht;
      weight = wt;
      this.age = age;
   }
   
   public int compareTo(MonsterWithAge other)
   {
      if (height > other.height)
         return 1;
      if (height < other.height)
         return -1;
      if (weight > other.weight)
         return 1;
      if (weight < other.weight)
         return -1;
      return age - other.age;
   }
   
   @Override
   public String toString()
   {
      return "H"+height+" W"+weight+" Age"+age;
   }
}