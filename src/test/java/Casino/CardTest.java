package Casino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by abijah on 10/11/16.
 */
public class CardTest {

    Card card;
    private String rank = "A";
    private String suit = "Club";
    @Before

    public void setUp(){
        card =  new Card(suit, rank);

    }
    @Test
    public void getSuitTest(){
        // Arrange
        String actual= "Club";
        // Act
        String expected= card.getSuit();
        // Assert
        Assert.assertEquals("Should be a Club", actual, expected);
    }
    @Test
    public void getRankTest(){
        // Arrange
        String actual= "A";
        // Act
        String expected= card.getRank();
        // Assert
        Assert.assertEquals("Should be a Club", actual, expected);
    }
    @Test
    public void toStringTest(){
        // Arrange
        String actual="\n"+rank+"bof "+ suit;
        // Act
        String expected= card.toString();
        // Assert
        Assert.assertEquals("Should be A of Clubs", actual, expected);
    }
    @Test
    public void drawFromDeckTest(){

    }

}
