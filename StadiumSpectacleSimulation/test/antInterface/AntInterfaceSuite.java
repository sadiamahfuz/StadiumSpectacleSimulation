/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package antInterface;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author syedasm
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({antInterface.ChannelTypeTest.class,antInterface.ChannelStateTest.class,antInterface.AntControlTest.class,antInterface.AntDataTest.class,antInterface.PowerLevelTest.class,antInterface.DataTest.class,antInterface.AntChannelEventTest.class,antInterface.AntInterfaceTest.class,antInterface.AntMessageCodeTest.class,antInterface.AntRequestResponseTest.class,antInterface.ChannelIDTest.class,antInterface.AntConfigurationTest.class,antInterface.ChannelTest.class,antInterface.MessageIDTest.class})
public class AntInterfaceSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}