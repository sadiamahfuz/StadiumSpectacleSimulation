/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

import antInterface.*;
import java.awt.Color;
import java.awt.geom.*;
import java.util.Random;

/**
 *
 * @author syedasm
 */
public class Badge extends AntInterface{

    private Light light;
    private Position position;
    private Color colour;
    private boolean flashed;
    private int taskID;


    /**
     * Badge construtor
     * @param x x-position in graphics panel
     * @param y y-position in graphics panel
     */
    public Badge(int x, int y){
        super();
        this.light = new Light(x,y);
        this.position = new Position (x,y);
        this.colour = Color.black;
    }

    /**
     * Returns Ellipse2D light (graphical representation) correspoding to the Badge
     * @return light
     */
    public Ellipse2D.Double getLight(){
        return light.getLight();
    }

    /**
     * Returns the position of the Badge in the graphics panel
     * @return position
     */
    public int[] getLocation(){
        return position.getPosition();
    }


    /**
     * Sening the broadcast data
     * This method doesn't actually do anything
     * Whenever this method is called,RFActivity Class takes care of creating a broadcast network
     * @param data
     */
    @Override
    public void sendBroadcastData(Data data){


        }

/**
 *
 * @param data
 */
public void sendAcknowledgedData(Data data){

        }

/**
 * Open an auto shared channel with this Badges as the master node
 * @param x size of the network that is wanted
 * @return size of network
 */
public int  openAuto(int x){
                return x;
        }

        /**
         * Broadcast data to a shared channel address, when the badge opens a shared channel as the master
         * @param address the address to broadcast the message to
         * @return address that has received the message
         */
        public int BroadcastShared(int address){
            return address;
        }

        /**
         * Sets the colour of the light of the badge
         * @param colour the colour to be set
         */
        public void setLightColour(Color colour){
            this.colour=colour;
                    }
        
        /**
         * Returns the current light colour
         * @return colour of light
         */
        public Color getLightColour(){
            return colour;


        }

    @Override
        public String toString(){
            return "Badge: Location:" + position.toString();
        }


    /**
     * Generates a random number between 0 and 99
     * If the number is less that the transmit probability of the data, then the badges retransmits
     * @return randomNumber
     */
    public int generateRandom(){
            Random rnd = new Random();
            int randomNumber = rnd.nextInt(100);

            return randomNumber;

        }

    /**
     * Sets the taskID of the badge from the data it has just received
     * @param taskID
     */
    public void setTaskID(int taskID){
            this.taskID = taskID;
        }

        /**
         * Returns the current taskID of the badge
         * @return taskID
         */
        public int getTaskID(){
            return taskID;
        }

}

