import edu.duke.*;

public class GrayScaleConverter {

    public ImageResource makeGray (ImageResource inImage) {

        ImageResource outImage = 
        new ImageResource (inImage.getWidth(), inImage.getWidth());
        for (Pixel pixel : outImage.pixels()) {
            //перегляньте відповідний піксель у inImage:
            Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
            
            int average = (inPixel.getRed() + inPixel.getBlue() + 
            + inPixel.getGreen())/3;
            
            pixel.setRed(average);
            pixel.setGreen(average);
            pixel.setBlue(average);
        }
        return outImage;
    }
 
    public void testGray () {
        ImageResource im = new ImageResource ();
        ImageResource gray = makeGray (im);
        gray.draw();
        
        
        
        
    }
}