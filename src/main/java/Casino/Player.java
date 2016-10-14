package Casino;

import java.util.ArrayList;

/**
 * Created by abijah on 10/11/16.
 */
public class Player {
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
//    public void createPlayer (String name,double number){
//
//    }

}
