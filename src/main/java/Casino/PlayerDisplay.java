package Casino;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by abijah on 10/11/16.
 */
public class PlayerDisplay {
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

    public static void menuDisplay(){
        System.out.println("============================");
        System.out.println("|       MENU SELECTION     |");
        System.out.println("============================");
        System.out.println("| CHOOSE A GAME:           |");
        System.out.println("|        1. BLACKJACK      |");
        System.out.println("|        2. CRAZY 8        |");
        System.out.println("|        3. SLOTS          |");
        System.out.println("|        4. Exit           |");
        System.out.println("============================");

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
