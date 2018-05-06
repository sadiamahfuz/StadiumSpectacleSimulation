/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

import antInterface.Data;
import antInterface.PowerLevel;
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
public class PCBadgeTest {

    public PCBadgeTest() {
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
     * Test of constructMessage method, of class PCBadge.
     */
    @Test
    public void testConstructMessage() {
        System.out.println("constructMessage");
        Color ledColour = null;
        int flashDuration = 0;
        int retransmitProbability = 0;
        boolean FlashFirst = false;
        int delayBeforeTx = 0;
        PowerLevel powerLevel = null;
        int deayBeforeFlash = 0;
        int noOfHopsLeft = 0;
        PCBadge instance = new PCBadge();
        Data expResult = null;
        Data result = instance.constructMessage(ledColour, flashDuration, retransmitProbability, FlashFirst, delayBeforeTx, powerLevel, deayBeforeFlash, noOfHopsLeft);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearMessage method, of class PCBadge.
     */
    @Test
    public void testClearMessage() {
        System.out.println("clearMessage");
        PCBadge instance = new PCBadge();
        instance.clearMessage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class PCBadge.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        Data data = null;
        PCBadge instance = new PCBadge();
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PCBadge.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PCBadge instance = new PCBadge();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}