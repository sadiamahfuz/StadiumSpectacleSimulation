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
public class AntInterfaceTest {

    public AntInterfaceTest() {
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
     * Test of configure method, of class AntInterface.
     */
    @Test
    public void testConfigure() {
        System.out.println("configure");
        ChannelID id = null;
        int period = 0;
        int rfreq = 0;
        PowerLevel power = null;
        AntInterface instance = new AntInterface();
        instance.configure(id, period, rfreq, power);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}