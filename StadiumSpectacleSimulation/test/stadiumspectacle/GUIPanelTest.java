/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

import java.awt.Color;
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
public class GUIPanelTest {

    public GUIPanelTest() {
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
     * Test of run method, of class GUIPanel.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        GUIPanel instance = new GUIPanel();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class GUIPanel.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        String colourName = "";
        GUIPanel instance = new GUIPanel();
        Color expResult = null;
        Color result = instance.getColor(colourName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createThread method, of class GUIPanel.
     */
    @Test
    public void testCreateThread() {
        System.out.println("createThread");
        GUIPanel instance = new GUIPanel();
        instance.createThread();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of end method, of class GUIPanel.
     */
    @Test
    public void testEnd() {
        System.out.println("end");
        GUIPanel instance = new GUIPanel();
        instance.end();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}