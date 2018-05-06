/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

import antInterface.Data;
import antInterface.PowerLevel;
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
public class RFActivityTest {

    public RFActivityTest() {
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
     * Test of createAuto method, of class RFActivity.
     */
    @Test
    public void testCreateAuto() {
        System.out.println("createAuto");
        Badge b = null;
        int x = 0;
        JTextArea a = null;
        RFActivity instance = null;
        AutoSharedSlave expResult = null;
        AutoSharedSlave result = instance.createAuto(b, x, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createBroadcastNetwork method, of class RFActivity.
     */
    @Test
    public void testCreateBroadcastNetwork() {
        System.out.println("createBroadcastNetwork");
        Badge b = null;
        RFActivity instance = null;
        BroadcastNetwork expResult = null;
        BroadcastNetwork result = instance.createBroadcastNetwork(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BroadcastPC method, of class RFActivity.
     */
    @Test
    public void testBroadcastPC() {
        System.out.println("BroadcastPC");
        Data data = null;
        RFActivity instance = null;
        BroadcastNetwork expResult = null;
        BroadcastNetwork result = instance.BroadcastPC(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configurePC method, of class RFActivity.
     */
    @Test
    public void testConfigurePC() {
        System.out.println("configurePC");
        Data data = null;
        PowerLevel level = null;
        RFActivity instance = null;
        instance.configurePC(data, level);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}