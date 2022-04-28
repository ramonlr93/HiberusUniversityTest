import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
  int num1 = 5;
  int num2 = 3;

  @Test
  public void myFirstTest(){
    Assert.assertTrue(num1==num2,"Es el valor "+num1+" igual al valor "+num2+"");
    System.out.println("Añado un comentario que se muestra por pantalla para" +
            " realizar cambios y poder hacer commit y push");
  }

  
}
