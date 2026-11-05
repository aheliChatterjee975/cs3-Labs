    class Grandparent {  
    	  int gp=0;
    	  
        // Static init block  
        static { System.out.println("static IB - grandparent");    }  
      
        // Instance init block  
        { gp=10;  System.out.println("instance IB - grandparent: "+gp);   }  
      
        // Constructor  
        public Grandparent() { gp=15; System.out.println("constructor - grandparent: "+gp);  }  
    }  
      
    class Parent extends Grandparent {  
        // Static init block  
        static {  System.out.println("static IB - parent");         }  
         
       // Instance init block  
        { System.out.println("instance IB - parent");         }  
      
        // Constructor  
        public Parent() { System.out.println("constructor - parent");  }  
      
      
    }  
    class Child extends Parent {  
        // Static init block  
        static {  System.out.println("static IB1 - child");       } 
        
        static {  System.out.println("static IB2 - child");      } 
      
        // Instance init block  
        {   System.out.println("instance IB1 - child");    }  
   
        {   System.out.println("instance IB2 - child2");    } 
                  
        // Constructor  
        public Child() { 
            this(1); 
            System.out.println("constructor - child");  
        }  
         
        public Child(int n)
        {
            System.out.println("constructor2 - child n");
        }

    }  
      
    public class InitializationBlocksWithVariables {  
        public static void main(String[] args) {  
            System.out.println("START");  
            new Child();  
            System.out.println("END");  
        }  
    }  