package Casino;

/**
 * Created by abijah on 10/13/16.
 */

public class MenuTerminal {
    CasinoEngine casinoEngine;

    public void chooseMenuOption(int userInput){
        casinoEngine = new CasinoEngine();
        switch (userInput){
            case 1 :if(Player.playerList.isEmpty()) {
                PlayerDisplay.displayMessage("ENTER YOUR NAME: ");
                String name = UserInput.getName();
                PlayerDisplay.displayMessage("ENTER AMOUNT: ");
                double amount = UserInput.getAccountAmount();
                if (amount >= 2500) {
                    PlayerDisplay.displayMessage("The amount you've entered is to high. \n Please enter an amount under $2500");
                    casinoEngine.returnToMain();
                }
                else {
                    Player player = new Player(name, amount);
                    Player.playerList.add(player);
                    casinoEngine.displayGameMenu();
                }
            }
            else {
                PlayerDisplay.displayMessage("AN ACCOUNT FOR THIS USER ALREADY EXIST");
                casinoEngine.returnToMain();
            }
                break;
            case 2 :if(Player.playerList.isEmpty()) {
                casinoEngine.returnToMain();
            }
                casinoEngine.displayGameMenu();
                break;
            case 3 : casinoEngine.displayOptions();

                break;
            case 4 : casinoEngine.exitGame();
                break;
        }
    }
    public void chooseGameToPlay(int userInput){
        switch (userInput){
            case 1 :PlayerDisplay.blackJackDisplay();
                    PlayerDisplay.blackJackRules();


        }
    }
}
