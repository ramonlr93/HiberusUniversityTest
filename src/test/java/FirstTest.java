import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
  // variables
  int num1 = 5;
  int num2 = 3;
  
  // caso de prueba suma de valores
  @Test
  public void myFirstTest(){
    Assert.assertTrue(num1==num2,"Es el valor "+num1+" igual al valor "+num2+"");
  }
}
