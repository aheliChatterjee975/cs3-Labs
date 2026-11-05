class Base{
   public static int getNumber() { return 5;  }
}

class Child1 extends Base{
   public static int getNumber() { return 1;  }
}

class Child2 extends Base{
   public static int getNumber() { return 2;  }
}

public class DynamicVsStaticBinding {
   public static void main(String[] args) {
      Base[] bases = new Base[3];
      bases[0] = new Base();
      bases[1] = new Child1();
      bases[2] = new Child2();
      for(Base b: bases) {
         System.out.print(b.getNumber()+" ");   //because static methods are not inherited, the output is 5, 5, and 5 !!!
      }
      System.out.println("\n");      

      System.out.print(Base.getNumber()+" ");	
      System.out.print(Child1.getNumber()+" ");
      System.out.print(Child2.getNumber()+"\n"); //because each static method is called explicitly, the output is 5, 1, and 2   
   }
}