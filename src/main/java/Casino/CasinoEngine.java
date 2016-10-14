package Casino;

/**
 * Created by abijah on 10/11/16.
 */
public class CasinoEngine {
    //private Player player = new Player();
    private MenuTerminal menuTerminal = new MenuTerminal();
    //private BlackJack blackJack = new BlackJack();
    private Slots slots =new Slots();
    public CasinoEngine(/*PlayerDisplay display, Userinput userInput*/) {


    }

    public void startCasinoEngine() {
        //PlayerDisplay.timeDisplay();
        PlayerDisplay.welcomeScreen();
        PlayerDisplay.mainMenuDisplay();
        int userInput = UserInput.getANumber();
        menuTerminal.chooseMenuOption(userInput);

    }

    public void returnToMain() {
        //PlayerDisplay.timeDisplay();
        PlayerDisplay.mainMenuDisplay();
        int userInput = UserInput.getANumber();
        menuTerminal.chooseMenuOption(userInput);

    }

    public void displayGameMenu() {
        //PlayerDisplay.timeDisplay();
        PlayerDisplay.gameMenuDisplay();
        int userInput = UserInput.getANumber();
        menuTerminal.chooseGameToPlay(userInput);
    }
//    public void playBlackJack(){
//
//        PlayerDisplay.displayMessage("Enter Bet");
//        if(blackJack.runGame());
//
//
//    }
    public  void playSlots(){
       // PlayerDisplay.playSlotsDisplay();
        //slots.runGame();
    }


    public void displayOptions() {

    }

    public void exitGame() {
        PlayerDisplay.displayMessage("GOOD BYE");
    }
}
