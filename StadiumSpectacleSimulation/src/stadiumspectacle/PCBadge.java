/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

import antInterface.*;
import java.awt.Color;

/**
 *
 * @author syedasm
 */
public class PCBadge extends AntInterface{

    private Data message;
    private static int taskID;

    /**
     *
     */
    public PCBadge(){
        super();
        message=null;
    }

    /**
     *
     * @param ledColour
     * @param flashDuration
     * @param retransmitProbability
     * @param FlashFirst
     * @param delayBeforeTx
     * @param powerLevel
     * @param deayBeforeFlash
     * @param noOfHopsLeft
     * @return
     */
    public Data constructMessage(Color ledColour, int flashDuration, int retransmitProbability, boolean FlashFirst, int delayBeforeTx, PowerLevel powerLevel, int deayBeforeFlash, int noOfHopsLeft){
        taskID++;
        message = new Data(taskID, ledColour, flashDuration, retransmitProbability, FlashFirst, delayBeforeTx, powerLevel, deayBeforeFlash, noOfHopsLeft);
        return message;
    }
    
    /**
     *
     */
    public void clearMessage(){
        message=null;
    }

    /**
     *
     * @param data
     */
    public void setData(Data data){
       message = data;
    }

    @Override
    public String toString(){

        String s = "Current Power Level of PC is: " + super.level.toString();

        return s;
    }



}
