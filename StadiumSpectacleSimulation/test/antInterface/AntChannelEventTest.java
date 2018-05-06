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
public class AntChannelEventTest {

    public AntChannelEventTest() {
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
     * Test of channelEvenFunc method, of class AntChannelEvent.
     */
    @Test
    public void testChannelEvenFunc() {
        System.out.println("channelEvenFunc");
        int channelNumber = 0;
        AntMessageCode code = null;
        AntChannelEvent instance = new AntChannelEvent();
        instance.channelEvenFunc(channelNumber, code);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}