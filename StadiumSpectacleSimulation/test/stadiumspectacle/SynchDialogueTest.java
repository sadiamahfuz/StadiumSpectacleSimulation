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
public class SynchDialogueTest {

    public SynchDialogueTest() {
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
     * Test of getColour method, of class SynchDialogue.
     */
    @Test
    public void testGetColour() {
        System.out.println("getColour");
        SynchDialogue instance = null;
        String expResult = "";
        String result = instance.getColour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuration method, of class SynchDialogue.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        SynchDialogue instance = null;
        int expResult = 0;
        int result = instance.getDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHops method, of class SynchDialogue.
     */
    @Test
    public void testGetHops() {
        System.out.println("getHops");
        SynchDialogue instance = null;
        int expResult = 0;
        int result = instance.getHops();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}