package stadiumspectacle;


import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Class to Configure the badges before an event
 * @author syedasm
 */
public class ConfigureDialogue extends JDialog {
   private String event = null;
   private String selectedMode = null;
   private JTextField eventName;
   private JLabel eventLabel;
   private JComboBox modeList;

   /**
    * The constructor of the Configure Dialogue Box.
    * @param owner - the owner frame
    * @param title - the title of the window
    */
   public ConfigureDialogue(Frame owner, String title) {
      super(owner, title, true);
      JPanel btnPanel = new JPanel();
      JPanel eventPanel = new JPanel();
      eventLabel =new JLabel("Enter Event Name: ");
      JButton okBtn   = new JButton("Configure");
      JButton noBtn   = new JButton("Cancel");
      btnPanel.add(okBtn);
      okBtn.addActionListener(new ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent ae) {
            okButton();
         }
      });
      noBtn.addActionListener(new ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent ae) {
            noButton();
         }
      });
      btnPanel.add(noBtn);
      eventPanel.add(eventLabel);
      eventName = new JTextField(16);
      eventPanel.add(eventName);

      String[] mode = { "Event Mode","Souvenir Mode" };

modeList = new JComboBox(mode);
modeList.setSelectedIndex(0);

JPanel modePanel = new JPanel();
JLabel modeLabel = new JLabel("Select Mode");
modePanel.add(modeLabel);
modePanel.add(modeList);
      getContentPane().add(eventPanel, BorderLayout.NORTH);
      getContentPane().add(modePanel,BorderLayout.CENTER);
      getContentPane().add(btnPanel, BorderLayout.SOUTH);
      pack();
   }

   /**
    * Return the name of the event that was chosen by the user
    * @return name of event
    */
   public String getEvent() {
      return event;
   }

   /**
    * When the configure button is pressed the event name and selected mode are read
    */
   private void okButton() {
      event = eventName.getText();
      selectedMode=(String)modeList.getSelectedItem();
      setVisible(false);
   }

   /**
    * If the cancel button is pressed, then the dialogue box disappears
    */
   private void noButton() {
      event = null;
      setVisible(false);
   }

   /**
    * Returns the mode that the user selected
    * @return selectedMode
    */
   public String getMode(){
       return selectedMode;
   }
}

