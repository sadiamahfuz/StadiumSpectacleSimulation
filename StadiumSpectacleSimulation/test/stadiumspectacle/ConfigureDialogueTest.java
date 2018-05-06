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
public class ConfigureDialogueTest {

    public ConfigureDialogueTest() {
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
     * Test of getEvent method, of class ConfigureDialogue.
     */
    @Test
    public void testGetEvent() {
        System.out.println("getEvent");
        ConfigureDialogue instance = null;
        String expResult = "";
        String result = instance.getEvent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMode method, of class ConfigureDialogue.
     */
    @Test
    public void testGetMode() {
        System.out.println("getMode");
        ConfigureDialogue instance = null;
        String expResult = "";
        String result = instance.getMode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}