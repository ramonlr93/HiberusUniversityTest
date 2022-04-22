import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
  int num1 = 5;
  int num2 = 5;

  @Test
  public void myFirstTest(){
    Assert.assertEquals(num1, num2,"Es el valor "+num1+" igual al valor "+num2+"");
  }
}
