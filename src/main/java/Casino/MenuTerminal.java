package Casino;

/**
 * Created by abijah on 10/13/16.
 */

public class MenuTerminal {
    CasinoEngine casinoEngine;
    Player player;
    Slots slots = new Slots();
    public void chooseMenuOption(int userInput){
        casinoEngine = new CasinoEngine();

        switch (userInput){
            case 1 :Player.checkForPlayerInListAndCreatePlayer();
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
            default: casinoEngine.returnToMain();
                break;

        }
    }
    public void chooseGameToPlay(int userInput){
        switch (userInput){
            case 1 : PlayerDisplay.blackJackDisplay();
                     PlayerDisplay.blackJackRules();
                     //casinoEngine.playBlackJack();
                break;
            case 2  :
                break;
            case 3  :PlayerDisplay.playSlotsDisplay();
                     slots.runGame();
                     //casinoEngine.playSlots();

                break;
            case 4  :casinoEngine.exitGame();
                break;
            default: casinoEngine.displayGameMenu();
                break;


        }
    }
}
