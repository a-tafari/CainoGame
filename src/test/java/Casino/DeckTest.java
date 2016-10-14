package Casino;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by abijah on 10/11/16.
 */
public class DeckTest extends Card {
    Deck deck;
    String[] rank = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] suit = {"Club", "Spade", "Diamond", "Heart"};
    Card card;
    Deck.Hand hand;
    @Before

    public void setUp(){
        deck =  new Deck();
        card = new Card();
        hand = deck.new Hand();
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
    public  void drawFromDeckTest(){
        //Arrange
         Card value1 = deck.drawFromDeck();
        //Act
         Card value2 = deck.drawFromDeck();
        //Assert
         Assert.assertNotEquals("Should not be equal to one another", value1,value2);

    }
    @Test
    public void testForRandomness(){
        Card card =deck.drawFromDeck();
        String expected="\n 2 of Club";
        String actual=card.toString();
        Assert.assertNotEquals("Should not be equal to one another",actual, expected);

    }

    @Test
    public void addToUserHandTest(){
        hand.addToUserHand();
        int actual = 1;
        int expected = hand.userHand.size();
        Assert.assertEquals("Should not be equal to 1", actual, expected);

    }
    @Test
    public void addToDealerHandTest(){
        hand.addToDealerHand();
        int actual = 1;
        int expected = hand.dealerHand.size();
        Assert.assertEquals("Should not be equal to 1", actual, expected);

    }
//    @Test
//    public void takeUserHandTurnToRankTest(){
//        hand.addToUserHand();
//        hand.addToUserHand();
//        hand.takeUserHandTurnToRank();
//        int actual = 2;
//        int expected = hand.singleRank.size();
//        Assert.assertEquals("Should not be equal to 1", actual, expected);
//
//    }



}
