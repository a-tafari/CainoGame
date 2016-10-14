package Casino;

import java.util.ArrayList;

/**
 * Created by abijah on 10/11/16.
 */
public class Player {
    static CasinoEngine casinoEngine = new CasinoEngine();
    private double balance = 0;
    private String playerName;
    //private Card playersCards;
    static ArrayList<Player> playerList = new ArrayList<Player>();

    public Player(String name,double number){
        this.playerName = name;
        this.balance = number;

        //this.playersCards= new Card();
    }
    public static void addPlayer(Player player){
        playerList.add(player);
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public double addToBalance(double number){
        balance += number;
        return balance;
    }
    public double subtractFromBalance(double number){
        balance -= number;
        return balance;
    }
    public static void checkForPlayerInListAndCreatePlayer(){
        if(Player.playerList.isEmpty()) {
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
    }
//    public void createPlayer (String name,double number){
//
//    }

}
