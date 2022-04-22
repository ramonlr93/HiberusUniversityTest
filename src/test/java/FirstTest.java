import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
  int num1 = 3;
  int num2 = 3;
  // Ahora son iguales heheheh David Herce
  @Test
  public void myFirstTest(){
    Assert.assertTrue(num1==num2,"Es el valor "+num1+" igual al valor "+num2+"");
  }
}
