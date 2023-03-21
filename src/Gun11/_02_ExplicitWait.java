package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



/*            Selenium Bekletme Komutları

      pageLoadTimeout :
      driver.manage().timeouts().pageLoadTimeout(dr);
      30 sn süresinde sayfanın yüklenmesini bekliyor, bu süreden sonra timeout düşerek hata verir.

     ImplicitlyWait:
     Tüm sayfadaki elemanlar için, elemanın locatorı sayfa içinde bulanabilir hale getirene kadar verilen bekleme süresi.
     Bütün elemanlar için geçerli ve eleman bulunduğunda kalan süreyi beklemez.NoSuchElement hatasını için verilen süre
     kadar beler.

        Duration muhlet=Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(muhlet);

     Explicit  Wait  : Tek bir eleman özel Kriter olarak tanımlanır sadece ilgili elemanda geçerli olur
                                         */

public class _02_ExplicitWait extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        WebElement btn = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();

        WebDriverWait bekle=new WebDriverWait(driver, Duration.ofSeconds(30));
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));// İMPLİCİTLYWAİT E GEREK KALMAZ
        //BEKLENEN KRİTERLERDEN  ->EXPECTEDCONDİTİONS
        //VERİLEN LOCATORDAKİ ELEMENT GÖZÜKÜR HALE -> VİSİBİLİTYOFELEMENTLOCATED
        // GELENE KADAR BEKLE -> BEKLE.UNTİL
        System.out.println("bitti = ");//bulduğu zaman bitmesini görelim



    }
}
