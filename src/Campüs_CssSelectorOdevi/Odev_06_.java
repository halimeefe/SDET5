package CssSelectorOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev_06_ extends BaseDriver {

//    Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
//
//    Fake Alerts'e tıklayınız.
//
//    Show modal dialog buttonuna tıklayınız.
//
//    Ok'a tıklayınız.
//
//    Alert kapanmalıdır.
//

    @Test
    public void Test1() {

        driver.get(" https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(3);


        WebElement fakeAllerts=driver.findElement(By.cssSelector("a[id='fakealerttest']"));
        fakeAllerts.click();

        MyFunc.Bekle(3);

        WebElement showModalDialog=driver.findElement(By.cssSelector("input[id='modaldialog']"));
        showModalDialog.click();

        MyFunc.Bekle(3);

        WebElement ok=driver.findElement(By.cssSelector("button[id='dialog-ok']"));
        ok.click();

       BekleKapat();






    }
}
