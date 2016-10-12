package Casino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by abijah on 10/2/16.
 */
public class Deck {


    ArrayList<Card> deck = new ArrayList<Card>();

        private String[] rank = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        private String[] suit = {"Club", "Spade", "Diamond", "Heart"};


        public Deck(){
            for (int i = 0; i<suit.length; i++) {
                for(int j=0; j<rank.length; j++){
                    this.deck.add(new Card(suit[i],rank[j]));
                }
            }
            //shuffle the deck when its created
            Collections.shuffle(this.deck);

        }

        public ArrayList<Card> getDeck(){
            return deck;
        }
        

        public Card drawFromDeck() throws EmptyDeckException {
            Random generator = new Random();
            if(deck.size()>0) {
                int index = generator.nextInt(deck.size());
                return deck.remove(index);
            }
            else
                throw new EmptyDeckException();
        }
        public void dealCards(){

        }

        public int getTotalCards() {
            return deck.size();
        }

}
