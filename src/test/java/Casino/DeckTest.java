package Casino;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by abijah on 10/11/16.
 */
public class DeckTest {
    Deck deck;
    String[] rank = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] suit = {"Club", "Spade", "Diamond", "Heart"};

    @Before

    public void setUp(){
        deck =  new Deck();


    }
    @Test
    public void getTotalCardsTest(){
        int actual= 52;
        int expected = deck.getTotalCards();
        Assert.assertEquals("Size should be 52 cards", actual, expected);
    }
    @Test




}
