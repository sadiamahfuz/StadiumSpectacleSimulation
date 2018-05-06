/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package antInterface;

import java.awt.Color;

/**
 *
 * @author syedasm
 */
public class Data {

    private int taskID;


    private Color ledColour;
    private int flashDuration;
    private int retransmitProbability;
    private boolean FlashFirst;
    private int delayBeforeTx;
    private PowerLevel powerLevel;
    private int delayBeforeFlash;
    private int noOfHopsLeft;


    public Data(int taskID, Color ledColour, int flashDuration, int retransmitProbability, boolean FlashFirst, int delayBeforeTx,PowerLevel powerLevel, int delayBeforeFlash, int noOfHopsLeft) {
        
        this.taskID = taskID;
        this.ledColour = ledColour;
        this.flashDuration = flashDuration;
        this.retransmitProbability = retransmitProbability;
        this.FlashFirst = FlashFirst;
        this.delayBeforeTx = delayBeforeTx;
        this.powerLevel = powerLevel;
        this.delayBeforeFlash = delayBeforeFlash;
        this.noOfHopsLeft = noOfHopsLeft;
    }

    public boolean isFlashFirst() {
        return FlashFirst;
    }

    public void setFlashFirst(boolean FlashFirst) {
        this.FlashFirst = FlashFirst;
    }

    public int isDelayBeforeFlash() {
        return delayBeforeFlash;
    }

    public void setDelayBeforeFlash(int delayBeforeFlash) {
        this.delayBeforeFlash = delayBeforeFlash;
    }

    public int getDelayBeforeTx() {
        return delayBeforeTx;
    }

    public void setDelayBeforeTx(int delayBeforeTx) {
        this.delayBeforeTx = delayBeforeTx;
    }

    public int getFlashDuration() {
        return flashDuration;
    }

    public void setFlashDuration(int flashDuration) {
        this.flashDuration = flashDuration;
    }

    public Color getLedColour() {
        return ledColour;
    }

    public void setLedColour(Color ledColour) {
        this.ledColour = ledColour;
    }

    public int getNoOfHopsLeft() {
        return noOfHopsLeft;
    }

    public void setNoOfHopsLeft(int noOfHopsLeft) {
        this.noOfHopsLeft = noOfHopsLeft;
    }

    public PowerLevel getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(PowerLevel powerLevel) {
        this.powerLevel = powerLevel;
    }

    public int getRetransmitProbability() {
        return retransmitProbability;
    }

    public void setRetransmitProbability(int retransmitProbability) {
        this.retransmitProbability = retransmitProbability;
    }
   
  public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }
                    

}
