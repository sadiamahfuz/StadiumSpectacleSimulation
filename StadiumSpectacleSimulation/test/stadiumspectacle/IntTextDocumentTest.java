/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

import javax.print.attribute.AttributeSet;
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
public class IntTextDocumentTest {

    public IntTextDocumentTest() {
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
     * Test of insertString method, of class IntTextDocument.
     */
    @Test
    public void testInsertString() throws Exception {
        System.out.println("insertString");
        int offs = 0;
        String str = "";
        AttributeSet a = null;
        IntTextDocument instance = new IntTextDocument();
        instance.insertString(offs, str, a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}