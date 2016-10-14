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

    public static void playSlotsDisplay(){
        System.out.println("                   .-------.\n" +
                "                              |Jackpot|\n" +
                "                  ____________|_______|____________\n" +
                "                 |  __    __    ___  _____   __    |  \n" +
                "                 | / _\\  / /   /___\\/__   \\ / _\\   | \n" +
                "                 | \\ \\  / /   //  //  / /\\ \\\\ \\  25|  \n" +
                "                 | _\\ \\/ /___/ \\_//  / /  \\/_\\ \\ []| \n" +
                "                 | \\__/\\____/\\___/   \\/     \\__/ []|\n" +
                "                 |===_______===_______===_______===|\n" +
                "                 ||*|\\_     |*| _____ |*|\\_     |*||\n" +
                "                 ||*|| \\ _  |*||     ||*|| \\ _  |*||\n" +
                "                 ||*| \\_(_) |*||*BAR*||*| \\_(_) |*||\n" +
                "                 ||*| (_)   |*||_____||*| (_)   |*|| __\n" +
                "                 ||*|_______|*|_______|*|_______|*||(__)\n" +
                "                 |===_______===_______===_______===| ||\n" +
                "                 ||*| _____ |*|\\_     |*|  ___  |*|| ||\n" +
                "                 ||*||     ||*|| \\ _  |*| |_  | |*|| ||\n" +
                "                 ||*||*BAR*||*| \\_(_) |*|  / /  |*|| ||\n" +
                "                 ||*||_____||*| (_)   |*| /_/   |*|| ||\n" +
                "                 ||*|_______|*|_______|*|_______|*||_//\n" +
                "                 |===_______===_______===_______===|_/\n" +
                "                 ||*|  ___  |*|   |   |*| _____ |*||\n" +
                "                 ||*| |_  | |*|  / \\  |*||     ||*||\n" +
                "                 ||*|  / /  |*| /_ _\\ |*||*BAR*||*||              \n" +
                "                 ||*| /_/   |*|   O   |*||_____||*||        \n" +
                "                 ||*|_______|*|_______|*|_______|*||\n" +
                "                 |lc=___________________________===|\n" +
                "                 |  /___________________________\\  |\n" +
                "                 |   |                         |   |\n" +
                "                _|    \\_______________________/    |_\n" +
                "               (_____________________________________)\n");
    }
}
