package Casino;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by abijah on 10/11/16.
 */
public class BlackJack implements GameInterface {
    CasinoEngine casinoEngine = new CasinoEngine();
    Deck deck = new Deck();
    Deck.Hand hand = deck.new Hand();
    private double money = Player.playerList.get(0).getBalance();          // Amount of money the user has.
    private double bet;            // Amount user bets on a game.
    private boolean userWins;   // Did the user win the game?

    //Plamoney = 100;  // User starts with $100.
    public void decreasePlayerBalance(double number) {

    }

    public void increasePlayerBalance(double number) {
        Player.playerList.get(0).setBalance(number);
    }

    private void adjustPlayerBalance(double number) {

        Player.playerList.get(0).setBalance(number);


    }

    public void endGame() {

    }



    public void runGame() {


        while (true) {
            PlayerDisplay.displayMessage("You have " + money + " dollars.");
            do {
                PlayerDisplay.displayMessage("How many dollars do you want to bet?  (Enter 0 to 100)");
                bet = UserInput.getANumber();
                if (bet < 0 || bet > money) {
                    PlayerDisplay.displayMessage("Don't ASS bet, Your answer must be between 0 and " + money + '.');
                }
            } while (bet < 0 || bet > money);
            if (bet == 0) {
                break;
            }
            userWins = playBlackjack();
            if (userWins) {
                money = money + bet;
                adjustPlayerBalance(money);
            } else {
                money = money - bet;
                adjustPlayerBalance(money);
            }

            if (money == 0) {
                PlayerDisplay.displayMessage("You are out of money Playa!");
                break;
            }
        }

            PlayerDisplay.displayMessage("You leave with $" + money + '.');
            adjustPlayerBalance(money);
            casinoEngine.displayGameMenu();
}
    public int sumOfUserCards (){
        int sum = 0;
        String cardDealer= hand.showUserRankValue();
        int rankValue= getCardValue(cardDealer);
              sum +=rankValue;
        return sum;
    }

    public int getCardValue(String rank)
    {
        switch (rank) {
            case "A":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "J":
                return 10;
            case "Q":
                return 10;
            case "K":
                return 10;
            default:
                return  0;
        }
    }
}  // end class


