class A { 
   protected static int x = 4;
   
   public static String go() {
      return "A" + x + A.x + B.x;
   }
}

class B extends A {
   protected static int x = 6;
   public static String go() {
      return "B" + x + A.x + B.x;
   }
   // super.x would cause this syntax error:
   // non-static variable super cannot be 
   // referenced from a static context.
}