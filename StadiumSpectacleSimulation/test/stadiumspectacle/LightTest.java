/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
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
public class LightTest {

    public LightTest() {
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
     * Test of getLight method, of class Light.
     */
    @Test
    public void testGetLight() {
        System.out.println("getLight");
        Light instance = new Light(0,0);
       Ellipse2D.Double expResult = new Ellipse2D.Double(0,0,5,5);
        Ellipse2D.Double result = instance.getLight();
        assertEquals(expResult, result);
       
    }

}