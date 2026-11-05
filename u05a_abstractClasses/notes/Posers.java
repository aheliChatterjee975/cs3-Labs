import java.util.*;

public class Posers {
   
   public static void main(String[] args) {
      Integer num1 = new Integer(10);
      double num2 = new Integer(10);
      //Double num3 = new Integer(10);
      Number num3 = new Integer(10); 
  
      List<Number> list;
      list = new ArrayList<Number>();
      double d = 3.5;
      int i = 4;
 
      list.add(d); 
      list.add(new Double( d )); 
      list.add(new Integer( i ));       
   }   

   
}