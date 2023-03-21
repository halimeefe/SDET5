package XpathOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev_01_ extends BaseDriver {


// 1) Bu siteye gidin. -> http://demoqa.com/text-box
//
//            2) Full Name kısmına "Automation" girin.
//
//  3) Email kısmına "Testing@gmail.com" girin.
//
//  4) Current Address kısmına "Testing Current Address" girin.
//
//  5) Permanent Address kısmına "Testing Permanent Address" girin.
//
//  6) Submit butonuna tıklayınız.
//
//  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
//
//            8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

    @Test
    public void Test1() {

        driver.get("http://demoqa.com/text-box");
        WebElement fuulName=driver.findElement(By.xpath("//input[@id='userName']"));
        fuulName.sendKeys("Automation");
       MyFunc.Bekle(2);


        WebElement eMail=driver.findElement(By.xpath("//input[@id='userEmail']"));
       eMail.sendKeys("Testing@gmail.com");
       MyFunc.Bekle(2);

       WebElement CurrentAdres=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        CurrentAdres.sendKeys("Testing Current Address");
        MyFunc.Bekle(2);

        WebElement permanentAdress=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
       permanentAdress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(2);

       WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();
       MyFunc.Bekle(2);

       WebElement msgtext=driver.findElement(By.xpath("//p[@id='name']"));
        System.out.println(msgtext.getText());
        MyFunc.Bekle(2);

        WebElement mailtext=driver.findElement(By.xpath("//p[@id='email']"));
        System.out.println(mailtext.getText());
        MyFunc.Bekle(2);
        driver.quit();


    }
}
