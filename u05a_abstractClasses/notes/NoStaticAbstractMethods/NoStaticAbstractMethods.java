//first look at the working version of this example in Dynamic vs. Static Binding
class Base{  //the class was declared to be abstract when getNumber() was abstract
             //this gives a compiler error:  illegal combination of modifiers:  abstract and static
   public static abstract int getNumber();

   //public static int getNumber() { return 1;  }   
}

class Child extends Base{
   public static int getNumber() { return 2;  }
}

public class NoStaticAbstractMethods {
   public static void main(String[] args) {
      Base one = new Base();  //can't compile since the Base class is abstract and therefore incomplete
      Base two = new Child();
      Child three = new Child();
      
      System.out.print(one.getNumber()+" ");
      System.out.print(two.getNumber()+" ");  
      System.out.print(three.getNumber());
      System.out.println("\n");
      
      Base[] bases = {one,two,three};    	    
      for(Base b: bases) {
         System.out.print(b.getNumber()+" ");   
      }
      System.out.println("\n");      

      System.out.print(Base.getNumber()+" ");  //even if the Base class would have compiled, this can't work since the Base getNumber() method has no code!	
      System.out.print(Child.getNumber()+"\n");   
   }
}