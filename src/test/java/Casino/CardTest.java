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

        String actual= "Club";
        String expected= card.getSuit();
        Assert.assertEquals("Should be a Club", actual, expected);
    }
    @Test
    public void setRankTest(){

        String actual= "A";
        String expected= card.getRank();
        Assert.assertEquals("Should be a Club", actual, expected);
    }
    @Test
    public void toStringTest(){
        String actual="\n"+rank+"bof "+ suit;
        String expected= card.toString();
        Assert.assertEquals("Should be A of Clubs", actual, expected);
    }
    @Test
    public void drawFromDeckTest
}
