/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

import java.util.ArrayList;

/**
 * Class for creating broadcast networks
 * @author syedasm
 */
public class BroadcastNetwork {

     private ArrayList<Badge> network = new ArrayList<Badge>();

     /**
      * Empty Constructor
      */
     public BroadcastNetwork(){
    }

    /**
     * Add a badge to the network.
     * The bagdes in the network are stored in an Array List.
     * @param badge - the badge to be added
     */
    public void addSlave(Badge badge){
        network.add(badge);
    }

    /**
     * Extracts a slave node from the network.
     * @param address - the index of the Array List in which the slave node is stored
     * @return the slave node of interest
     */
    public Badge getSlave(int address){

            return network.get(address);

    }

    /**
     * Returns the whole network of slave nodes
     * @return network
     */
    public ArrayList<Badge> getNetworkOfSlaves(){
        return network;
    }

    @Override
    public String toString(){
        return network.toString();
    }

    /**
     * Checks to see whether the network has any nodes in it or is empty
     * @return isEmpty
     */
    public boolean isEmpty(){
        if(network==null){
            return true;
        }

        else
            return false;
    }

    /**
     * Returns how many slaves there are in the
     * @return sizeOfNetwork
     */
    public int sizeOfNetwork(){
        int size =0;
        if(network==null)
            size=0;
        else size = network.size();
        return size;
    }

    /**
     * Clears the Network
     */
    public void clearNetwork(){
        network.clear();
    }
    

}
