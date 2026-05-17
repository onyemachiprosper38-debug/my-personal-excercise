import org.junit.jupiter.api.Test;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
 




public class PizzaWahala {

@Test

public  void testSapaSize (){

PizzaWahala sapasize = new PizzaWahala();

int actual = sapasize.numberOfBoxes(5);
int  expected = 4;

assertEquals(actual, expected);


}


@Test

public void testSmallMoney (){

PizzaWahala smallmoney = new PizzaWahala();

int actual = smallmoeney.numberOfBoxes(7);
int expected = 6;

assertEquals(actual, expected);

}

@Test

public void testBigBoys(){

PizzaWahala bigboys = new PizzaWahala();

int actual = bigboys.numberOfBoxes(9);
int expected = 8;

assertEquals(actual, expected);

}

@Test

public void testOdogwu(){

BackToSender odowu = new PizzaWahala();

int actual = odogwu.numberOfBoxes(10);
int expected = 9;

assertEquals(actual, expected);


  }

 }
