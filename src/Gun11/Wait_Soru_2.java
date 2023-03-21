package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait_Soru_2 extends BaseDriver {
/*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */

    @Test
    public void Test1() {
        driver.get("https://www.demoblaze.com/index.html");
         WebElement product = driver.findElement(By.linkText("Samsung galaxy s6"));
        product.click();


        WebElement addToCart=driver.findElement(By.linkText("Add to cart"));
       addToCart.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());  // alert çıkana kadar bekle,ELEMENTE ÖZEL EXPECTEDCONDİTİONS KULLANDIK
        driver.switchTo().alert().accept();// sağ üstte çıkan  alert "OK" kutucuğunu ortadan kaldırdık

        WebElement back=driver.findElement(By.id("nava"));

        back.click();

        BekleKapat();


    }
}
