package Casino;

import java.util.Random;

import static Casino.Player.casinoEngine;
import static javax.sound.midi.ShortMessage.START;

/**
 * Created by abijah on 10/11/16.
 */
public class Slots implements GameInterface {
//CasinoEngine casinoEngine = new CasinoEngine();

    double balance= START;
    int wheel1 = 1;
    int wheel2 = 1;
    int wheel3 = 1;
    double bet = 0;
    boolean play = true;
    /* Spins the wheel and returns a value from 1 to 6 */
    public int spin(){
        Random rgen = new Random();
        int spinValue = rgen.nextInt(6) + 1;
        return spinValue;

    }
    public  void getPlayersbalance(){
        this.balance =Player.playerList.get(0).getBalance();
    }
    public void setBalance(double bet){

    }

    public String spinToString(int n) {
        switch (n) {
            case 1: return ("CHERRY");
            case 2: return ("LEMON");
            case 3: return ("ORANGE");
            case 4: return ("PLUM");
            case 5: return ("BELL");
            case 6: return ("BAR");
            default: return ("ERROR");
        }
    }
    public void runGame() {


        PlayerDisplay.displayMessage("Just $1 to play! Pull the handle!");
            while (balance > 0) {
                PlayerDisplay.displayMessage("Place your bet, enter 0 to quit");
                this.bet = UserInput.getANumber();
                if(this.bet == 0){
                    break;
                }
                    wheel1 = spin();
                    wheel2 = spin();
                    wheel3 = spin();
                    if (wheel1 == 6 && wheel2 == 6 && wheel3 == 6) {
                        PlayerDisplay.displayMessage(spinToString(wheel1) + "   " + spinToString(wheel2) + "   " + spinToString(wheel3) + "  -- You win 250");
                        balance += 250;
                    } else if (wheel1 == 5 && wheel2 == 5 && (wheel3 == 5 || wheel3 == 6)) {
                        PlayerDisplay.displayMessage(spinToString(wheel1) + "   " + spinToString(wheel2) + "   " + spinToString(wheel3) + "  -- You win $20");
                        balance += 19;
                    } else if (wheel1 == 4 && wheel2 == 4 && (wheel3 == 4 || wheel3 == 6)) {
                        PlayerDisplay.displayMessage(spinToString(wheel1) + "   " + spinToString(wheel2) + "   " + spinToString(wheel3) + "  -- You win $14");
                        balance += 13;
                    } else if (wheel1 == 3 && wheel2 == 3 && (wheel3 == 3 || wheel3 == 6)) {
                        PlayerDisplay.displayMessage(spinToString(wheel1) + "   " + spinToString(wheel2) + "   " + spinToString(wheel3) + "  -- You win $10");
                        balance += 9;
                    } else if (wheel1 == 1 && wheel2 == 1 && wheel3 == 1) {
                        PlayerDisplay.displayMessage(spinToString(wheel1) + "   " + spinToString(wheel2) + "   " + spinToString(wheel3) + "  -- Three Cherries! You win $7");
                        balance += 6;
                    } else if (wheel1 == 1 && wheel2 == 1) {
                        PlayerDisplay.displayMessage(spinToString(wheel1) + "   " + spinToString(wheel2) + "   " + spinToString(wheel3) + "  -- You win $5");
                        balance += 4;
                    } else if (wheel1 == 1) {
                        PlayerDisplay.displayMessage(spinToString(wheel1) + "   " + spinToString(wheel2) + "   " + spinToString(wheel3) + "  -- You win $2");
                        balance += 1;
                    } else {
                        PlayerDisplay.displayMessage(spinToString(wheel1) + "   " + spinToString(wheel2) + "   " + spinToString(wheel3) + " -- You lose.");
                        balance -= 1;
                    }


            }



        PlayerDisplay.displayMessage("Yeah, quit while you're ahead! You've scored an extra $" + (balance - START) + ". Come again soon!");
        PlayerDisplay.displayMessage("Thanks for playing! Come again soon!");
        PlayerDisplay.displayMessage(Double.toString(balance));

        casinoEngine.displayGameMenu();
    }



//    public void endGame(){
//
//    }
}
