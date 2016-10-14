package Casino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by abijah on 10/2/16.
 */
public class Deck extends Card {


    ArrayList<Card> deck = new ArrayList<Card>();

    private String[] rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private String[] suit = {"Club", "Spade", "Diamond", "Heart"};


    public Deck() {

        createAndShuffleDeck();
    }

    public void createAndShuffleDeck() {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                this.deck.add(new Card(suit[i], rank[j]));
            }
        }
        //shuffle the deck when its created
        Collections.shuffle(this.deck);
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }


    public Card drawFromDeck() /*throws EmptyDeckException*/ {
        //Random generator = new Random();  //Shuffle method takes care of this
        if (deck.size() > 0) {

            //int index = generator.nextInt(deck.size());
            return deck.remove(0);
        } else
            createAndShuffleDeck();
        return deck.remove(0);
    }


    public int getTotalCards() {
        return deck.size();
    }


    public class Hand extends Card {
        ArrayList<Card> userHand = new ArrayList<Card>();
        ArrayList<Card> dealerHand = new ArrayList<Card>();

        public void addToUserHand() {
            userHand.add(drawFromDeck());
        }

        public void addToDealerHand() {
            dealerHand.add(drawFromDeck());
        }

        //        public ArrayList<Card> dealCards(ArrayList<Card> , int number){// not sure if this should be method that calls drawFrom Deck within the game
//
//                for (int i= 0 ; i < number; i++){
//                    Card userCards= drawFromDeck();
//                    name.add(userCards);
//
//                }
//                return newHand;
//            }
        public void showHand() {
            for (Card cards : userHand)
                PlayerDisplay.displayMessage(cards.toString());
        }

        public String showUserRankValue() {
            String rank = "";
            for (Card cards : userHand) {
                rank = cards.getRank();
            }
            return rank;
        }

    }
}
