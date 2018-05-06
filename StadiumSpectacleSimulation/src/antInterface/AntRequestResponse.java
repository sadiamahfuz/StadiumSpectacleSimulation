/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package antInterface;

/**
 *  This class hasnt been used in the simulation
 * @author syedasm
 */
public class AntRequestResponse extends AntChannelEvent{

    public AntRequestResponse() {

        super();
    }

    public ChannelState ResponseFuncChStatus(){
        return super.state1;
    }

    public ChannelID ResponseFuncChID(){
        return super.channelID1;
    }



}
