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
    Card card;
    @Before

    public void setUp(){
        deck =  new Deck();
        card = new Card();

    }
    @Test
    public void getTotalCardsTest(){
        // Arrange
        int actual= 52;

        // Act
        int expected = deck.getTotalCards();

        // Assert
        Assert.assertEquals("Size should be 52 cards", actual, expected);
    }
    @Test
    public void drawFromDeckTestForSize(){
        deck.drawFromDeck();
        //Arrange
        int actual = 51;

        //Act
        int expected = deck.getTotalCards();

        //Assert
        Assert.assertEquals("Should return 51", actual, expected);
    }
    @Test
    public  void drawFromDeckRandomTest(){
        //Arrange
         Card value1 = deck.drawFromDeck();
        //Act
         Card value2 = deck.drawFromDeck();
        //Assert
         Assert.assertNotEquals("Should not be equal to one another", value1,value2);

    }
    @Test
    public void dealCardsTest(){
        int actual= 4;
        int expected= deck.dealCards(4).size();
        Assert.assertEquals("the size of the dealt cards should be", actual, expected);

    }



}
