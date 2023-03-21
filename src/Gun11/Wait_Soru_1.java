package Gun11;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait_Soru_1 extends BaseDriver {

    // http://demo.seleniumeasy.com/ajax-form-submit-demo.html
//   Name giriniz.
//    Comment giriniz.
//    Submit'e tıklayınız.
//    Form submited Successfully! yazısı görüntülenmelidir.// EXPECTEDCONDİTİONS TEXTTOBE KULLANILMALI
//            assert ile kontrol ediniz


    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");
           WebElement name = driver.findElement(By.cssSelector("input[id='title']"));
           name.sendKeys("Halime");

        WebElement comment = driver.findElement(By.cssSelector("textarea[id='description']"));
        comment.sendKeys("Dersimiz Selenium");

        WebElement submit = driver.findElement(By.cssSelector("input[id='btn-submit']"));
        submit.click();
        // imlicitlyWait elemanın locator bulması süresiyle ilgili buradaki zaten elemanlar hemen bulunuyor
        // burada kriter bulunan elemanın görünen yazısının oluşma süresi
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // findElement

         //ELEMENTE ÖZEL ARAMA SÜRESİ YAPTIK TEXT TO BE ,YAZISI BU OLANA KADAR BEKLE MANASINDA
        WebDriverWait bekle=new WebDriverWait(driver, Duration.ofSeconds(30));
        bekle.until(ExpectedConditions.textToBe(By.cssSelector("[id='submit-control']"),"Form submited Successfully!"));

        // SONRA LOCATORI YAZDIK VE ASSERT DOĞRULAMASINI EKLEDİK VE TESTİ RUN ETTİK
        WebElement mesaj = driver.findElement(By.cssSelector("[id='submit-control']"));
        Assert.assertEquals("Form submited Successfully!",mesaj.getText());

    }
}
