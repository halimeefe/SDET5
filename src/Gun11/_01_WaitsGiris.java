package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _01_WaitsGiris extends BaseDriver {

    /*

              SELENİUM BEKLETME KOMUTLARI

              IMPLİCİTLY WAİT :
              TÜM SAYFADAKİ ELEMANLAR İÇİN,ELEMANIN LOCATORI SAYFA İÇİNDE BULUNABİLİR HALE
              GELENE KADAR VERİLEN BEKLEME SÜRESİDİR.
              BÜTÜN ELEMANLAR İÇİN GEÇERLİ VE ELEMAN BULUNDUĞUNDA KALAN SÜREYİ BEKLEMEZ
              NO SUCH ELEMENT HATASI İÇİN VERİLEN SÜRE KADAR BEKLER


              EXPLİCİT WAİT: TEK BİR ELEMANA ÖZEL KRİTER OLARAK TANIMLANIR SADECE İLGİLİ ELEMANDA GEÇERLİDİR
              ELEMENTE ÖZEL KULLANILIR


       ** PAGELOADTİMEOUT :
       ** driver.manage().timeouts().pageLoadTimeout(dr);
       30 sn süresinde sayfanın yüklenmesini bekliyor, bu süreden sonra timeout düşerek hata verir.

       Duration muhlet=Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(muhlet);
*/
    @Test
    public void Test1() {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        WebElement btn=driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();

        Duration muhlet = Duration.ofSeconds(15);
        driver.manage().timeouts().implicitlyWait(muhlet);// html içinde locatoru bulma süresi yani findelemeti bulma süresi

       // MyFunc.Bekle(30);// BU FOKSİYON PROGRAMI(JAVA YI) DURDURUYOR  // SAYFAYLA BİR İLGİSİ OLMADIĞI İÇİN SONUNA KADAR BEKLER
        //SAYFAYI GEREKSİZ YERE  BEKLETMİŞ OLUR BESTPRACTİCE VE TAVSİYE EDİLEN BİR METHOD DEĞİLDİR
        //İNTERVİEW LARDA BEKLETME OLARAK KESİNLİKLE SÖYLENMEMELİ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        WebElement msj=driver.findElement(By.xpath("//p[text()='WebDriver']"));
    }
}