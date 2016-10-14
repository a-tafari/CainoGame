package Casino;

import java.util.Scanner;

/**
 * Created by abijah on 10/11/16.
 */
public class UserInput {
    static Scanner userInput= new Scanner(System.in);

    public static String getName(){
        return userInput.next();
    }
    public static int getANumber(){
        return userInput.nextInt();
    }
    public static double getAccountAmount(){
        return userInput.nextInt();
    }
    public static int hitorStay(){
        return userInput.nextInt();
    }
}
