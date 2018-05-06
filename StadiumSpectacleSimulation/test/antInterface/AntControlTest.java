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
public class AntControlTest {

    public AntControlTest() {
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
     * Test of resetSystem method, of class AntControl.
     */
    @Test
    public void testResetSystem() {
        System.out.println("resetSystem");
        AntControl instance = new AntControl();
        instance.resetSystem();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of openChannel method, of class AntControl.
     */
    @Test
    public void testOpenChannel() {
        System.out.println("openChannel");
        int channelNumber = 0;
        AntControl instance = new AntControl();
        instance.openChannel(channelNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeChannel method, of class AntControl.
     */
    @Test
    public void testCloseChannel() {
        System.out.println("closeChannel");
        int channelNumber = 0;
        AntControl instance = new AntControl();
        instance.closeChannel(channelNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of requestMessage method, of class AntControl.
     */
    @Test
    public void testRequestMessage() {
        System.out.println("requestMessage");
        MessageID messageID = null;
        AntControl instance = new AntControl();
        MessageID expResult = null;
        MessageID result = instance.requestMessage(messageID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}