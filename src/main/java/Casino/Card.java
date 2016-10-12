package Casino;

import java.util.Random;

/**
 * Created by abijah on 10/2/16.
 */
public class Card {

    private String suit;
    private String rank;


        public Card(String suit, String rank){
            this.suit = suit;
            this.rank = rank;
        }
        public Card(){}



    public String getSuit(){
            return suit;
        }
        public void setSuit(String suit){
            this.suit = suit;
        }
        public String getRank(){
            return rank;
        }
        public void setRank(String rank){
            this.rank = rank;
        }

        public String toString(){
            return "\n"+rank + " of "+ suit;
        }



    }
