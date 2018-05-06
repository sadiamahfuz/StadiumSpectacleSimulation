/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author syedasm
 */
public class PatternDialogue extends JDialog{

   private String c = null;
   private int duration = 0;
   private int numberHops =0;
   private JLabel colourLabel;
   private JComboBox colourList;
   private IntTextField flashDuration;
   private IntTextField noHops;

   /**
    *
    * @param owner
    * @param title
    */
   public PatternDialogue(Frame owner, String title) {
      super(owner, title, true);
      JPanel btnPanel = new JPanel();
      JPanel colourPanel = new JPanel();
      colourLabel =new JLabel("Choose Colour: ");
      JButton okBtn   = new JButton("OK");
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
      colourPanel.add(colourLabel);
      colourPanel.add(colourLabel);

      String[] colours = {"Red","Green", "Blue", "Cyan","Magenta","Yellow","White", "Random" };

//Create the combo box, select item at index 4.
//Indices start at 0, so 4 specifies the pig.
colourList = new JComboBox(colours);
colourList.setSelectedIndex(0);
colourPanel.add(colourList);

JPanel flashDurationPanel = new JPanel();
JLabel flashLabel = new JLabel("Enter Flash Duration");
 flashDuration = new IntTextField(0, 16);
flashDurationPanel.add(flashLabel);
flashDurationPanel.add(flashLabel);
flashDurationPanel.add(flashDuration);

JPanel hopPanel = new JPanel();
JLabel hopLabel = new JLabel("Number of hops");
noHops = new IntTextField(0,16);
hopPanel.add(hopLabel);
hopPanel.add(noHops);
      getContentPane().add(colourPanel, BorderLayout.NORTH);
      getContentPane().add(flashDurationPanel,BorderLayout.CENTER);
      getContentPane().add(hopPanel,BorderLayout.EAST);
      getContentPane().add(btnPanel, BorderLayout.SOUTH);
      pack();
   }

   /**
    *
    * @return
    */
   public String getColour() {
      return c;
   }

   private void okButton() {
      duration = flashDuration.getValue();
      numberHops = noHops.getValue();
      c=(String)colourList.getSelectedItem();
      setVisible(false);
   }

   private void noButton() {
      c = null;
      setVisible(false);
   }

   /**
    *
    * @return
    */
   public int getDuration(){
       return duration;
   }

   /**
    *
    * @return
    */
   public int getHops(){
       return numberHops;
   }
}



