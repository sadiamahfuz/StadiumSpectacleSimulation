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
public class ChannelTypeTest {

    public ChannelTypeTest() {
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
     * Test of values method, of class ChannelType.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        ChannelType[] expResult = null;
        ChannelType[] result = ChannelType.values();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class ChannelType.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        ChannelType expResult = null;
        ChannelType result = ChannelType.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of channelType method, of class ChannelType.
     */
    @Test
    public void testChannelType() {
        System.out.println("channelType");
        ChannelType instance = null;
        int expResult = 0;
        int result = instance.channelType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ChannelType.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ChannelType instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}