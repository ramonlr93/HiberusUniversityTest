import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
  int num1 = 10;
  int num2 = 5;

  int num3 = 2;
  @Test
  public void myFirstTest(){
    Assert.assertTrue(num1==num2,"Es el valor "+num1+" igual al valor "+num2+"");
  }
}
