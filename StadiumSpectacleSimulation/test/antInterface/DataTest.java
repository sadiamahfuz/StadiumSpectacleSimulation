/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package antInterface;

import java.awt.Color;
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
public class DataTest {

    public DataTest() {
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
     * Test of isFlashFirst method, of class Data.
     */
    @Test
    public void testIsFlashFirst() {
        System.out.println("isFlashFirst");
        Data instance = null;
        boolean expResult = false;
        boolean result = instance.isFlashFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFlashFirst method, of class Data.
     */
    @Test
    public void testSetFlashFirst() {
        System.out.println("setFlashFirst");
        boolean FlashFirst = false;
        Data instance = null;
        instance.setFlashFirst(FlashFirst);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDelayBeforeFlash method, of class Data.
     */
    @Test
    public void testIsDelayBeforeFlash() {
        System.out.println("isDelayBeforeFlash");
        Data instance = null;
        int expResult = 0;
        int result = instance.isDelayBeforeFlash();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDelayBeforeFlash method, of class Data.
     */
    @Test
    public void testSetDelayBeforeFlash() {
        System.out.println("setDelayBeforeFlash");
        int delayBeforeFlash = 0;
        Data instance = null;
        instance.setDelayBeforeFlash(delayBeforeFlash);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDelayBeforeTx method, of class Data.
     */
    @Test
    public void testGetDelayBeforeTx() {
        System.out.println("getDelayBeforeTx");
        Data instance = null;
        int expResult = 0;
        int result = instance.getDelayBeforeTx();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDelayBeforeTx method, of class Data.
     */
    @Test
    public void testSetDelayBeforeTx() {
        System.out.println("setDelayBeforeTx");
        int delayBeforeTx = 0;
        Data instance = null;
        instance.setDelayBeforeTx(delayBeforeTx);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFlashDuration method, of class Data.
     */
    @Test
    public void testGetFlashDuration() {
        System.out.println("getFlashDuration");
        Data instance = null;
        int expResult = 0;
        int result = instance.getFlashDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFlashDuration method, of class Data.
     */
    @Test
    public void testSetFlashDuration() {
        System.out.println("setFlashDuration");
        int flashDuration = 0;
        Data instance = null;
        instance.setFlashDuration(flashDuration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLedColour method, of class Data.
     */
    @Test
    public void testGetLedColour() {
        System.out.println("getLedColour");
        Data instance = null;
        Color expResult = null;
        Color result = instance.getLedColour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLedColour method, of class Data.
     */
    @Test
    public void testSetLedColour() {
        System.out.println("setLedColour");
        Color ledColour = null;
        Data instance = null;
        instance.setLedColour(ledColour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNoOfHopsLeft method, of class Data.
     */
    @Test
    public void testGetNoOfHopsLeft() {
        System.out.println("getNoOfHopsLeft");
        Data instance = null;
        int expResult = 0;
        int result = instance.getNoOfHopsLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNoOfHopsLeft method, of class Data.
     */
    @Test
    public void testSetNoOfHopsLeft() {
        System.out.println("setNoOfHopsLeft");
        int noOfHopsLeft = 0;
        Data instance = null;
        instance.setNoOfHopsLeft(noOfHopsLeft);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPowerLevel method, of class Data.
     */
    @Test
    public void testGetPowerLevel() {
        System.out.println("getPowerLevel");
        Data instance = null;
        PowerLevel expResult = null;
        PowerLevel result = instance.getPowerLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPowerLevel method, of class Data.
     */
    @Test
    public void testSetPowerLevel() {
        System.out.println("setPowerLevel");
        PowerLevel powerLevel = null;
        Data instance = null;
        instance.setPowerLevel(powerLevel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRetransmitProbability method, of class Data.
     */
    @Test
    public void testGetRetransmitProbability() {
        System.out.println("getRetransmitProbability");
        Data instance = null;
        int expResult = 0;
        int result = instance.getRetransmitProbability();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRetransmitProbability method, of class Data.
     */
    @Test
    public void testSetRetransmitProbability() {
        System.out.println("setRetransmitProbability");
        int retransmitProbability = 0;
        Data instance = null;
        instance.setRetransmitProbability(retransmitProbability);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskID method, of class Data.
     */
    @Test
    public void testGetTaskID() {
        System.out.println("getTaskID");
        Data instance = null;
        int expResult = 0;
        int result = instance.getTaskID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskID method, of class Data.
     */
    @Test
    public void testSetTaskID() {
        System.out.println("setTaskID");
        int taskID = 0;
        Data instance = null;
        instance.setTaskID(taskID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}