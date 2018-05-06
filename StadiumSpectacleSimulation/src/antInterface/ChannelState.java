/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package antInterface;

/**
 *
 * @author syedasm
 */
public enum ChannelState {

    UNASSIGNED (0),
    ASSIGNED(1),
    SEARCHING(2),
    TRACKING(3);

    private int state;

    ChannelState(int state){

        this.state=state;

    }

    public int getChannelState(){
        return state;
    }

}
