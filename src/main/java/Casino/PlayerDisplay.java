package Casino;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Date;

import static jdk.nashorn.internal.objects.Global.getDate;
import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by abijah on 10/11/16.
 */
public class PlayerDisplay {

    static Date date = new Date();

    public static void welcomeScreen(){

        System.out.println(" ██████╗ █████╗ ▄▄███▄▄·██╗███╗   ██╗ ██████╗     \n" +
                "██╔════╝██╔══██╗██╔════╝██║████╗  ██║██╔═══██╗    \n" +
                "██║     ███████║███████╗██║██╔██╗ ██║██║   ██║    \n" +
                "██║     ██╔══██║╚════██║██║██║╚██╗██║██║   ██║    \n" +
                "╚██████╗██║  ██║███████║██║██║ ╚████║╚██████╔╝    \n" +
                " ╚═════╝╚═╝  ╚═╝╚═▀▀▀══╝╚═╝╚═╝  ╚═══╝ ╚═════╝     \n" +
                "                                                  \n" +
                "██████╗ ███████╗██╗     ██╗   ██╗██╗  ██╗███████╗ \n" +
                "██╔══██╗██╔════╝██║     ██║   ██║╚██╗██╔╝██╔════╝ \n" +
                "██║  ██║█████╗  ██║     ██║   ██║ ╚███╔╝ █████╗   \n" +
                "██║  ██║██╔══╝  ██║     ██║   ██║ ██╔██╗ ██╔══╝   \n" +
                "██████╔╝███████╗███████╗╚██████╔╝██╔╝ ██╗███████╗ \n" +
                "╚═════╝ ╚══════╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚══════╝");
    }

    public static void mainMenuDisplay(){
        System.out.println("============================");
        System.out.println("|         MAIN MENU        |");
        System.out.println("============================");
        System.out.println("| CHOOSE:                  |");
        System.out.println("|        1. MAKE ACCOUNT   |");
        System.out.println("|        2. GAME MENU      |");
        System.out.println("|        3. OPTIONS        |");
        System.out.println("|        4. Exit Game      |");
        System.out.println("============================");

    }
    public static void gameMenuDisplay(){
        System.out.println("============================");
        System.out.println("|         GAME MENU        |");
        System.out.println("============================");
        System.out.println("| CHOOSE A GAME:           |");
        System.out.println("|        1. BLACKJACK      |");
        System.out.println("|        2. CRAZY 8        |");
        System.out.println("|        3. SLOTS          |");
        System.out.println("|        4. Exit           |");
        System.out.println("============================");

    }
    static void timeDisplay(){
        print(String.format((char)27 + "[34;1m%76s", date.toString()));
        print((char)27 + "[0m");
    }

    public static void dealerHand(){

    }
    public static void playerHand(){

    }
    public static void blackJackDisplay(){
        System.out.println("██████╗ ██╗      █████╗  ██████╗██╗  ██╗         ██╗ █████╗  ██████╗██╗  ██╗    \n"+
                "██╔══██╗██║     ██╔══██╗██╔════╝██║ ██╔╝         ██║██╔══██╗██╔════╝██║ ██╔╝   \n"+
                "██████╔╝██║     ███████║██║     █████╔╝          ██║███████║██║     █████╔╝    \n"+
                "██╔══██╗██║     ██╔══██║██║     ██╔═██╗     ██   ██║██╔══██║██║     ██╔═██╗    \n" +
                "██████╔╝███████╗██║  ██║╚██████╗██║  ██╗    ╚█████╔╝██║  ██║╚██████╗██║  ██╗   \n" +
                "╚═════╝ ╚══════╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝     ╚════╝ ╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝");
    }
    public static void blackJackRules(){
        System.out.println("House rules:  The dealer hits on a total of 16 or less\n" +
                "        and stands on a total of 17 or more.  Dealer wins ties.\n" +
                "        A new deck of cards is used for each game.");
    }


    public static void blackJackChoice(){
        System.out.println("============================");
        System.out.println("| CHOOSE :                 |");
        System.out.println("|        1. HIT ME         |");
        System.out.println("|        2. STAY           |");
        System.out.println("============================");
    }
    public static void displayMessage(String msg){
        System.out.println(msg);
    }
}
