/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package antInterface;

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
public class ChannelStateTest {

    public ChannelStateTest() {
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
     * Test of values method, of class ChannelState.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        ChannelState[] expResult = null;
        ChannelState[] result = ChannelState.values();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class ChannelState.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        ChannelState expResult = null;
        ChannelState result = ChannelState.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChannelState method, of class ChannelState.
     */
    @Test
    public void testGetChannelState() {
        System.out.println("getChannelState");
        ChannelState instance = null;
        int expResult = 0;
        int result = instance.getChannelState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}