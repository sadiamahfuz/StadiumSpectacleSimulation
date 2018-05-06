/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package antInterface;

/**
 *
 * @author syedasm
 */
public class AntChannelEvent extends AntData{

    private AntMessageCode code;

    public AntChannelEvent() {
       super();
       code = null;
    }

public void channelEvenFunc(int channelNumber, AntMessageCode code){
    //to be implemented in badge class
    this.code = code;
}


}
