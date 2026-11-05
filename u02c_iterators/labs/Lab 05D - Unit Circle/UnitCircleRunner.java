import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class UnitCircleRunner
{
   public static void main ( String[] args )
   {
      out.println("The Unit Circle:");
      UnitCircle.printValues();
      pause();
      out.println("\nTest Quadrantal Angles:");
      out.println("Quadrantal angles in degrees: " + UnitCircle.listQuadrantalAnglesInDegrees());
      out.println("Quadrantal angles in radians: " + UnitCircle.listQuadrantalAnglesInRadians());
      pause();
      out.println("\nTest Coterminal Angles:");
      out.println("90 is coterminal with 810? " + UnitCircle.areCoterminal(90, 810));
      out.println("90 is coterminal with 710? " + UnitCircle.areCoterminal(90, 710));
      out.println("-10 is coterminal with 710? " + UnitCircle.areCoterminal(-10, 710));
      out.println("Find angle in [0, 360) coterminal with 710: " + UnitCircle.coterminalIn0to360(710));
      out.println("Find angle in [0, 360) coterminal with -10: " + UnitCircle.coterminalIn0to360(-10));
      String cotermWith12pi = UnitCircle.getNamedValueAtAngle(UnitCircle.coterminalIn0to360(12*PI), "nameOfAngleInRadians");
      out.println("Find angle in [0, 2pi) coterminal with 12pi: " + cotermWith12pi);
      String cotermWith_3PI4 = UnitCircle.getNamedValueAtAngle(UnitCircle.coterminalIn0to360(-3*PI/4), "nameOfAngleInRadians");
      out.println("Find angle in [0, 2pi) coterminal with -3*pi/4: " + cotermWith_3PI4);
      pause();
      out.println("\nTest Reference Angles:");
      out.println("The reference angle for 70 degrees is: " + UnitCircle.referenceAngle(70));
      out.println("The reference angle for 170 degrees is: " + UnitCircle.referenceAngle(170));
      out.println("The reference angle for 230 degrees is: " + UnitCircle.referenceAngle(230));
      out.println("The reference angle for 328 degrees is: " + UnitCircle.referenceAngle(328));
      String refAngle_3PI4 = UnitCircle.getNamedValueAtAngle(UnitCircle.referenceAngle(-3*PI/4), "nameOfAngleInRadians");
      out.println("The reference angle for -3pi/4 is: " + refAngle_3PI4);
      String refAngle5PI6 = UnitCircle.getNamedValueAtAngle(UnitCircle.referenceAngle(5*PI/6), "nameOfAngleInRadians");
      out.println("The reference angle for 5pi/6 degrees is: " + refAngle5PI6);
      pause();
      out.println("\nTest Trig Functions:");
      out.println("cos(-120) = " + UnitCircle.cos(-120));
      out.println("sin(120) = " + UnitCircle.sin(120));
      out.println("tan(495) = " + UnitCircle.tan(495));
      out.println("cos(pi/2) = " + UnitCircle.cos(PI/2));
      out.println("sin(-7pi/6) = " + UnitCircle.sin(-7*PI/6));
      out.println("tan(9pi/4) = " + UnitCircle.tan(9*PI/4));
      pause();
      out.println("\nTest Trig Functions:");
      out.println("cos(-120) = " + UnitCircle.cosInTermsOfReferenceAngle(-120));
      out.println("sin(120) = " + UnitCircle.sinInTermsOfReferenceAngle(120));
      out.println("tan(495) = " + UnitCircle.tanInTermsOfReferenceAngle(495));
      out.println("cos(-pi/4) = " + UnitCircle.cosInTermsOfReferenceAngle(-PI/4));
      out.println("cos(3pi/2) = " + UnitCircle.cosInTermsOfReferenceAngle(3*PI/2));
      out.println("sin(-5pi/6) = " + UnitCircle.sinInTermsOfReferenceAngle(-5*PI/6));
      out.println("tan(9pi/4) = " + UnitCircle.tanInTermsOfReferenceAngle(9*PI/4));
      
      
   }
   
   public static void pause() {
      System.out.println("\n--------------------------");
      System.out.println("Press ENTER to continue...");
      System.out.println("--------------------------");
      new Scanner(System.in).nextLine();
   }
}