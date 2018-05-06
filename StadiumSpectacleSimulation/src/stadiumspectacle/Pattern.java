/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

/**
 *
 * @author syedasm
 */
public enum Pattern {

    /**
     *
     */
    SYCHRONOUS_FLASH(0),
    /**
     *
     */
    RANDOM_TRACE(1),
    /**
     *
     */
    PCBLOOM(2),
    /**
     *
     */
    FIREWORKS(3),
    /**
     *
     */
    PLAIN_FLASH(4),
    /**
     *
     */
    BLOOM(5);

    private int pattern;
    Pattern(int pattern){
        this.pattern=pattern;

    }

    /**
     *
     * @return
     */
    public int getPattern(){
        return this.pattern;
    }

}
