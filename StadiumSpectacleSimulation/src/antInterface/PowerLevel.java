/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package antInterface;

/**
 * Enumeration that stores the 4 power levels available on ANT protocol
 * 0 dB (3)
 * -5 dB (2)
 * -10 dB (1)
 * -20 dB (0)
 * @author syedasm
 */
public enum PowerLevel {

    /**
     * 0 dB - the highest power level
     */
    ZERO(3),

    /**
     * -5 dB - the second highest power level
     */
    NEGFIVE(2),

    /**
     * -10 dB - the second lowest power level
     */
    NEGTEN(1),

    /**
     * -20 dB - the lowest power level
     */
    NEGTWENTY(0);

    private final int level;

    /**
     * Constructor of Power Level
     * @param level
     */
    PowerLevel(int level){
        this.level=level;
    }

    /**
     * Method to return the current power level
     * @return Level of power
     */
    public int powerLevel(){
        return this.level;
    }

    @Override
    public String toString() {
        return super.toString();
    }




}
