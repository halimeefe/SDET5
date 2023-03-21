package XpathOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev_02_ extends BaseDriver {

//  2-
//            1) Bu siteye gidin. -> https://demo.applitools.com/
//
//            2) Username kısmına "ttechno@gmail.com" girin.
//
//            3) Password kısmına "techno123." girin.
//
//            4) "Sign in" buttonunan tıklayınız.
//
//            5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.

    @Test
    public void Test1() {

        driver.get("https://demo.applitools.com/");
        WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
        userName.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(2);

        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("techno123.");
        MyFunc.Bekle(2);

        WebElement signIn=driver.findElement(By.xpath("//a[@id='log-in']"));
        signIn.click();
        MyFunc.Bekle(2);

        WebElement text=driver.findElement(By.xpath("//h6[@id='time']"));
        System.out.println("Text :"+text.getText());
        MyFunc.Bekle(2);
        driver.quit();

    }
}
