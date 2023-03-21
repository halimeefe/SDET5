package XpathOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev_04_ extends BaseDriver {


//  4-
//
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


    @Test
    public void Test1() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement calculate=driver.findElement(By.xpath("//a[@id='calculate']"));
        calculate.click();
        MyFunc.Bekle(2);

        WebElement inputOne=driver.findElement(By.xpath("//input[@id='number1' and @type='text']"));
        inputOne.sendKeys("90");
        MyFunc.Bekle(2);

        WebElement inputTwo=driver.findElement(By.xpath("//input[@id='number2' and @type='text']"));
        inputTwo.sendKeys("30");
        MyFunc.Bekle(2);

        WebElement button=driver.findElement(By.xpath("//input[@id='calculate']"));
        button.click();
        MyFunc.Bekle(2);

        WebElement answer=driver.findElement(By.xpath("//span[@id='answer']"));
        System.out.println("Answer :"+answer.getText());
        MyFunc.Bekle(2);
        driver.quit();


    }
}
