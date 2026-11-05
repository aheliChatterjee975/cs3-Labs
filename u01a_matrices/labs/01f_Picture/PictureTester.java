/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 *
 * @author Barbara Ericson
 */
public class PictureTester {
   /**
     * Main method for testing. Every class can have a main method in Java
     */
   public static void main(String[] args) {
      // You will implement the methods in the Picture class
      // and test them by uncommenting the calls below.
      // Start by running testExplorer, then comment it out
      // and uncomment testZeroBlue, which has already been
      // implemented.
   
      //*** ACTIVITY 3 ***
      testExplorer();
      //*** ACTIVITY 5 ***
      //testZeroBlue();
      //testZeroGreen();
      //testZeroRed();
      //testKeepOnlyBlue();
      //testKeepOnlyRed();
      //testKeepOnlyGreen();
      //testNegate();
      //testGrayscale();
      //testFixUnderwater();      
      
      //testSwitchColors();
      
      //*** ACTIVITY 6 ***
      //testMirrorLeftToRight();
      //testMirrorRightToLeft();
      //testMirrorTopToBottom();
      //testMirrorBottomToTop();
      //testMirrorDiagonal();
      //testHorizontalReflection();
      //testVerticalReflection();
      
      //testRotate90Right();
      //testRotate90Left();
            
      //testMirrorTemple();
      //testMirrorArms();
      //testMirrorGull();
      //testCollage();
      //testCopy();
      //testEdgeDetection();
      //testEdgeDetection2();
      //testScale();

      /**  Extensions  **/
      //testChromakey();
      //testEncodeAndDecode();

      //testGetCountRedOverValue(250);
      //testSetRedToHalfValueInTopHalf();
      //testClearBlueOverValue(200);
      //testGetAverageForColumn(0);
   }
   
   /**
     * Method to test the PictureExplorer
     */
   public static void testExplorer() {
      Picture beach = new Picture("beach.jpg");
      beach.explore();   
   }
    
   /** Method to test zeroBlue */
   public static void testZeroBlue()
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.zeroBlue();
      beach.explore2();
   }
   
   /** Method to test keepOnlyBlue */
   public static void testKeepOnlyBlue()
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.keepOnlyBlue();
      beach.explore2();
   }
   
   /** Method to test keepOnlyGreen */
   public static void testKeepOnlyGreen()
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.keepOnlyGreen();
      beach.explore2();
   }
   
   /** Method to test negate */
   public static void testNegate()
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.negate();
      beach.explore2();
   }
   
   /** Method to test grayscale */
   public static void testGrayscale()
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.grayscale();
      beach.explore2();
   }
   
   /** Method to test keepOnlyRed */
   public static void testKeepOnlyRed()
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.keepOnlyRed();
      beach.explore2();
   }
   
   /** Method to test fixUnderwater */
   public static void testFixUnderwater()
   {
      Picture water = new Picture("water.jpg");
      water.explore();
      water.fixUnderwater();
      water.explore2();
   }
   
   /** Method to test mirrorLeftToRight */
   public static void testMirrorLeftToRight()
   {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorLeftToRight();
      caterpillar.explore2();
   }
   
   /** Method to test mirrorRightToLeft */
   public static void testMirrorRightToLeft()
   {
      Picture swan = new Picture("swan.jpg");
      swan.explore();
      swan.mirrorRightToLeft();
      swan.explore2();
   }
   
   /** Method to test mirrorTopToBottom */
   public static void testMirrorTopToBottom()
   {
      Picture cycle = new Picture("redMotorcycle.jpg");
      cycle.explore();
      cycle.mirrorTopToBottom();
      cycle.explore2();
   }
   
   /** Method to test mirrorBottomToTop */
   public static void testMirrorBottomToTop()
   {
      Picture swan = new Picture("swan.jpg");
      swan.explore();
      swan.mirrorBottomToTop();
      swan.explore2();
   }
   
   /** Method to test mirrorDiagonal */
   public static void testMirrorDiagonal()
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.mirrorDiagonal();
      beach.explore2();
   }
   
   /** Method to test horizontalReflection */
   public static void testHorizontalReflection()
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.horizontalReflection();
      beach.explore2();
   }
     
   /** Method to test verticalReflection */
   public static void testVerticalReflection()
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.verticalReflection();
      beach.explore2();
   }
     
   /** Method to test mirrorTemple */
   public static void testMirrorTemple()
   {
      Picture temple = new Picture("temple.jpg");
      temple.explore();
      temple.mirrorTemple();
      temple.explore2();
   }
   
   /** Method to test mirrorArms */
   public static void testMirrorArms()
   {
      Picture snowman = new Picture("snowman.jpg");
      snowman.explore();
      snowman.mirrorArms();
      snowman.explore2();
   }
   
   /** Method to test mirrorGull */
   public static void testMirrorGull()
   {
      Picture gull = new Picture("seagull.jpg");
      gull.explore();
      gull.mirrorGull();
      gull.explore2();
   }
   
   /** Method to test the collage method */
   public static void testCollage()
   {
      Picture canvas = new Picture("640x480.jpg");
      canvas.createCollage();
      canvas.explore2();
   }
   
   /** Method to test copy */
   public static void testCopy()
   {
      Picture katie = new Picture("KatieFancy.jpg");
      Picture blank = new Picture("640x480.jpg");
      blank.copy(katie, 4,67,75,129,10,10);
      blank.show();
   }
          
   
   /** Method to test edgeDetection */
   public static void testEdgeDetection()
   {
      Picture swan = new Picture("swan.jpg");
      swan.explore();      
      swan.edgeDetection(10);
      swan.explore2();
   }
   
   /** Method to test edgeDetection2 */
   public static void testEdgeDetection2()
   {
      Picture swan = new Picture("swan.jpg");
      swan.explore();
      swan.edgeDetection2(10);
      swan.explore2();
   }
   
   /** Method to test chromakey */
   public static void testChromakey()
   {
      Picture mark = new Picture("blue-mark.jpg");
      Picture moon = new Picture("moon-surface.jpg");
      mark.explore();
      mark.chromakey(moon);
      mark.explore2();
   }
   
   /** Method to test encode and decode */
   public static void testEncodeAndDecode()
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      Picture message = new Picture("msg.jpg");
      beach.encode(message);
      beach.explore2();
      Picture decoded = beach.decode();
      decoded.explore3();
   }
   
   /** Method to test rotate90Right */
   public static void testRotate90Right()
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      Picture beach2 = beach.rotate90Right();
      beach2.explore2();
   }  
   
   /** Method to test rotate90Left */
   public static void testRotate90Left()
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      Picture beach2 = beach.rotate90Left();
      beach2.explore2();
   }     
   
   /** Method to test getCountRedOverValue */
   public static void testGetCountRedOverValue(int value)
   {
      Picture beach = new Picture("beach.jpg");
      int count = beach.getCountRedOverValue(value);
      System.out.println(count);
   }
   
   /** Method to test setRedToHalfValueInTopHalf */
   public static void testSetRedToHalfValueInTopHalf()
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.setRedToHalfValueInTopHalf();
      beach.explore2();
   }
   
   /** Method to test clearBlueOverValue */
   public static void testClearBlueOverValue(int value)
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.clearBlueOverValue(value);
      beach.explore2();
   }
   
   /** Method to test getAverageForColumn */
   public static void testGetAverageForColumn(int col) 
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      int[] avgArray = beach.getAverageForColumn(col);
      for (int i = 0; i < 5; i++)
      {
         System.out.println(avgArray[i]);
      }
   }

   public static void testScale() {
      Picture temple = new Picture("temple.jpg");
      temple.explore();
      Picture temple2 = temple.scale(0.5, 0.5);
      temple2.explore2();
   }  
}
