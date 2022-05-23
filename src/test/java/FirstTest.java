import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
  int num1 = 5;
  int num2 = 3;

  @Test
  public void myFirstTest(){
    Assert.assertTrue(num1==num2,"Es el valor cambiado "+num1+" igual al valor "+num2+"");
  }
}
