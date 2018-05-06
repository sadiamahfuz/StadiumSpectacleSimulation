package antInterface;

/**
 * Class to construct Channel ID
 * @author syedasm
 */
public class ChannelID {

    private int channelNumber;
    private int deviceType;
    private int deviceNumber;
    private int transmissionType;


    /**
     * Empty ChannelID constructor
     * Sets all fields to zero
     */
    public ChannelID(){
        this.channelNumber = 0;
        this.deviceType = 0;
        this.deviceNumber = 0;
        this.transmissionType = 0;

    }

    /**
     * Constructor of channel ID
     * @param channelNumber
     * @param deviceType
     * @param deviceNumber
     * @param transmissionType
     */
    public ChannelID(int channelNumber, int deviceType, int deviceNumber, int transmissionType) {
        this.channelNumber = channelNumber;
        this.deviceType = deviceType;
        this.deviceNumber = deviceNumber;
        this.transmissionType = transmissionType;
    }


    /**
     * Set channel number
     * @param channelNumber
     */
    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    /**
     * Set device number
     * @param deviceNumber
     */
    public void setDeviceNumber(int deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    /**
     * Set device type
     * @param deviceType
     */
    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * Set Transmission type
     * @param transmissionType
     */
    public void setTransmissionType(int transmissionType) {
        this.transmissionType = transmissionType;
    }


    /**
     *
     * @return channel number
     */
    public int getChannelNumber() {
        return channelNumber;
    }

    /**
     *
     * @return device number
     */
    public int getDeviceNumber() {
        return deviceNumber;
    }

    /**
     *
     * @return device type
     */
    public int getDeviceType() {
        return deviceType;
    }

    /**
     *
     * @return transmission type
     */
    public int getTransmissionType() {
        return transmissionType;
    }

    @Override
    public String toString() {
        return "ChannelID{" + "channelNumber=" + channelNumber + "deviceType=" + deviceType + "deviceNumber=" + deviceNumber + "transmissionType=" + transmissionType + '}';
    }




}
