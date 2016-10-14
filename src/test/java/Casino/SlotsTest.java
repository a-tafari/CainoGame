package Casino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by abijah on 10/11/16.
 */
public class SlotsTest {
    Player player;
    Slots slots;
    private String name = "Abijah";
    private  double  balance = 2000.00;
    static final double DELTA= .0000001;

    @Before

    public void setUp(){
        slots = new Slots();
        player = new Player(name,balance);
    }
    @Test

    public void spinTest(){
        int actual = 1;
        int expected = slots.spin();
        Assert.assertNotEquals("Should not be equal",expected, actual);
    }
    @Test
    public void spinToStringTest(){
        String actual = "CHERRY";
        String expected = slots.spinToString(1);
        Assert.assertEquals("should be a cherry", actual, expected);
    }

}
