import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
  int num1 = 8;
  int num2 = 8;

  @Test
  public void myFirstTest(){
    Assert.assertEquals(num1, num2,"El valor de num1: "+num1+" NO es igual al valor de num2: "+num2+"");
  }
}
