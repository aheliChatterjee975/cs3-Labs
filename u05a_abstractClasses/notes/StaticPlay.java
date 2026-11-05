//© A+ Computer Science
// www.apluscompsci.com

//static example

import static java.lang.System.*;

class Monster
{
   private String myName;
   public int x=7;
   private static int count = 0;   //all Monsters share this var

   public Monster()
   {
     myName="";
     count++;
   }
   public Monster( String name )
   {
     myName = name;
     count++;
   }

   public static int getCount( )
   {
     return count;
   }

   public String toString()
   {
      return myName+x;
   }
}

class Witch extends Monster
{
   public int x=5;
   static int d=3;
   
   public Witch( String name )
   {
      super(name);
   }

   public String toString()
   {
      return super.toString()+x;
   }
   
   public static int getCount()
   {
      return d;
   }
   
   public static void printD() {
      out.println(Monster.getCount()+" "+d);  //can't type super.getcount()
   }
}



class Static
{
  public static void main ( String[] args )
  {
     System.out.println("\nMonster count == " + Monster.getCount() + "\n\n");

     Witch witch= new Witch("Harriet");
     out.println(witch);
     out.println("Monster count == " + witch.getCount() + "\n");
     witch.printD();
     
     Witch west = new Witch("Wicked Witch Of the West");
     out.println(west);
     out.println("Monster count == " + west.getCount() + "\n");
     west.printD();
  }
}