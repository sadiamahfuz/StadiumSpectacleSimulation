/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package antInterface;

/**
 *
 * @author syedasm
 */
public enum AntMessageCode {

    RESPONSE_NO_ERROR (0),
    EVENT_RX_SEARCH_TIMEOUT(1),
    EVENT_RX_FAIL(2),
    EVENT_TX(3),
    EVENT_TRANSFER_RX_FAILED(4),
    EVENT_TRANSFER_TX_COMPLETED(5),
    EVENT_TRANSFER_TX_FAILED(6),
    EVENT_CHANNEL_CLOSED(7),
    EVENT_RX_FAIL_Go_TO_SEARCH(8),
    EVENT_CHANNEL_COLLISION(9),
    EVENT_TRANSFER_TX_START(10),
    CHANNEL_IN_WRONG_STATE(21),
    CHANNEL_NOT_OPENED(22),
    CHANNEL_ID_NOT_SET(24),
    CLOSE_ALL_CHANNELS(25),
    INVALID_MESSAGE(40),
    INVALID_PARAMETER_PROVIDED(51);

    private int code;

    AntMessageCode(int code){
        this.code=code;
    }

    private int getCode(){
        return this.code;
    }

}
