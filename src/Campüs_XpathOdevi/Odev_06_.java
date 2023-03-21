package XpathOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev_06_ extends BaseDriver {

    //6-
//
//    Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
//
//    Fake Alerts'e tıklayınız.
//
//    Show modal dialog buttonuna tıklayınız.
//
//            Ok'a tıklayınız.
//
//    Alert kapanmalıdır.
    @Test
    public void Test1() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fakeAlerts=driver.findElement(By.xpath("//a[@id='fakealerttest']"));
        fakeAlerts.click();
        MyFunc.Bekle(2);

        WebElement showModal=driver.findElement(By.xpath("//input[@id='modaldialog']"));
        showModal.click();
        MyFunc.Bekle(2);

        WebElement ok=driver.findElement(By.xpath("//button[@id='dialog-ok']"));
        ok.click();
        MyFunc.Bekle(2);
        driver.quit();

    }
}
