package Casino;

/**
 * Created by abijah on 10/11/16.
 */
public class Player {
    private double balance = 0;
    private String playerName;
    //private Card playersCards;


    public Player(){
        //this.playersCards= new Card();
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




}
