/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

import javax.swing.*;        // For JPanel, etc.
import java.awt.*;           // For Graphics, etc.
import java.awt.event.*;
import java.awt.geom.*;

/**
 *
 * @author syedasm
 */
public class DrawingFrame extends JFrame{


/**
   A very simple frame for holding a {@link JPanel}
   for drawing images on
*/

    public static final int DEFAULT_WIDTH =  1250;
    /**
     *
     */
    public static final int DEFAULT_HEIGHT = 720;

    /**
       Constructor initialising DrawingFrame to default width and height.
       @param title The DrawingFrame title
       @param contents The {@link JPanel} contained in the DrawingFrame.
    */
    public DrawingFrame(String title,  JPanel contents){
	super(title);


	// stop the program when the window closes.

	addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
		    System.exit(0);
		}
	    });
	setSize(DEFAULT_WIDTH ,DEFAULT_HEIGHT);
        getContentPane().setLayout(new GridLayout(1,2));
        setContentPane(contents);


	setVisible(true);
    }




}
