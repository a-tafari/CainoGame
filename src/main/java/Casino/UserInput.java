package Casino;

import java.util.Scanner;

/**
 * Created by abijah on 10/11/16.
 */
public class UserInput {
    Scanner userInput= new Scanner(System.in);

    public int getOptionNumber(){
        return userInput.nextInt();
    }
    public double getAccountAmount(){
        return userInput.nextInt();
    }
    public int hitorStay(){
        return userInput.nextInt();
    }
}
