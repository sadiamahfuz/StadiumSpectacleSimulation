/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

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
public class PatternTest {

    public PatternTest() {
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
     * Test of values method, of class Pattern.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Pattern[] expResult = null;
        Pattern[] result = Pattern.values();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Pattern.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        Pattern expResult = null;
        Pattern result = Pattern.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPattern method, of class Pattern.
     */
    @Test
    public void testGetPattern() {
        System.out.println("getPattern");
        Pattern instance = null;
        int expResult = 0;
        int result = instance.getPattern();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}