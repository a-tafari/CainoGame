//package Casino;
//
//import java.util.ArrayList;
//import java.util.Vector;
//
///**
// * Created by abijah on 10/11/16.
// */
//public class BlackJack implements GameInterface {
//    CasinoEngine casinoEngine = new CasinoEngine();
//    Deck deck = new Deck();
//    Card card = new Card();
//    Deck.Hand hand = deck.new Hand();
//    boolean running =true;
//    private double money;        // Amount of money the user has.
//    private double bet;            // Amount user bets on a game.
//    private boolean userWins;// Did the user win the game?
//    private double userSum= 0;
//    private double dealerSum=0;
//
//    public void setBet(double number){
//        this.bet = number;
//    }
//
//
//    public void adjustPlayerBalance(double number) {
//
//        Player.playerList.get(0).setBalance(number);
//
//
//    }
//
//    public void endGame() {
//
//    }
//
//    public int getCardValue(String rank) {
//        card.getRank();
//        switch (rank) {
//            case "A":
//                return 1;
//            case "2":
//                return 2;
//            case "3":
//                return 3;
//            case "4":
//                return 4;
//            case "5":
//                return 5;
//            case "6":
//                return 6;
//            case "7":
//                return 7;
//            case "8":
//                return 8;
//            case "9":
//                return 9;
//            case "10":
//                return 10;
//            case "J":
//                return 10;
//            case "Q":
//                return 10;
//            case "K":
//                return 10;
//            default:
//                return  0;
//        }
//
//    }
//
//
//    private boolean runGame() {
//        // Let the user play one game of Blackjack.
//        // Return true if the user wins, false if the user loses.
//        hand.addToUserHand();
//        hand.addToUserHand();
//        hand.addToDealerHand();
//        hand.addToDealerHand();
//
//        /* Check if one of the players has Blackjack (two cards totaling to 21).
//        The player with Blackjack wins the game.  Dealer wins ties.
//         */
//        if (getCardValue(dealerHand) == 21)
//        {
//            System.out.println("Dealer has the " + showCard(getCard(dealerHand, 0)) + " and the " + showCard(getCard(dealerHand, 1)) + ".");
//            System.out.println("User has the " + showCard(getCard(userHand, 0)) + " and the " + showCard(getCard(userHand, 1)) + ".");
//            System.out.println();
//            System.out.println("Dealer has Blackjack.  Dealer wins.");
//            return false;
//        }
//
//        if (value(userHand) == 21)
//        {
//            System.out.println("Dealer has the " + showCard(getCard(dealerHand, 0)) + " and the " + showCard(getCard(dealerHand, 1)) + ".");
//            System.out.println("User has the " + showCard(getCard(userHand, 0)) + " and the " + showCard(getCard(userHand, 1)) + ".");
//            System.out.println();
//            System.out.println("You have Blackjack.  You win.");
//            return true;
//        }
//
//        /*  If neither player has Blackjack, play the game.  The user gets a chance
//        to draw cards (i.e., to "Hit").  The while loop ends when the user
//        chooses to "Stand" or when the user goes over 21.
//         */
//
//        while (true)
//        {
//
//            /* Display user's cards, and let user decide to Hit or Stand. */
//
//            System.out.println();
//            System.out.println();
//            System.out.println("Your cards are:");
//            for (int i = 0; i < userHand.size(); i++)
//            {
//                System.out.println("    " + showCard(getCard(userHand, i)));
//            }
//            System.out.println("Your total is " + value(userHand));
//            System.out.println();
//            System.out.println("Dealer is showing the " + showCard(getCard(dealerHand, 0)));
//            System.out.println();
//            System.out.print("Hit (H) or Stand (S)? ");
//            char userAction;  // User's response, 'H' or 'S'.
//            do
//            {
//                userAction = Character.toUpperCase(scanner.next().charAt(0));
//                if (userAction != 'H' && userAction != 'S')
//                {
//                    System.out.print("Please respond H or S:  ");
//                }
//            } while (userAction != 'H' && userAction != 'S');
//
//            /* If the user Hits, the user gets a card.  If the user Stands, the
//            dealer gets a chance to draw and the game ends.
//             */
//
//            if (userAction == 'S')
//            {
//                // Loop ends; user is done taking cards.
//                break;
//            } else
//            {  // userAction is 'H'.
//                // Give the user a card.  If the user goes over 21, the user loses.
//                int newCard = dealCard();
//                userHand.addElement(newCard);
//                System.out.println();
//                System.out.println("User hits.");
//                System.out.println("Your card is the " + showCard(newCard));
//                System.out.println("Your total is now " + value(userHand));
//                if (value(userHand) > 21)
//                {
//                    System.out.println();
//                    System.out.println("You busted by going over 21.  You lose.");
//                    System.out.println("Dealer's other card was the " + showCard(getCard(dealerHand, 1)));
//                    return false;
//                }
//            }
//
//        } // end while loop
//
//        /* If we get to this point, the user has Stood with 21 or less.  Now, it's
//        the dealer's chance to draw.  Dealer draws cards until the dealer's total is > 16.
//         */
//
//        System.out.println();
//        System.out.println("User stands.");
//        System.out.println("Dealer's cards are");
//        System.out.println("    " + showCard(getCard(dealerHand, 0)));
//        System.out.println("    " + showCard(getCard(dealerHand, 1)));
//        while (value(dealerHand) <= 16)
//        {
//            int newCard = dealCard();
//            System.out.println("Dealer hits and gets the " + showCard(newCard));
//            dealerHand.addElement(newCard);
//        }
//        System.out.println("Dealer's total is " + value(dealerHand));
//
//        /* Now, the winner can be declared. */
//
//        System.out.println();
//        if (value(dealerHand) > 21)
//        {
//            System.out.println("Dealer busted by going over 21.  You win.");
//            return true;
//        } else
//        {
//            if (value(dealerHand) == value(userHand))
//            {
//                System.out.println("Dealer wins on a tie.  You lose.");
//                return false;
//            } else
//            {
//                if (value(dealerHand) > value(userHand))
//                {
//                    System.out.println("Dealer wins, " + value(dealerHand) + " points to " + value(userHand) + ".");
//                    return false;
//                } else
//                {
//                    System.out.println("You win, " + value(userHand) + " points to " + value(dealerHand) + ".");
//                    return true;
//                }
//            }
//        }
//
//    }  // end playBlackjack()
//
//}
//
////        while (running) {
////            PlayerDisplay.displayMessage("You have " + money + " dollars.");
////            do {
////                PlayerDisplay.displayMessage("How many dollars do you want to bet?  (Enter 0 to 100)");
////                bet = UserInput.getANumber();
////                if (bet < 0 || bet > money) {
////                    PlayerDisplay.displayMessage("Don't ASS bet, Your answer must be between 0 and " + money + '.');
////                }
////            } while (bet < 0 || bet > money);
////            if (bet == 0) {
////                break;
////            }
////            userWins = playBlackjack();
////            if (userWins) {
////                money = money + bet;
////                adjustPlayerBalance(money);
////            } else {
////                money = money - bet;
////                adjustPlayerBalance(money);
////            }
////
////            if (money == 0) {
////                PlayerDisplay.displayMessage("You are out of money Playa!");
////                break;
////            }
////        }
////
////            PlayerDisplay.displayMessage("You leave with $" + money + '.');
////            adjustPlayerBalance(money);
////            casinoEngine.displayGameMenu();
////}
////    public int sumOfUserCards (){
////        int sum = 0;
////        String cardDealer= hand.showUserRankValue();
////        int rankValue= getCardValue(cardDealer);
////              sum +=rankValue;
////        return sum;
////    }
////
//
////
////    private boolean playBlackjack() { 
////        // Let the user play one game of Blackjack. 
////        // Return true if the user wins, false if the user loses.
////        //
////        return false;
////    }
////}  // end class
//
////
