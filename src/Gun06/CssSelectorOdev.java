package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumOdev extends BaseDriver {

    // 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
    // 2- Business i çekleyin.**tikleyin
    // 3- discover XYZ ye tıklatın ve online Advertising i seçin
    // 4- Every day i seçin
    // 5- Good u seçin
    // 6- using XYZ yi tıklatın ve 3.seçeneği seçin
    // css selector

    @Test
    public void Test1() {

//        driver.get(" https://formsmarts.com/form/yu?mode=h5");
//        WebElement business =driver.findElement(By.cssSelector("input[type='radio'][value='Business']"));
//        business.click();
//        MyFunc.Bekle(2);
//
//
//        WebElement select =driver.findElement(By.cssSelector("select[id$='_4588']"));
//        select.click();
//        MyFunc.Bekle(2);
//
//      WebElement onlineAdvertising =driver.findElement(By.cssSelector("[value='Online Advertising']"));
//       onlineAdvertising.click();
//        MyFunc.Bekle(2);
//
//
//        WebElement everyDay=driver.findElement(By.cssSelector("input[type='radio'][value='Every Day']"));
//       everyDay.click();
//        MyFunc.Bekle(2);
//
//
//       WebElement good=driver.findElement(By.cssSelector("input[type='radio'][value='Good']"));
//       good.click();
//        MyFunc.Bekle(2);
//
//
//       WebElement usingXyz=driver.findElement(By.cssSelector("select[id$='_4597']>:nth-child(4)"));
//       usingXyz.click();
//
//     BekleKapat();

        driver.get("https://www.saucedemo.com/");
        MyFunc.Bekle(2);

        WebElement userName = driver.findElement(By.xpath("//*[@id='user-name']"));
        userName.sendKeys("standard_user");
        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("secret_sauce");
        MyFunc.Bekle(2);

        WebElement login = driver.findElement(By.xpath("//*[@id='login-button']"));
        login.click();
        MyFunc.Bekle(2);

        WebElement backpack = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        backpack.click();
        MyFunc.Bekle(2);

        WebElement cart = driver.findElement(By.xpath("//*[text()='Add to cart']"));
        cart.click();
        MyFunc.Bekle(2);

        WebElement back = driver.findElement(By.xpath("//*[@id='back-to-products']"));
        back.click();
        MyFunc.Bekle(2);

        WebElement tshirt = driver.findElement(By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']"));
        tshirt.click();
        MyFunc.Bekle(2);

        WebElement cart2 = driver.findElement(By.xpath("//*[text()='Add to cart']"));
        cart2.click();
        MyFunc.Bekle(2);

        WebElement clickToCart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        clickToCart.click();
        MyFunc.Bekle(2);

        WebElement checkout = driver.findElement(By.xpath("//*[text()='Checkout']"));
        checkout.click();
        MyFunc.Bekle(2);

        WebElement firstName = driver.findElement(By.xpath("//*[@id='first-name']"));
        firstName.sendKeys("ismail");
        MyFunc.Bekle(2);

        WebElement lastName = driver.findElement(By.xpath("//*[@id='last-name']"));
        lastName.sendKeys("ozcelik");
        MyFunc.Bekle(2);

        WebElement postalCode = driver.findElement(By.xpath("//*[@id='postal-code']"));
        postalCode.sendKeys("34520");
        MyFunc.Bekle(2);


        WebElement cont = driver.findElement(By.xpath("//*[@id='continue']"));
        cont.click();
        MyFunc.Bekle(2);

        WebElement price1 = driver.findElement(By.xpath("(//*[@class='inventory_item_price'])[1]"));
        double total = 0;
        total = total + Double.parseDouble(price1.getText().substring(1));

        WebElement price2 = driver.findElement(By.xpath("(//*[@class='inventory_item_price'])[2]"));
        total = total + Double.parseDouble(price2.getText().substring(1));

        WebElement itemTotal = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        double item=0;
        item= Double.parseDouble(itemTotal.getText().substring(13));

        Assert.assertTrue(total==item);

        BekleKapat();







    }
}



