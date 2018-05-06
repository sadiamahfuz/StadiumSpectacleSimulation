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
public class ChannelIDTest {

    public ChannelIDTest() {
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
     * Test of setChannelNumber method, of class ChannelID.
     */
    @Test
    public void testSetChannelNumber() {
        System.out.println("setChannelNumber");
        int channelNumber = 0;
        ChannelID instance = new ChannelID();
        instance.setChannelNumber(channelNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeviceNumber method, of class ChannelID.
     */
    @Test
    public void testSetDeviceNumber() {
        System.out.println("setDeviceNumber");
        int deviceNumber = 0;
        ChannelID instance = new ChannelID();
        instance.setDeviceNumber(deviceNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeviceType method, of class ChannelID.
     */
    @Test
    public void testSetDeviceType() {
        System.out.println("setDeviceType");
        int deviceType = 0;
        ChannelID instance = new ChannelID();
        instance.setDeviceType(deviceType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTransmissionType method, of class ChannelID.
     */
    @Test
    public void testSetTransmissionType() {
        System.out.println("setTransmissionType");
        int transmissionType = 0;
        ChannelID instance = new ChannelID();
        instance.setTransmissionType(transmissionType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChannelNumber method, of class ChannelID.
     */
    @Test
    public void testGetChannelNumber() {
        System.out.println("getChannelNumber");
        ChannelID instance = new ChannelID();
        int expResult = 0;
        int result = instance.getChannelNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeviceNumber method, of class ChannelID.
     */
    @Test
    public void testGetDeviceNumber() {
        System.out.println("getDeviceNumber");
        ChannelID instance = new ChannelID();
        int expResult = 0;
        int result = instance.getDeviceNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeviceType method, of class ChannelID.
     */
    @Test
    public void testGetDeviceType() {
        System.out.println("getDeviceType");
        ChannelID instance = new ChannelID();
        int expResult = 0;
        int result = instance.getDeviceType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransmissionType method, of class ChannelID.
     */
    @Test
    public void testGetTransmissionType() {
        System.out.println("getTransmissionType");
        ChannelID instance = new ChannelID();
        int expResult = 0;
        int result = instance.getTransmissionType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ChannelID.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ChannelID instance = new ChannelID();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}