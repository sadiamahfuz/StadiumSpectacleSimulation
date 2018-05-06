/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

import java.util.ArrayList;

/**
 *
 * @author syedasm
 */
public class AutoSharedSlave {

    private ArrayList<Badge> slaves = new ArrayList<Badge>();

    /**
     *
     * @param b
     */
    public AutoSharedSlave(Badge b){
         // slaves.add(b);
    }

    /**
     *
     * @param badge
     */
    public void addSlave(Badge badge){
        slaves.add(badge);
    }

    /**
     *
     * @param address
     * @return
     */
    public Badge getSlave(int address){
        //Badge b;
       // if(slaves.size()-1>address)
            return slaves.get(address);

       // return b;
    }

    /**
     *
     * @return
     */
    public ArrayList<Badge> getAllSlaves(){
        return slaves;
    }

    @Override
    public String toString(){
        return slaves.toString();
    }

    /**
     *
     * @return
     */
    public boolean isEmpty(){
        if(slaves==null){
            return true;
        }

        else
            return false;
    }

    /**
     *
     * @return
     */
    public int numberSlaves(){
        int size =0;
        if(slaves==null)
            size=0;
        else size = slaves.size();
        return size;
    }

    /**
     *
     */
    public void removeMaster(){
        slaves.remove(0);
    }

}
