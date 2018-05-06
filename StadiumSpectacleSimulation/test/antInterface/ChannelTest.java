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
public class ChannelTest {

    public ChannelTest() {
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
     * Test of getChannelNumber method, of class Channel.
     */
    @Test
    public void testGetChannelNumber() {
        System.out.println("getChannelNumber");
        Channel instance = new Channel();
        int expResult = 0;
        int result = instance.getChannelNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChannelNumber method, of class Channel.
     */
    @Test
    public void testSetChannelNumber() {
        System.out.println("setChannelNumber");
        int channelNumber = 0;
        Channel instance = new Channel();
        instance.setChannelNumber(channelNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChannelType method, of class Channel.
     */
    @Test
    public void testGetChannelType() {
        System.out.println("getChannelType");
        Channel instance = new Channel();
        ChannelType expResult = null;
        ChannelType result = instance.getChannelType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChannelType method, of class Channel.
     */
    @Test
    public void testSetChannelType() {
        System.out.println("setChannelType");
        ChannelType channelType = null;
        Channel instance = new Channel();
        instance.setChannelType(channelType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class Channel.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        Channel instance = new Channel();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Channel.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Channel instance = new Channel();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}