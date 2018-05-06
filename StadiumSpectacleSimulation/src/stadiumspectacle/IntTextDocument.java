/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

import javax.print.attribute.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author syedasm
 */
public class IntTextDocument extends PlainDocument {
    /**
     *
     * @param offs
     * @param str
     * @param a
     * @throws BadLocationException
     */
    public void insertString(int offs, String str, AttributeSet a)
        throws BadLocationException {
      if (str == null)
        return;
      String oldString = getText(0, getLength());
      String newString = oldString.substring(0, offs) + str
          + oldString.substring(offs);
      try {
        Integer.parseInt(newString + "0");
        super.insertString(offs, str,(javax.swing.text.AttributeSet) a);
      } catch (NumberFormatException e) {
      }
    }
  }

