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
public class MessageIDTest {

    public MessageIDTest() {
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
     * Test of values method, of class MessageID.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        MessageID[] expResult = null;
        MessageID[] result = MessageID.values();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class MessageID.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        MessageID expResult = null;
        MessageID result = MessageID.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessageID method, of class MessageID.
     */
    @Test
    public void testGetMessageID() {
        System.out.println("getMessageID");
        MessageID instance = null;
        int expResult = 0;
        int result = instance.getMessageID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}