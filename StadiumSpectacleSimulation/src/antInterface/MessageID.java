/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package antInterface;

/**
 *
 * @author syedasm
 */
public enum MessageID {

    MESG_CHANNEL_STATUS (0),
    MESG_CHANNEL_ID(1);

    private int ID;

    MessageID(int ID){
        this.ID = ID;
    }

    public int getMessageID(){
        return ID;
    }
    
    }

