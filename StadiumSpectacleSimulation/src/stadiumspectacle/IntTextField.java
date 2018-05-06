package stadiumspectacle;
import javax.swing.*;
import javax.swing.text.Document;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syedasm
 */
public class IntTextField extends JTextField {
    /**
     *
     * @param defval
     * @param size
     */
    public IntTextField(int defval, int size) {
    super("" + defval, size);
  }

    @Override
   protected Document createDefaultModel() {
    return new IntTextDocument();
  }



 /* public boolean isValid() {
    try {
      Integer.parseInt(getText());
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }*/

    /**
     *
     * @return
     */
    public int getValue() {
    try {
      return Integer.parseInt(getText());
    } catch (NumberFormatException e) {
      return 0;
    }
  }

}