import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
  int num1 = 5;
  int num2 = 3;

  @Test
  public void myFirstTest(){
    Assert.assertNotEquals(num2, num1, "Es el valor " + num1 + " igual al valor " + num2 + "");
  }

}
