//package Casino;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
///**
// * Created by abijah on 10/11/16.
// */
//public class BlackJackTest {
//    Player player;
//    BlackJack blackJack;
//    private String name = "Abijah";
//    private  double  balance = 2000.00;
//    static final double DELTA= .0000001;
//
//    @Before
//
//    public void setUp(){
//        blackJack = new BlackJack();
//        player = new Player(name,balance);
//    }
//    @Test
//    public void testToSeeIfBalanceIsReturned(){
//        player.setBalance(balance);
//        double actual= player.getBalance();
//        //blackJack.increasePlayerBalance(1000);
//        double expected= player.getBalance();
//        Assert.assertEquals("should be: ", expected, actual);
//
//    }
//}
