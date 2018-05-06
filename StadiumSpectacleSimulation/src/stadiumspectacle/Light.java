/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

import java.awt.geom.Ellipse2D;

/**
 *
 * @author syedasm
 */
public class Light {

    private Ellipse2D.Double light;
    private int x;
    private int y;

    /**
     *
     * @param x
     * @param y
     */
    public Light(int x, int y){
        this.light = new Ellipse2D.Double(x,y,5,5);
    }

    /**
     *
     * @return
     */
    public Ellipse2D.Double getLight(){
        return light;
    }



}
