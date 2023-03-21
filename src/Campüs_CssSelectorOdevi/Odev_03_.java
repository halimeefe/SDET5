package CssSelectorOdevi;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev_03_ extends BaseDriver {


//            1) Bu siteye gidin. -> https://www.snapdeal.com/
//
//             2) "teddy bear" aratın ve Search butonuna tıklayın.
//
//             3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
//             Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

    @Test
    public void Test1() {

        driver.get("https://www.snapdeal.com/");
        String searc="teddy bear";

       WebElement searchBox=driver.findElement(By.cssSelector("div[class='col-xs-14 search-box-wrapper']>:nth-child(2)"));
       searchBox.sendKeys(searc);

       WebElement search=driver.findElement(By.cssSelector("span[class='searchTextSpan']"));
       search.click();

        BekleKapat();



    }
}
