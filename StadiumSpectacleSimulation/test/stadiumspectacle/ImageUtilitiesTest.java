/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author syedasm
 */
public class ImageUtilitiesTest {

    public ImageUtilitiesTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getBufferedImage method, of class ImageUtilities.
     */
    @Test
    public void testGetBufferedImage() {
        System.out.println("getBufferedImage");
        String imageFile = "";
        Component c = null;
        BufferedImage expResult = null;
        BufferedImage result = ImageUtilities.getBufferedImage(imageFile, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of waitForImage method, of class ImageUtilities.
     */
    @Test
    public void testWaitForImage() {
        System.out.println("waitForImage");
        Image image = null;
        Component c = null;
        boolean expResult = false;
        boolean result = ImageUtilities.waitForImage(image, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of waitForImages method, of class ImageUtilities.
     */
    @Test
    public void testWaitForImages() {
        System.out.println("waitForImages");
        Image[] images = null;
        Component c = null;
        boolean expResult = false;
        boolean result = ImageUtilities.waitForImages(images, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}