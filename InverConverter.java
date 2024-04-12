import edu.duke.*;
public class InverConverter {


    public ImageResource makeGray (ImageResource inImage) {

        ImageResource outImage = 
        new ImageResource (inImage.getWidth(), inImage.getWidth());
        for (Pixel pixel : outImage.pixels()) {
            //перегляньте відповідний піксель у inImage:
            Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
            
          
            
            int invertedRed = 255 - inPixel.getRed();  //(5)
            int invertedBlue = 255 - inPixel.getBlue();  //(230)
            int invertedGreen = 255 - inPixel.getGreen(); //(110)
            
            pixel.setRed(invertedRed);
            pixel.setGreen(invertedBlue);
            pixel.setBlue(invertedGreen);
        }
        return outImage;
    }
 
    public void testGray () {
        ImageResource im = new ImageResource ();
        ImageResource gray = makeGray (im);
        gray.draw();
    }
}