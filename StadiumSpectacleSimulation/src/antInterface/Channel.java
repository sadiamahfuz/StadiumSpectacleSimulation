/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package antInterface;

/**
 *
 * @author syedasm
 */
public class Channel {

    private int channelNumber; //each channel in network must have a unique channel number
    private ChannelType channelType; //the channel type - channel types are listed in ChannelType enumeration

    /**
     * Empty Constructor of Channel
     * When there is no channel
     * set channel Number = -1
     * channel Type = null
     */
    public Channel() {
        
        this.channelNumber=-1;
        this.channelType=null;

    }


    /**
     * Constructor of Channel
     * @param channelNumber
     * @param channelType
     */
    public Channel(int channelNumber, ChannelType channelType) {
        this.channelNumber = channelNumber;
        this.channelType = channelType;
    }

    /**
     * Returns the channel Number
     * @return Channel Number
     */
    public int getChannelNumber() {
        return channelNumber;
    }

    /**
     * Set Channel Number
     * @param channelNumber
     */
    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    /**
     * Returns the Channel Type
     * @return Channel Type
     */
    public ChannelType getChannelType() {
        return channelType;
    }

    /**
     * Sets the channel Type
     * @param channelType
     */
    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType;
    }


    /**
     * Reset so that there is no channel
     */
    public void reset(){
        this.channelNumber=-1;
        this.channelType=null;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
