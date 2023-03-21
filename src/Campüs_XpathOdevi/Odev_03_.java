package XpathOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev_03_ extends BaseDriver {

//   3-
//           1) Bu siteye gidin. -> https://www.snapdeal.com/
//
//            2) "teddy bear" aratın ve Search butonuna tıklayın.
//
//            3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
//            Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

    @Test
    public void Test1() {

        driver.get("https://www.snapdeal.com/");
        WebElement searcbox=driver.findElement(By.xpath("//input[@type='text' and @ id='inputValEnter']"));
        searcbox.sendKeys("teddy bear");
        MyFunc.Bekle(2);

        WebElement button =driver.findElement(By.xpath("//*[@class='searchTextSpan']"));
        button.click();
        MyFunc.Bekle(2);

        WebElement text =driver.findElement(By.xpath("//span[@class='nnn']"));
        System.out.println("Text:"+text.getText());
        MyFunc.Bekle(2);
        driver.quit();


    }
}
