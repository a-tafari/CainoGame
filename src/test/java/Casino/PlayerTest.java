package Casino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by abijah on 10/11/16.
 */
public class PlayerTest {
    Player player;
    private  double  balance = 10.00;
    private  String name = "ABIJAH";
    static final double DELTA= .0000001;
    @Before

    public void setUp(){
        player =  new Player();

    }
    @Test
    public void getSetBalanceTest(){
        player.setBalance(balance);
        // Arrange
        double actual = 10.00;
        //Act
        double expected = player.getBalance();
        //Assert
        Assert.assertEquals("Should return 10.00", actual, expected, DELTA);
    }
    @Test
    public void getPlayerNameTest(){
        player.setPlayerName(name);
        //Arrange
        String actual= "ABIJAH";
        // Act
        String expected= player.getPlayerName();
        // Assert
        Assert.assertEquals("Should return ABIJAH", actual, expected);
    }
    @Test
    public void addToBalanceAccount(){
        player.setBalance(balance);
        //Arrange
        double actual = 20.50;
        // Act
        double expected = player.addToBalance(10.50);
        // Assert
        Assert.assertEquals("Should be 20.50", actual, expected,DELTA);
    }
    @Test
    public void subtractFromBalanceAccount(){
        player.setBalance(balance);
        // Arrange
        double actual = 5.50;
        // Act
        double expected = player.subtractFromBalance(4.50);
        // Assert
        Assert.assertEquals("Should be 4.50", actual, expected,DELTA);
    }
}
