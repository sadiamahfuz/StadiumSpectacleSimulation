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
public class AntRequestResponseTest {

    public AntRequestResponseTest() {
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
     * Test of ResponseFuncChStatus method, of class AntRequestResponse.
     */
    @Test
    public void testResponseFuncChStatus() {
        System.out.println("ResponseFuncChStatus");
        AntRequestResponse instance = new AntRequestResponse();
        ChannelState expResult = null;
        ChannelState result = instance.ResponseFuncChStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ResponseFuncChID method, of class AntRequestResponse.
     */
    @Test
    public void testResponseFuncChID() {
        System.out.println("ResponseFuncChID");
        AntRequestResponse instance = new AntRequestResponse();
        ChannelID expResult = null;
        ChannelID result = instance.ResponseFuncChID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}