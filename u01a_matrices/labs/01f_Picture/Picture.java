import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.geom.AffineTransform;

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 *
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
  ///////////////////// constructors //////////////////////////////////

  /**
   * Constructor that takes no arguments
   */
  public Picture() {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();
  }

  /**
   * Constructor that takes a file name and creates the picture
   *
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName) {
    // let the parent class handle this fileName
    super(fileName);
  }

  /**
   * Constructor that takes a file name and creates the picture
   *
   * @param file the name of the file to create the picture from
   */
  public Picture(java.io.File file) {
    // let the parent class handle this fileName
    super(file);
  }

  /**
   * Constructor that takes the width and height
   * 
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int width, int height) {
    // let the parent class handle this width and height
    super(width, height);
  }

  /**
   * Constructor that takes a picture and creates a copy of that picture
   *
   * @param copyPicture the picture to copy
   */
  public Picture(SimplePicture copyPicture) {
    // let the parent class do the copy
    super(copyPicture);
  }

  /**
   * Constructor that takes a buffered image
   *
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image) {
    super(image);
  }

  ////////////////////// methods ///////////////////////////////////////
  /**
   * Method to return a string with information about this picture.
   *
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString() {
    String output = "Picture, filename " + getFileName()
                    + " height " + getHeight() + " width " + getWidth();
    return output;
  }

  /**
   * Method to set the blue to 0
   */
  public void zeroBlue() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setBlue(0);
      }
    }
  }

  /**
   * Removes all the red from this image.
   */
  public void zeroRed() {
    //TODO: Write this method.
  }

  /**
   * Removes all the green from this image.
   */
  public void zeroGreen() {
    //TODO: Write this method.   
  }

  /** 
   * Sets green and red to zero
   */
  public void keepOnlyBlue() {
    //TODO: Write this method.   
  }

  /** Method that keeps only the red color */
  public void keepOnlyRed()
  {
    //TODO: Write this method.   
  }

  /** Method that keeps only the green color */
  public void keepOnlyGreen()
  {
    //TODO: Write this method.   
  }

  /** switchColors() traverses the 2D pixel array and 
   *  switches the RGB colors:
   *     Green value becomes new Red value
   *     Blue value becomes new Green value
   *     Red value becomes new Blue value
   */
  public void switchColors()
  {
    //TODO: Write this method.   
  }

  /** negate() negates all the pixels in a picture 
   * To negate a picture, set the red value to 255 minus the current red value, 
   * the green value to 255 minus the current green value
   * and the blue value to 255 minus the current blue value.
   */
  public void negate()
  {
    //TODO: Write this method.   
  }

  /** Converts the image into shades of gray.
   *  Set the red, green, and blue values to the average of the current red, green, 
   *  and blue values for each pixel in the picture.
   */
  public void grayscale()
  {
    //TODO: Write this method.   
  }

  /**
   * Method to fix pictures taken underwater by  
   * making red 235% of the original value and green
   * and blue 65% of their original values.
   */
  public void fixUnderwater()
  {
    //TODO: Write this method.   
  }

  /**
   * Method that mirrors the picture around a vertical mirror in the center of
   * the picture from left to right
   */
  public void mirrorLeftToRight() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
   }

  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from right to left 
    */
  public void mirrorRightToLeft()
  {
    //TODO: Write this method.   
  }

  /** Method that mirrors the picture around a 
    * horizontal mirror in the center of the picture
    * from top to botttom 
    */
  public void mirrorTopToBottom()
  {
    //TODO: Write this method.   
  }

  /** Method that mirrors the picture around a 
    * horizontal mirror in the center of the picture
    * from bottom to top 
    */
  public void mirrorBottomToTop()
  {
    //TODO: Write this method.   
  }

  /** Mirror around a mirror positioned on the diagonal line
    * from bottom left to top right
    */
  public void mirrorDiagonal()
  {
    //TODO: Write this method.   
  }

  /**
   *  Creates a vertical mirror image of the this picture.
   */
  public void verticalReflection() {
    //TODO: Write this method.
  }

  /**
   * Converts this image into a horizontal mirror image of itself.
   */
  public void horizontalReflection() {
    //TODO: Write this method.
  }

  /**
   * Mirror just part of a picture of a temple
   */
  public void mirrorTemple() {
    int mirrorPoint = 276;
    Pixel[][] pixels = this.getPixels2D();
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        Pixel leftPixel = pixels[row][col];
        Pixel rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }

  /** Mirror just part of a picture of a snowman */
  public void mirrorArms()
  {
    //TODO: Write this method.
  }
   
  /** Mirror just the gull */
  public void mirrorGull()
  {
    //TODO: Write this method.
  }
   
  /** Rotates the image 90 degrees to the right. */
  public Picture rotate90Right()
  {
    //TODO: Write this method.
    return null;
  }

  /** Rotates the image 90 degrees to the right. */   
  public Picture rotate90Left()
  {
    //TODO: Write this method.
      return null;
  }
   
  /** 
   * Method to return the count of the number
   * of pixels with a red value greater than
   * the passed value
   * @param value the value to compare to
   * @return the count
   */
  public int getCountRedOverValue(int value)
  {
    //TODO: Write this method.
    return 0;
  }
   
  /** Method to set the red in the top half of the picture
    * to half the original value */
  public void setRedToHalfValueInTopHalf()
  {
    //TODO: Write this method.  
  }
   
  /** Method to clear the blue (set to 0) if it is over the passed 
    * value
    * @param value the value to compare to
    */
  public void clearBlueOverValue(int value)
  {
    //TODO: Write this method.   
  }
  
  /** Method to return the average value for the specified column
    * @param col the column index to get the average from
    * @return the average of the values in that column
    */
  public int[] getAverageForColumn(int col) 
  {
    //TODO: Write this method.
    return null;
  }  
   
  /**
    * copy from the passed fromPic to the specified startRow and startCol in the
    * current picture
    *
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, int startRow, int startCol) {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length && toRow < toPixels.length; fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length && toCol < toPixels[0].length; fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    } 
  }

   /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorTopToBottom();
    this.write("c:/Temp/collage.jpg");
  }


  /**
   * 
   * @param fromPic The source image we are copying from
   * @param destRow the start row to copy to
   * @param destCol the start col to copy to
   * @param fromRow The start row of fromPic
   * @param fromCol The start col of fromPic
   * @param w Width of the area we wish to copy.
   * @param h Height of the area we wish to copy.
   */
  public void copy(Picture fromPic, int destRow, int destCol, int fromRow, int fromCol, int w, int h) {
    //TODO: Write and test this method
  }

  /** Method to show large changes in color
    * as you go from left to right.      *
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist) {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }

  /** Method to show large changes in color
    * as you go from left to right and then
    * as you go from top to bottom.
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection2(int edgeDist)
  {
    //TODO: Write this method.   
  }

  /** Method to replace the blue background with
    * the pixels in the newBack picture
    * @param newBack the picture to copy from
    */
  public void chromakey(Picture newBack)
  {
    //TODO: Write this method.   
  }

  /** Hide a black and white message in the current
    * picture by changing the red to even and then
    * setting it to odd if the message pixel is black 
    * @param messagePict the picture with a message
    */
  public void encode(Picture messagePict)
  {
    //TODO: Write this method.   
  }

  /**
    * Method to decode a message hidden in the
    * red value of the current picture
    * @return the picture with the hidden message
    */
  public Picture decode()
  {
    //TODO: Write this method.   
    return null;
  }

  /**
   * Method to create a new picture by scaling the current picture by the given
   * x and y factors
   *
   * @param xFactor the amount to scale in x
   * @param yFactor the amount to scale in y
   * @return the resulting picture
   */
  public Picture scale(double xFactor, double yFactor) {
    // set up the scale transform
    AffineTransform scaleTransform = new AffineTransform();
    scaleTransform.scale(xFactor, yFactor);
   
    // create a new picture object that is the right size
    Picture result = new Picture((int) (getWidth() * xFactor),
                                 (int) (getHeight() * yFactor));
   
    // get the graphics 2d object to draw on the result
    Graphics graphics = result.getGraphics();
    Graphics2D g2 = (Graphics2D) graphics;
 
    // draw the current image onto the result image scaled
    g2.drawImage(getImage(), scaleTransform, null);
   
    result.setTitle(getTitle());
    return result;
  }

  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

} // this } is the end of class Picture, put all new methods before this

