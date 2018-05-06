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
public class PositionTest {

    public PositionTest() {
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
     * Test of getPosition method, of class Position.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        Position instance = new Position(0,0);
        int[] expResult = {(0-15)/17,(0-150)/17};
        int[] result = instance.getPosition();
        assertEquals(expResult[0], result[0]);
        assertEquals(expResult[1],result[1]);

    }


}