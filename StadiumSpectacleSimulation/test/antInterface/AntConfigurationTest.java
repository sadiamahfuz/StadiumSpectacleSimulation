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
public class AntConfigurationTest {

    public AntConfigurationTest() {
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
     * Test of unAssignChannel method, of class AntConfiguration.
     */
    @Test
    public void testUnAssignChannel() {
        System.out.println("unAssignChannel");
        int channelNumber = 0;
        AntConfiguration instance = new AntConfiguration();
        instance.unAssignChannel(channelNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AssignChannel1 method, of class AntConfiguration.
     */
    @Test
    public void testAssignChannel1() {
        System.out.println("AssignChannel1");
        int channelNum = 0;
        ChannelType channelType = null;
        AntConfiguration instance = new AntConfiguration();
        instance.AssignChannel1(channelNum, channelType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AssignChannel2 method, of class AntConfiguration.
     */
    @Test
    public void testAssignChannel2() {
        System.out.println("AssignChannel2");
        int channelNum = 0;
        ChannelType channelType = null;
        AntConfiguration instance = new AntConfiguration();
        instance.AssignChannel2(channelNum, channelType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChannelID1 method, of class AntConfiguration.
     */
    @Test
    public void testSetChannelID1() {
        System.out.println("setChannelID1");
        int channelNum = 0;
        int deviceNum = 0;
        int deviceType = 0;
        int transType = 0;
        AntConfiguration instance = new AntConfiguration();
        instance.setChannelID1(channelNum, deviceNum, deviceType, transType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChannelID2 method, of class AntConfiguration.
     */
    @Test
    public void testSetChannelID2() {
        System.out.println("setChannelID2");
        int channelNum = 0;
        int deviceNum = 0;
        int deviceType = 0;
        int transType = 0;
        AntConfiguration instance = new AntConfiguration();
        instance.setChannelID2(channelNum, deviceNum, deviceType, transType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChannelPeriod method, of class AntConfiguration.
     */
    @Test
    public void testSetChannelPeriod() {
        System.out.println("setChannelPeriod");
        int period = 0;
        AntConfiguration instance = new AntConfiguration();
        instance.setChannelPeriod(period);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChannelRFfreq method, of class AntConfiguration.
     */
    @Test
    public void testSetChannelRFfreq() {
        System.out.println("setChannelRFfreq");
        int freq = 0;
        AntConfiguration instance = new AntConfiguration();
        instance.setChannelRFfreq(freq);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChannelTxPower method, of class AntConfiguration.
     */
    @Test
    public void testSetChannelTxPower() {
        System.out.println("setChannelTxPower");
        PowerLevel power = null;
        AntConfiguration instance = new AntConfiguration();
        instance.setChannelTxPower(power);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AntConfiguration.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AntConfiguration instance = new AntConfiguration();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChannelAssigned1 method, of class AntConfiguration.
     */
    @Test
    public void testGetChannelAssigned1() {
        System.out.println("getChannelAssigned1");
        AntConfiguration instance = new AntConfiguration();
        Channel expResult = null;
        Channel result = instance.getChannelAssigned1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChannelAssigned2 method, of class AntConfiguration.
     */
    @Test
    public void testGetChannelAssigned2() {
        System.out.println("getChannelAssigned2");
        AntConfiguration instance = new AntConfiguration();
        Channel expResult = null;
        Channel result = instance.getChannelAssigned2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChannelID method, of class AntConfiguration.
     */
    @Test
    public void testGetChannelID() {
        System.out.println("getChannelID");
        AntConfiguration instance = new AntConfiguration();
        ChannelID expResult = null;
        ChannelID result = instance.getChannelID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChannelID2 method, of class AntConfiguration.
     */
    @Test
    public void testGetChannelID2() {
        System.out.println("getChannelID2");
        AntConfiguration instance = new AntConfiguration();
        ChannelID expResult = null;
        ChannelID result = instance.getChannelID2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChannelPeriod method, of class AntConfiguration.
     */
    @Test
    public void testGetChannelPeriod() {
        System.out.println("getChannelPeriod");
        AntConfiguration instance = new AntConfiguration();
        int expResult = 0;
        int result = instance.getChannelPeriod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChannelRF method, of class AntConfiguration.
     */
    @Test
    public void testGetChannelRF() {
        System.out.println("getChannelRF");
        AntConfiguration instance = new AntConfiguration();
        int expResult = 0;
        int result = instance.getChannelRF();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLevel method, of class AntConfiguration.
     */
    @Test
    public void testGetLevel() {
        System.out.println("getLevel");
        AntConfiguration instance = new AntConfiguration();
        PowerLevel expResult = null;
        PowerLevel result = instance.getLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}