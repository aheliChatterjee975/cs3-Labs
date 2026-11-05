import static java.lang.System.*;
import java.util.*;

public class BindingOverloadedMethods {
   public static void main(String[] args) {
   
      write(null);
      Object obj = 5;
      write(obj);   
      Integer n = 5;
      write(n);   
      CharSequence cs = "hmmm";
      write(cs);   
      Comparable comp = "hmmm";
      write(comp);  
      String s = "hmmm";
      write(s); 
   }
   
   public static void write(Object obj)         { out.println("Object"); }
   public static void write(Comparable obj)     { out.println("Comparable"); }
   public static void write(CharSequence obj)   { out.println("CharSequence"); }
   public static void write(String str)         { out.println("String"); }
   //public static void write(StringBuilder stbr) { out.println("StringBuilder"); }

}