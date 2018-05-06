/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

import antInterface.Data;
import java.awt.Color;
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
public class BadgeTest {

    public BadgeTest() {
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
     * Test of getLight method, of class Badge.
     */
    @Test
    public void testGetLight() {
        System.out.println("getLight");
       Badge instance = new Badge(0,0);
        Ellipse2D.Double expResult = new Ellipse2D.Double(0,0,5,5);
        Ellipse2D.Double result = instance.getLight();
        assertEquals(expResult, result);

    }

    /**
     * Test of getLocation method, of class Badge.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Badge instance = new Badge(0,0);
        int[] expResult = {(0-15)/17, (0-150)/17};
        int[] result = instance.getLocation();
        System.out.println(result[1]);
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of openAuto method, of class Badge.
     */
    @Test
    public void testOpenAuto() {
        System.out.println("openAuto");
        int x = 0;
        Badge instance = new Badge(0,0);
        int expResult = 0;
        int result = instance.openAuto(x);
        assertEquals(expResult, result);
  
    }

    /**
     * Test of BroadcastShared method, of class Badge.
     */
    @Test
    public void testBroadcastShared() {
        System.out.println("BroadcastShared");
        int address = 0;
        Badge instance = new Badge(0,0);
        int expResult = 0;
        int result = instance.BroadcastShared(address);
        assertEquals(expResult, result);

    }

    /**
     * Test of setLightColour method, of class Badge.
     */
    @Test
    public void testSetLightColour() {
        System.out.println("setLightColour");
        Color colour = Color.green;
        Badge instance = new Badge(0,0);
        instance.setLightColour(colour);
        assertEquals(colour, instance.getLightColour());
    }

    /**
     * Test of getLightColour method, of class Badge.
     */
    @Test
    public void testGetLightColour() {
        System.out.println("getLightColour");
        Badge instance = new Badge(0,0);
        Color expResult = Color.black;
        Color result = instance.getLightColour();
        assertEquals(expResult, result);
     
    }


    /**
     * Test of setTaskID method, of class Badge.
     */
    @Test
    public void testSetTaskID() {
        System.out.println("setTaskID");
        int taskID = 0;
        Badge instance = new Badge(0,0);
        assertEquals(taskID, instance.getTaskID());

    }

    /**
     * Test of getTaskID method, of class Badge.
     */
    @Test
    public void testGetTaskID() {
        System.out.println("getTaskID");
        Badge instance = new Badge(0,0);
        int expResult = 0;
        int result = instance.getTaskID();
        assertEquals(expResult, result);
    }

}