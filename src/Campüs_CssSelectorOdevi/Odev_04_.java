package CssSelectorOdevi;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev_04_ extends BaseDriver {

//    Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
//
//    Calculate'e tıklayınız.
//
//    İlk input'a herhangi bir sayı giriniz.
//
//    İkinci input'a herhangi bir sayı giriniz.
//
//    Calculate button'una tıklayınız.
//
//    Sonucu alınız.
//
//    Sonucu yazdırınız.
//
    @Test
    public void Test1() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculate=driver.findElement(By.cssSelector("a[id='calculate']"));
        calculate.click();

           String number1="5";
           WebElement n1=driver.findElement(By.cssSelector("input[id='number1']"));
           n1.sendKeys(number1);

           String number2="10";
           WebElement n2=driver.findElement(By.cssSelector("input[id='number2']")) ;
           n2.sendKeys(number2);

           WebElement calcButton=driver.findElement(By.cssSelector("input[id='calculate']"))  ;
           calcButton.click();

          WebElement answer=driver.findElement(By.cssSelector("span[id='answer']")) ;



           BekleKapat();
    }
}
