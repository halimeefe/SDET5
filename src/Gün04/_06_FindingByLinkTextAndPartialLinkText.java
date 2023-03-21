package Gün04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    public static void main(String[] args) {




        WebDriver driver =new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");// sayfaya gittim


        //LİNKTEXT YOLUYLA ELEMAN BULMA İŞLEMİ SADECE A TAG İNDE KULLANILABİLİR
        WebElement siparislerimLinki=driver.findElement(By.linkText("Siparişlerim"));

        //GÖZÜKEN TEXT İ SİPARİŞLERİM OLAN a TAG Lİ WEBELEMENT
        System.out.println("siparişlerimLinki.getText()="+siparislerimLinki.getText());

        System.out.println(siparislerimLinki.getAttribute("href"));
        System.out.println(siparislerimLinki.getAttribute("title"));
        System.out.println(siparislerimLinki.getAttribute("rel"));

        //Partial LinkText a TAG leri için
        WebElement link2=driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println(link2.getText());

        MyFunc.Bekle(15);
        driver.quit();
    }
}
