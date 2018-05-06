/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package antInterface;

/**
 * Class for ANT control messages
 * @author syedasm
 */
public class AntControl extends AntConfiguration{

    protected boolean channel1Open;
    protected boolean channel2Open;


    public AntControl() {

        super();
        this.channel1Open = false;
        this.channel2Open = false;


    }

    /**
     * Reset the system
     * Put it to a known low power state
     * Close all channels
     */
    public void resetSystem(){
        super.channelAssigned1 = null;
        super.channelID1 = null;
          super.channelAssigned2 = null;
        super.channelID2 = null;
        super.setChannelTxPower(PowerLevel.NEGTWENTY);
    }

    /**
     * Opens a channel that has been already configured and assigned
     * See AntConfiguration Class
     */
    public void openChannel(int channelNumber){
        if(super.channelID1.getChannelNumber()==channelNumber){
            if(super.channelAssigned1!=null){
                this.channel1Open = true;
                //System.out.println("Channel1 Opened");
            }
             else if(super.channelAssigned1!=null){
                   this.channel2Open = true;
               // System.out.println("Channel2 Opened");
             }
             else{
               // System.out.println("Channel Not Assigned");
            }

        }
        
        else{
            System.out.println("No channel with channel number "+ channelNumber+ " has been assigned");
        }

    }

    /**
     * Close the channel
     * When channel is closed it still retains the parameters used to configure and assign it
     * The channel can be reopened at any time
     */
    public void closeChannel(int channelNumber){

        if(super.channelID1.getChannelNumber()==channelNumber){
                    this.channel1Open=false;
        }

        else if(super.channelID2.getChannelNumber()==channelNumber){
                    this.channel2Open=false;
        }

    }

    /**
     * Method to request info of another devide
     * @param messageID - this contains the type of info being requested, e.g. Channel ID or Channel Status
     * @return messageID
     */
    public MessageID requestMessage(MessageID messageID){
            return messageID;

    }
    

}
