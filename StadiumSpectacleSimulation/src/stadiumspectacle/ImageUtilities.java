/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

import java.awt.*;
import java.awt.image.*;

/** A class that simplifies a few common image operations, in
 *  particular creating a BufferedImage from an image file, and
 *  using MediaTracker to wait until an image or several images are
 *  done loading.
 *
 *  From tutorial on learning Java2D at
 *  http://www.apl.jhu.edu/~hall/java/Java2D-Tutorial.html
 *
 * 1998 Marty Hall, http://www.apl.jhu.edu/~hall/java/
 */

public class ImageUtilities {

  /** Create Image from a file, then turn that into a BufferedImage.
   * @param imageFile 
   * @param c
   * @return
   */

  public static BufferedImage getBufferedImage(String imageFile,
                                               Component c) {
    Image image = c.getToolkit().getImage(imageFile);
    waitForImage(image, c);
    BufferedImage bufferedImage =
      new BufferedImage(image.getWidth(c), image.getHeight(c),
                        BufferedImage.TYPE_INT_RGB);
    Graphics2D g2d = bufferedImage.createGraphics();
    g2d.drawImage(image, 0, 0, c);
    return(bufferedImage);
  }

  /** Take an Image associated with a file, and wait until it is
   *  done loading. Just a simple application of MediaTracker.
   *  If you are loading multiple images, don't use this
   *  consecutive times; instead use the version that takes
   *  an array of images.
   * @param image
   * @param c
   * @return
   */

  public static boolean waitForImage(Image image, Component c) {
    MediaTracker tracker = new MediaTracker(c);
    tracker.addImage(image, 0);
    try {
      tracker.waitForAll();
    } catch(InterruptedException ie) {}
    return(!tracker.isErrorAny());
  }

  /** Take some Images associated with files, and wait until they
   *  are done loading. Just a simple application of MediaTracker.
   * @param images 
   * @param c
   * @return
   */

  public static boolean waitForImages(Image[] images, Component c) {
    MediaTracker tracker = new MediaTracker(c);
    for(int i=0; i<images.length; i++)
      tracker.addImage(images[i], 0);
    try {
      tracker.waitForAll();
    } catch(InterruptedException ie) {}
    return(!tracker.isErrorAny());
  }
}
