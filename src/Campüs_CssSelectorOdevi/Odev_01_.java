package CssSelectorOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev_01_ extends BaseDriver {


//  1) Bu siteye gidin. -> http://demoqa.com/text-box
//
//  2) Full Name kısmına "Automation" girin.
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
    public void Test1()
    {

        driver.get("http://demoqa.com/text-box");

        WebElement fullName=driver.findElement(By.cssSelector("input[type='text'][id='userName']"));
       fullName.sendKeys("Automation");
        MyFunc.Bekle(2);

      WebElement email=driver.findElement(By.cssSelector("[type='email'][id='userEmail']"));
       email.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(2);

        WebElement currentAdress =driver.findElement(By.cssSelector("[placeholder='Current Address'][id='currentAddress']"));
      currentAdress.sendKeys("Testing Current Address");
        MyFunc.Bekle(2);

        WebElement permAdress=driver.findElement(By.cssSelector("[class='form-control'][id='permanentAddress']"));
     permAdress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(2);

        WebElement submit=driver.findElement(By.cssSelector("[type='button'][id='submit']"));
      submit.click();
      MyFunc.Bekle(2);

      WebElement msg = driver.findElement(By.cssSelector("p[id='name']"));
      Assert.assertTrue(msg.getText().contains("Automation"));
      MyFunc.Bekle(2);

     WebElement mailtext = driver.findElement(By.cssSelector("p[id='email']"));
     Assert.assertTrue(mailtext.getText().contains("Testing"));

     BekleKapat();
    



    }
}
