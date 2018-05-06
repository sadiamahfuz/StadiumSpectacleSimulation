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
public class PowerLevelTest {

    public PowerLevelTest() {
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
     * Test of values method, of class PowerLevel.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        PowerLevel[] expResult = null;
        PowerLevel[] result = PowerLevel.values();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class PowerLevel.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        PowerLevel expResult = null;
        PowerLevel result = PowerLevel.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of powerLevel method, of class PowerLevel.
     */
    @Test
    public void testPowerLevel() {
        System.out.println("powerLevel");
        PowerLevel instance = null;
        int expResult = 0;
        int result = instance.powerLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PowerLevel.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PowerLevel instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}