/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JTextArea;
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
public class SpectacleObjectTest {

    public SpectacleObjectTest() {
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
     * Test of paintComponent method, of class SpectacleObject.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        SpectacleObject instance = new SpectacleObject();
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of turnAllLightsOff method, of class SpectacleObject.
     */
    @Test
    public void testTurnAllLightsOff() {
        System.out.println("turnAllLightsOff");
        SpectacleObject instance = new SpectacleObject();
        instance.turnAllLightsOff();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLightColour method, of class SpectacleObject.
     */
    @Test
    public void testSetLightColour() {
        System.out.println("setLightColour");
        Color colour = null;
        SpectacleObject instance = new SpectacleObject();
        instance.setLightColour(colour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allFlash method, of class SpectacleObject.
     */
    @Test
    public void testAllFlash() {
        System.out.println("allFlash");
        SpectacleObject instance = new SpectacleObject();
        instance.allFlash();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of randomTrace method, of class SpectacleObject.
     */
    @Test
    public void testRandomTrace() {
        System.out.println("randomTrace");
        JTextArea a = null;
        SpectacleObject instance = new SpectacleObject();
        ArrayList expResult = null;
        ArrayList result = instance.randomTrace(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fireworks method, of class SpectacleObject.
     */
    @Test
    public void testFireworks() {
        System.out.println("fireworks");
        JTextArea a = null;
        SpectacleObject instance = new SpectacleObject();
        ArrayList expResult = null;
        ArrayList result = instance.fireworks(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bloomPC method, of class SpectacleObject.
     */
    @Test
    public void testBloomPC() {
        System.out.println("bloomPC");
        JTextArea a = null;
        Color colour = null;
        int durationOfFlash = 0;
        int numOfHops = 0;
        SpectacleObject instance = new SpectacleObject();
        ArrayList expResult = null;
        ArrayList result = instance.bloomPC(a, colour, durationOfFlash, numOfHops);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of synchronousFlash method, of class SpectacleObject.
     */
    @Test
    public void testSynchronousFlash() {
        System.out.println("synchronousFlash");
        JTextArea a = null;
        Color colour = null;
        int durationOfFlash = 0;
        int numOfHops = 0;
        SpectacleObject instance = new SpectacleObject();
        ArrayList expResult = null;
        ArrayList result = instance.synchronousFlash(a, colour, durationOfFlash, numOfHops);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createBadges method, of class SpectacleObject.
     */
    @Test
    public void testCreateBadges() {
        System.out.println("createBadges");
        JTextArea a = null;
        SpectacleObject instance = new SpectacleObject();
        instance.createBadges(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialiseRFActivity method, of class SpectacleObject.
     */
    @Test
    public void testInitialiseRFActivity() {
        System.out.println("initialiseRFActivity");
        SpectacleObject instance = new SpectacleObject();
        instance.initialiseRFActivity();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of random_trace method, of class SpectacleObject.
     */
    @Test
    public void testRandom_trace() {
        System.out.println("random_trace");
        JTextArea area = null;
        Color currentColour = null;
        int flashDuration = 0;
        int numHops = 0;
        SpectacleObject instance = new SpectacleObject();
        ArrayList expResult = null;
        ArrayList result = instance.random_trace(area, currentColour, flashDuration, numHops);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bloom method, of class SpectacleObject.
     */
    @Test
    public void testBloom() {
        System.out.println("bloom");
        JTextArea area = null;
        Color currentColour = null;
        int flashDuration = 0;
        int numHops = 0;
        SpectacleObject instance = new SpectacleObject();
        ArrayList expResult = null;
        ArrayList result = instance.bloom(area, currentColour, flashDuration, numHops);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}