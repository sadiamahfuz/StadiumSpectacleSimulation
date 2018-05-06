/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package antInterface;

/**
 * @author syedasm
 * Enumeration that stores the various channel types available in the ANT protocol and their values
 * The available channel types are
 * Receive
 * Transmit
 * Unidirectional receive only
 * Unidirectional transmit only
 * Shared bidirectional receive
 * Shared bidirectional transmit
 */
public enum ChannelType {

    /**
     *
     */
    RECEIVE(0),
    /**
     *
     */
    TRANSMIT(10),
        /**
         *
         */
        UNIRECONLY(50),
        /**
         *
         */
        UNITRANSONLY(40),
        /**
         * 
         */
        SHAREDBIREC(20),
        /**
         *
         */
        SHAREDBITRANS(30);

        private final int value;


        /**
         * Constructor of ChannelType
         * @param value
         */
        ChannelType(int value){

            this.value=value;
        }

        /**
         * Method to get the value of the channel type
         * @return value of channel Type
         */
        public int channelType(){
            return this.value;
        }

    @Override
    public String toString() {
        return super.toString();
    }



}
