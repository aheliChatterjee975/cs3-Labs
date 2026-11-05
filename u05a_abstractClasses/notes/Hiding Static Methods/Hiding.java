import static java.lang.System.*;

public class Hiding {
   public static void main(String[] args) {
      A a = new A();
      B b = new B();
      A x = new B();
   
      System.out.println("The B go() method HIDES the A version:");
      System.out.println("A a = new A();  a.go() -> " + a.go());
      System.out.println("B b = new B();  b.go() -> " + b.go());
      System.out.println("A x = new B();  x.go() -> " + x.go());
      System.out.println();
      System.out.println("Clearer:");
      System.out.println("A.go() -> " + A.go());
      System.out.println("B.go() -> " + B.go());
   }
}
