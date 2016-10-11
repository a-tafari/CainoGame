package Casino;

/**
 * Created by abijah on 10/2/16.
 */
public class Card {

        private int rank;
        private int suit;

        private static String[] suits = { "hearts", "spades", "diamonds", "clubs" };

        private static String[] ranks  = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };


        public static String valueAsString( int rank ) {
        return ranks[rank];
    }

        Card(short suit, short rank){
            this.rank=rank;
            this.suit=suit;
        }



        public @Override String toString() {
            return ranks[rank] + " of " + suits[suit];
        }


        public int getRank() {
        return rank;
    }

        public int getSuit() {
        return suit;
    }

    }
