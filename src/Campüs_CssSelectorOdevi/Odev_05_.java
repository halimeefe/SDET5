package CssSelectorOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev_05_ extends BaseDriver {


//    Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
//
//    Fake Alerts' tıklayınız.
//
//    Show Alert Box'a tıklayınız.
//
//    Ok'a tıklayınız.
//
//    Alert kapanmalıdır.

    @Test
    public void Test1() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(3);

        WebElement fakealertts=driver.findElement(By.cssSelector("a[id='fakealerttest']"));
        fakealertts.click();

        MyFunc.Bekle(3);


        WebElement showAlertBox=driver.findElement(By.cssSelector("input[id='fakealert']"));
        showAlertBox.click();

        MyFunc.Bekle(3);

        WebElement ok=driver.findElement(By.cssSelector("button[id='dialog-ok']"));
        ok.click();

        BekleKapat();


    }
}
