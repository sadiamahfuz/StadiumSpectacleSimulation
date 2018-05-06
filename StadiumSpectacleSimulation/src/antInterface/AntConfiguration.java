package antInterface;


/**
 * Class to configure an ant channel
 * Note that although ANT nodes can open up to 8 channels, this class only allows two channels to be assigned
 * This is because 2 channels is sufficient for our system at present
 * @author syedasm
 */
public class AntConfiguration {

    protected Channel  channelAssigned1; //the assigned channel
    protected ChannelID channelID1; //the Channel ID
    protected int channelPeriod; //the channel period
    protected int channelRF = 2400;
    protected PowerLevel level;
    protected ChannelState state1;

    protected Channel  channelAssigned2; //the assigned channel
    protected ChannelState state2;
    protected ChannelID channelID2; //the Channel ID

    /**
     * Constructor - sets to default values
     */
    public AntConfiguration(){
        this.channelID1 = new ChannelID(); //initially set all parameters of Channel ID to 0
        this.channelID2 = new ChannelID(); //initially set all parameters of Channel ID to 0

        this.channelAssigned1 = new Channel(); //initially do not assign any cha
        this.channelAssigned2 = new Channel(); //initially do not assign any channel

        this.channelPeriod = 4; //set to 4Hz by default
        this.level = PowerLevel.NEGTWENTY; //set to -20dB as default
        this.state1 = ChannelState.UNASSIGNED;
        this.state2 = ChannelState.UNASSIGNED;

    }

    //the following methods are as they appear in ANT API

    /**
     * Unassign a channel
     * @param the channel number of the channel to be unassigned
     */
    public void unAssignChannel(int channelNumber){

        if(channelAssigned1.getChannelNumber()==channelNumber){
            channelAssigned1.reset();
            this.state1=ChannelState.UNASSIGNED;
            this.channelID1 = null;


        }
        else if(channelAssigned2.getChannelNumber()==channelNumber){
            channelAssigned2.reset();
            this.state2=ChannelState.UNASSIGNED;
            this.channelID2=null;
        }

     }

     /**
      * Assign first channel
      * @param channelNum
      * @param channelType
      */
     public void AssignChannel1(int channelNum, ChannelType channelType){
       channelAssigned1 = new Channel(channelNum, channelType);
       this.state1 = ChannelState.ASSIGNED;
    }

      /**
      * Assign second channel
      * @param channelNum
      * @param channelType
      */
     public void AssignChannel2(int channelNum, ChannelType channelType){
       channelAssigned2 = new Channel(channelNum, channelType);
       this.state2 = ChannelState.ASSIGNED;
    }

     /**
      * Set the channel ID for first channel
      * @param channelNum
      * @param deviceNum
      * @param deviceType
      * @param transType
      */
     public void setChannelID1(int channelNum, int deviceNum, int deviceType, int transType){

        this.channelID1 = new ChannelID(channelNum,deviceNum,deviceType,transType);

    }

        /**
      * Set the channel ID for second channel
      * @param channelNum
      * @param deviceNum
      * @param deviceType
      * @param transType
      */
     public void setChannelID2(int channelNum, int deviceNum, int deviceType, int transType){

        this.channelID1 = new ChannelID(channelNum,deviceNum,deviceType,transType);

    }
    
    
    /**
     * Set the channel Period
     * @param period
     */
    public void setChannelPeriod(int period){
        this.channelPeriod=period;
    }


    /**
     * Set the channel RF frequency
     * @param freq
     */
    public void setChannelRFfreq(int freq){
        this.channelRF=freq;
    }

    /**
     * Set the Channel transmission power level
     * @param power
     */
    public void setChannelTxPower(PowerLevel power){
        this.level = power;
   
    }

    @Override
    public String toString() {
        return super.toString();
    }


    // The following getter methods are for testing purposes

    /**
     * Return the Assigned channel1
     * @return channelAssigned
     */
    public Channel getChannelAssigned1() {
        return channelAssigned1;
    }

      /**
     * Return the Assigned channel2
     * @return channelAssigned
     */
    public Channel getChannelAssigned2() {
        return channelAssigned2;
    }

    /**
     * Return the Channel ID of assigned Channel1
     * @return channelID
     */
    public ChannelID getChannelID() {
        return channelID1;
    }

    /**
     * Return the Channel ID of assigned Channel2
     * @return channelID
     */
    public ChannelID getChannelID2() {
        return channelID2;
    }

    /**
     * Return the Channel Period
     * @return channelPeriod
     */
    public int getChannelPeriod() {
        return channelPeriod;
    }

    /**
     * Return the Channel RF frequency
     * @return channelRF
     */
    public int getChannelRF() {
        return channelRF;
    }

    /**
     * Return the Power level
     * @return powerLevel
     */
    public PowerLevel getLevel() {
        return level;
    }



}
