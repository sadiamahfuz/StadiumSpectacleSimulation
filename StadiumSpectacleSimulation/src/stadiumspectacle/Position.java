/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

/**
 *
 * @author syedasm
 */
public class Position {

    private int[] location = new int[2];

    /**
     *
     * @param x
     * @param y
     */
    public Position(int x, int y){

        location[0] = (x-15)/17;
        location [1] = (y-150)/17;
    }

    /**
     *
     * @return
     */
    public int[] getPosition(){
        return location;
    }

    @Override
    public String toString(){
        return "x:" + location[0] + "y:" +location[1];
    }
}
