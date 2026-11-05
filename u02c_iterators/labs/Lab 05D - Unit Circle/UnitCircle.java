import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

/* The purpose of this lab is to learn the Unit Circle and how to use it to answer trig problems.
 * It has been designed to show the exact value for the radian measures and coordinates that are
 * irrational numbers due to including pi or a radical. You won't be calling Java's trig functions!
 * Because of the purpose, in the lab all int angle measures represent degrees and double angle 
 * measures represent radians, despite the fact that you can have a fractional number of degrees.
 */
public class UnitCircle
{
   // FIX ALL THREE SIGNS SO THEY HAVE -1 WHERE THAT TRIG FUNCTION IS NEGATIVE.
   //
   // Signs are listed in quadrant order, with their location in the array
   // corresponding to the quadrant number:
   public static final int[]    sineSigns = {0,  1, 1, 1, 1};
   public static final int[]  cosineSigns = {0,  1, 1, 1, 1};
   public static final int[] tangentSigns = {0,  1, 1, 1, 1};

   // The lists:
   public static final ArrayList<Integer> anglesInDegrees = new ArrayList<>();
   public static final ArrayList<Double>  anglesInRadians = new ArrayList<>();
   public static final ArrayList<UnitCirclePoint> points = new ArrayList<>();
   
   // This is a static intitializer block that populates the lists:
   // It automatically runs when you load the class into memory (which happens when you
   // run the program).
   static {
      Collections.addAll(anglesInDegrees, new Integer[] {0, 30, 45, 60, 90, 120, 135, 150, 180, 210, 225, 240, 270, 300, 315, 330});
      Collections.addAll(anglesInRadians, new Double[] {0.0, PI/6, PI/4, PI/3, PI/2, 2*PI/3, 3*PI/4, 5*PI/6, PI,
                                                         7*PI/6, 5*PI/4, 4*PI/3, 3*PI/2, 5*PI/3, 7*PI/4, 11*PI/6});
                // [0.0, 0.5235987755982988, 0.7853981633974483, 1.0471975511965976, 1.5707963267948966, 2.0943951023931953, 2.356194490192345, 2.6179938779914944, 3.141592653589793, 
                //  3.665191429188092, 3.9269908169872414, 4.1887902047863905, 4.71238898038469, 5.235987755982989, 5.497787143782138, 5.759586531581287]
   
      points.add(new UnitCirclePoint(  0,      "0",          0.0,          "1",          "0",         "0"));
      points.add(new UnitCirclePoint( 30,   "pi/6",    PI/6,  "sqrt(3)/2",        "1/2", "sqrt(3)/3"));
      points.add(new UnitCirclePoint( 45,   "pi/4",    PI/4,  "sqrt(2)/2",  "sqrt(2)/2",         "1"));
      points.add(new UnitCirclePoint( 60,   "pi/3",    PI/3,        "1/2",  "sqrt(3)/2",   "sqrt(3)"));
   
      points.add(new UnitCirclePoint( 90,   "pi/2",    PI/2,          "0",          "1",  "undefined"));
      points.add(new UnitCirclePoint(120,  "2pi/3",  2*PI/3,       "-1/2",  "sqrt(3)/2",   "-sqrt(3)"));
      points.add(new UnitCirclePoint(135,  "3pi/4",  3*PI/4, "-sqrt(2)/2",  "sqrt(2)/2",         "-1"));
      points.add(new UnitCirclePoint(150,  "5pi/6",  5*PI/6, "-sqrt(3)/2",        "1/2", "-sqrt(3)/3"));
   
      points.add(new UnitCirclePoint(180,     "pi",      PI,         "-1",          "0",          "0"));
      points.add(new UnitCirclePoint(210,  "7pi/6",  7*PI/6, "-sqrt(3)/2",       "-1/2",  "sqrt(3)/3"));
      points.add(new UnitCirclePoint(225,  "5pi/4",  5*PI/4, "-sqrt(2)/2", "-sqrt(2)/2",          "1"));
      points.add(new UnitCirclePoint(240,  "4pi/3",  4*PI/3,       "-1/2", "-sqrt(3)/2",    "sqrt(3)"));
   
      points.add(new UnitCirclePoint(270,  "3pi/2",  3*PI/2,          "0",         "-1",   "undefined"));
      points.add(new UnitCirclePoint(300,  "5pi/3",  5*PI/3,        "1/2", "-sqrt(3)/2",    "-sqrt(3)"));
      points.add(new UnitCirclePoint(315,  "7pi/4",  7*PI/4,  "sqrt(2)/2", "-sqrt(2)/2",          "-1"));
      points.add(new UnitCirclePoint(330, "11pi/6", 11*PI/6,  "sqrt(3)/2",       "-1/2",  "-sqrt(3)/3"));
      points.add(new UnitCirclePoint(360,    "2pi",    2*PI,          "1",          "0",           "0"));
   }     
   
   // USE AN ITERATOR to loop through the list of UnitCirclePoints and print each one.
   public static void printValues() {
   
   }
   
   // Compare two angles using this formula:
   //
   //     |x - y|
   //  -------------  <= epsilon
   //  max(|x|, |y|)
   //
   // where epsilon is usually set to 1E-14 (i.e. 10^-14)
   public static boolean approximatelyEqual(double angle1, double angle2) {
      return false;
   }

   /*     QUADRANTAL ANGLES     */

   // Quadrantal angles: ... -270, -180, -90, 0, 90, 180, 270, ...
   public static boolean isQuadrantal(int angle) {
      return false;
   }
   
   // Quadrantal angles: ... -3pi/2, -pi, -pi/2, 0, pi/2, pi, 3pi/2, ...
   public static boolean isQuadrantal(double angle) {
      return 0 <= 1E-14;
   }
      
   // Return a string listing all quadrantal angles in degrees
   // in the range [0, 360]
   public static String listQuadrantalAnglesInDegrees() {
      return "";
   }

   // Return a string listing all quadrantal angles in degrees
   // in the range [0, 2pi]
   public static String listQuadrantalAnglesInRadians() {
      return "";
   }
   
   /*     COTERMINAL ANGLES     */
   
   // Determine whether the given angles are coterminal.
   // Assume angle measures are in degrees.
   public static boolean areCoterminal(int angle1, int angle2) {
      return false;
   }

   // Determine whether the given angles are coterminal.
   // Assume angle measures are in radians.
   public static boolean areCoterminal(double angle1, double angle2) {
      return false;
   }

   // Find the angle in range [0, 360) that is coterminal with 
   // the given angle (in degrees).
   public static int coterminalIn0to360(int angle) {
      return 0;
   }
   
   // Find the angle in range [0, 2pi) that is coterminal with 
   // the given angle (in radians).
   public static double coterminalIn0to2PI(double angle) {
      return 0;
   }
      
   /*     REFERENCE ANGLES     */

   // The reference angle is the positive angle in [0, 90]
   // that reperesents the amount of rotation from the closest
   // side of the x-axis to the terminal ray of the angle.
   // Assume angle is in degrees.
   public static int referenceAngle(int angle) {
      return 0;
   }
   
   // The reference angle is the positive angle in [0, 90]
   // that reperesents the amount of rotation from the closest
   // side of the x-axis to the terminal ray of the angle.
   // Assume angle is in radians.
   public static int referenceAngle(double angle) {
      return 0;
   }

   /*     EXACT FORM OF TRIG VALUES     */
   
   /* The goal is not to return the decimal approximation
    * for the requested trig values. Java's trig functions
    * already do that. The goal is to return the correct
    * exact value from the Unit Circle table. So for cos(30),
    * the function should return sqrt(3)/2, not 0.8660254037844386
    */
   public static String cos(int angle) {
      //angle = coterminalIn0to360(angle);
      int angleLoc = anglesInDegrees.indexOf(angle);
      if (angleLoc == -1)
         return "Not on Unit Circle";
      return "";  //points.get(angleLoc).????;  //<--replace ???? and uncomment.
   }
  
   // Make this function call the degree version.  
   public static String cos(double angle) {
      return "";
   }
         
   public static String sin(int angle) {
      //angle = coterminalIn0to360(angle);
      int angleLoc = anglesInDegrees.indexOf(angle);
      if (angleLoc == -1)
         return "Not on Unit Circle";     
      return "";  //points.get(angleLoc).????;  //<--replace ???? and uncomment.
   }      
 
   // Make this function call the degree version.  
   public static String sin(double angle) {
      return "";
   }
   
   public static String tan(int angle) {
      angle = coterminalIn0to360(angle);
      int angleLoc = anglesInDegrees.indexOf(angle);
      if (angleLoc == -1)
         return "Not on Unit Circle";
      return "";  //points.get(angleLoc).????;  //<--replace ???? and uncomment.
   }      
   
   // Make this function call the degree version.  
   public static String tan(double angle) {
      return "";
   }

   /* EXPRESSING TRIG FUNCTIONS IN TERMS OF REFERENCE ANGLES */

   //Returns a quadrant 1, 2, 3, or 4 for the given angle.
   //Returns zero for a quadrantal angle.
   public static int getQuadrant(int angle) {
      angle = coterminalIn0to360(angle);
      if (isQuadrantal(angle))
         return 0;
      else if(angle > 0 && angle < 90)
         return 1;
      else if(angle > 90 && angle < 180)
         return 2;
      else if(angle > 180 && angle < 270)
         return 3;
      else if(angle > 270 && angle < 360)
         return 4;
      return -1;
   }
   
   public static int getQuadrant(double angle) {
      angle = coterminalIn0to2PI(angle);
      if (isQuadrantal(angle))
         return 0;
      else if(angle > 0.0 && angle < PI/2)
         return 1;
      else if(angle > PI/2 && angle < PI)
         return 2;
      else if(angle > PI && angle < 3*PI/2)
         return 3;
      else if(angle > 3*PI/2 && angle < 2*PI)
         return 4;
      return -1;
   }
 
   /* Expresses the given trig function in terms of the same
    * trig function applied to the reference angle for the
    * given angle, and with the correct sign for the quadrant
    * of the given angle.
    *
    *  Examples in degrees: 
    *    sin(210) = -sin(30)  b.c. sine is negative in the 3rd quadrant.
    *    cos(-45) = cos(45)   b.c. cosine is positive in the 4th quadrant.
    *    tan(495) = -tan(45)  b.c. tangent is negative in the 3rd quadrant.
    *
    *  Same examples in radians: 
    *    sin(7pi/6) = -sin(pi/6)  b.c. sine is negative in the 3rd quadrant.
    *    cos(-pi/4) = cos(pi/4)   b.c. cosine is positive in the 4th quadrant.
    *    tan(11pi/4) = -tan(pi/4) b.c. tangent is negative in the 3rd quadrant.
    */   
   public static String cosInTermsOfReferenceAngle(int angle) {
      angle = coterminalIn0to360(angle);
      int quadrant = getQuadrant(angle);
      String sign = "";
      if (cosineSigns[quadrant] == -1)
         sign = "-";
      angle = referenceAngle(angle);
      return sign + "cos(" + angle + ")"; 
   }
     
   public static String cosInTermsOfReferenceAngle(double angle) {
      angle = coterminalIn0to2PI(angle);
      int quadrant = getQuadrant(angle);
      String sign = "";
      if (cosineSigns[quadrant] == -1)
         sign = "-";
      angle = referenceAngle(angle);
      return sign + "cos(" + getNamedValueAtAngle(angle, "nameOfAngleInRadians") + ")"; 
   }
     
   public static String sinInTermsOfReferenceAngle(int angle) {
      return ""; 
   }
     
   public static String sinInTermsOfReferenceAngle(double angle) {
      return ""; 
   }
     
   public static String tanInTermsOfReferenceAngle(int angle) {
      return ""; 
   }
     
   public static String tanInTermsOfReferenceAngle(double angle) {
      return ""; 
   }


   /*     HELPER FUNCTIONS     */
   
   /* Note that this function has package-level access, which means it  
    * can be accessed from another class in the same package (folder),  
    * but nowhere else.
    *
    * Also note that this function uses reflection to access the 
    * requested instance variable of the given UnitCirclePoint object.
   */ 
   static String getNamedValueAtAngle(int angle, String value) {
      int angleLoc = anglesInDegrees.indexOf( angle );
      if (angleLoc == -1)
         return "Not on Unit Circle";
      UnitCirclePoint point = points.get(angleLoc);
      try {
         return point.getClass().getField(value).get(point).toString(); 
      }
      catch (ReflectiveOperationException e) {
         out.println("That field doesn't exist for a UnitCirclePoint object.");
         return "";
      }
   }

   static String getNamedValueAtAngle(double angle, String value) {
      int angleLoc = indexOfDouble(angle);
      if (angleLoc == -1)
         return "Not on Unit Circle";
      UnitCirclePoint point = points.get(angleLoc);
      try {
         return point.getClass().getField(value).get(point).toString(); 
      }
      catch (ReflectiveOperationException e) {
         out.println("That field doesn't exist for a UnitCirclePoint object.");
         return "";
      }
   }
   
   private static int indexOfDouble(double angle) {
      for (int i=0; i<anglesInRadians.size(); ++i) {
         Double d = anglesInRadians.get(i);
         if (Math.abs(angle - d) <= 1E-6)
            return i;
      }
      return -1;
   }
}