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
public class BroadcastNetworkTest {

    public BroadcastNetworkTest() {
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
     * Test of addSlave method, of class BroadcastNetwork.
     */
    @Test
    public void testAddSlave() {
        System.out.println("addSlave");
        Badge badge = null;
        BroadcastNetwork instance = new BroadcastNetwork();
        instance.addSlave(badge);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSlave method, of class BroadcastNetwork.
     */
    @Test
    public void testGetSlave() {
        System.out.println("getSlave");
        int address = 0;
        BroadcastNetwork instance = new BroadcastNetwork();
        Badge expResult = null;
        Badge result = instance.getSlave(address);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNetworkOfSlaves method, of class BroadcastNetwork.
     */
    @Test
    public void testGetNetworkOfSlaves() {
        System.out.println("getNetworkOfSlaves");
        BroadcastNetwork instance = new BroadcastNetwork();
        ArrayList expResult = null;
        ArrayList result = instance.getNetworkOfSlaves();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class BroadcastNetwork.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BroadcastNetwork instance = new BroadcastNetwork();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class BroadcastNetwork.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BroadcastNetwork instance = new BroadcastNetwork();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sizeOfNetwork method, of class BroadcastNetwork.
     */
    @Test
    public void testSizeOfNetwork() {
        System.out.println("sizeOfNetwork");
        BroadcastNetwork instance = new BroadcastNetwork();
        int expResult = 0;
        int result = instance.sizeOfNetwork();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearNetwork method, of class BroadcastNetwork.
     */
    @Test
    public void testClearNetwork() {
        System.out.println("clearNetwork");
        BroadcastNetwork instance = new BroadcastNetwork();
        instance.clearNetwork();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}