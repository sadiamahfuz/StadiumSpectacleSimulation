/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

import java.util.ArrayList;
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
public class AutoSharedSlaveTest {

    public AutoSharedSlaveTest() {
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
     * Test of addSlave method, of class AutoSharedSlave.
     */
    @Test
    public void testAddSlave() {
        System.out.println("addSlave");
        Badge badge = null;
        AutoSharedSlave instance = null;
        instance.addSlave(badge);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSlave method, of class AutoSharedSlave.
     */
    @Test
    public void testGetSlave() {
        System.out.println("getSlave");
        int address = 0;
        AutoSharedSlave instance = null;
        Badge expResult = null;
        Badge result = instance.getSlave(address);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllSlaves method, of class AutoSharedSlave.
     */
    @Test
    public void testGetAllSlaves() {
        System.out.println("getAllSlaves");
        AutoSharedSlave instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getAllSlaves();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AutoSharedSlave.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AutoSharedSlave instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class AutoSharedSlave.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        AutoSharedSlave instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numberSlaves method, of class AutoSharedSlave.
     */
    @Test
    public void testNumberSlaves() {
        System.out.println("numberSlaves");
        AutoSharedSlave instance = null;
        int expResult = 0;
        int result = instance.numberSlaves();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeMaster method, of class AutoSharedSlave.
     */
    @Test
    public void testRemoveMaster() {
        System.out.println("removeMaster");
        AutoSharedSlave instance = null;
        instance.removeMaster();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}