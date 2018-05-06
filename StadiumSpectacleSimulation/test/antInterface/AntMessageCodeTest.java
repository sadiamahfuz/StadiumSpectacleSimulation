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
public class AntMessageCodeTest {

    public AntMessageCodeTest() {
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
     * Test of values method, of class AntMessageCode.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        AntMessageCode[] expResult = null;
        AntMessageCode[] result = AntMessageCode.values();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class AntMessageCode.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        AntMessageCode expResult = null;
        AntMessageCode result = AntMessageCode.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}