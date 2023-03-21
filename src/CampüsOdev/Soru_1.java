package CampüsOdev;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Soru_3 extends BaseDriver {

    //  challenge sorusu
    //  Ödev 3: http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
    //  buradaki bütün şehirleri bütün ülkere doğru şekilde topluca dağıtınız.


    @Test
    public void Test1() {

        driver.get(" http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        Actions aksiyonlar = new Actions(driver);

        WebElement city1 = driver.findElement(By.id("a1"));
        WebElement contry1 = driver.findElement(By.xpath("//div[@id='q1']"));

        aksiyonlar.clickAndHold(city1).build().perform();
        MyFunc.Bekle(1);
        aksiyonlar.moveToElement(contry1).release().build().perform();

        WebElement city2 = driver.findElement(By.id("a2"));
        WebElement contry2 = driver.findElement(By.xpath("//div[@id='q2']"));

        aksiyonlar.clickAndHold(city2).build().perform();
        MyFunc.Bekle(1);
        aksiyonlar.moveToElement(contry2).release().build().perform();

        WebElement city3 = driver.findElement(By.id("a3"));
        WebElement contry3 = driver.findElement(By.xpath("//div[@id='q3']"));

        aksiyonlar.clickAndHold(city3).build().perform();
        MyFunc.Bekle(1);
        aksiyonlar.moveToElement(contry3).release().build().perform();

        WebElement city4 = driver.findElement(By.id("a4"));
        WebElement contry4 = driver.findElement(By.xpath("//div[@id='q4']"));

        aksiyonlar.clickAndHold(city4).build().perform();
        MyFunc.Bekle(1);
        aksiyonlar.moveToElement(contry4).release().build().perform();

        WebElement city5 = driver.findElement(By.id("a5"));
        WebElement contry5 = driver.findElement(By.xpath("//div[@id='q5']"));

        aksiyonlar.clickAndHold(city5).build().perform();
        MyFunc.Bekle(1);
        aksiyonlar.moveToElement(contry5).release().build().perform();

        WebElement city6 = driver.findElement(By.id("a6"));
        WebElement contry6 = driver.findElement(By.xpath("//div[@id='q6']"));

        aksiyonlar.clickAndHold(city6).build().perform();
        MyFunc.Bekle(1);
        aksiyonlar.moveToElement(contry6).release().build().perform();

        WebElement city7 = driver.findElement(By.id("a7"));
        WebElement contry7 = driver.findElement(By.xpath("//div[@id='q7']"));

        aksiyonlar.clickAndHold(city7).build().perform();
        MyFunc.Bekle(1);
        aksiyonlar.moveToElement(contry7).release().build().perform();

        WebElement city8 = driver.findElement(By.id("a8"));
        WebElement contry8 = driver.findElement(By.xpath("//div[@id='q8']"));

        aksiyonlar.clickAndHold(city8).build().perform();
        MyFunc.Bekle(1);
        aksiyonlar.moveToElement(contry8).release().build().perform();

        WebElement city9 = driver.findElement(By.id("a9"));
        WebElement contry9 = driver.findElement(By.xpath("//div[@id='q9']"));

        aksiyonlar.clickAndHold(city9).build().perform();
        MyFunc.Bekle(1);
        aksiyonlar.moveToElement(contry9).release().build().perform();

        WebElement city10 = driver.findElement(By.id("a10"));
        WebElement contry10 = driver.findElement(By.xpath("//div[@id='q10']"));

        aksiyonlar.clickAndHold(city10).build().perform();
        MyFunc.Bekle(1);
        aksiyonlar.moveToElement(contry10).release().build().perform();

        WebElement city11 = driver.findElement(By.id("a11"));
        WebElement contry11 = driver.findElement(By.xpath("//div[@id='q11']"));

        aksiyonlar.clickAndHold(city11).build().perform();
        MyFunc.Bekle(1);
        aksiyonlar.moveToElement(contry11).release().build().perform();

        WebElement city12 = driver.findElement(By.id("a12"));
        WebElement contry12 = driver.findElement(By.xpath("//div[@id='q12']"));

        aksiyonlar.clickAndHold(city12).build().perform();
        MyFunc.Bekle(1);
        aksiyonlar.moveToElement(contry12).release().build().perform();

        WebElement city13 = driver.findElement(By.id("a13"));
        WebElement contry13 = driver.findElement(By.xpath("//div[@id='q13']"));

        aksiyonlar.clickAndHold(city13).build().perform();
        MyFunc.Bekle(1);
        aksiyonlar.moveToElement(contry13).release().build().perform();

        WebElement city14 = driver.findElement(By.id("a14"));
        WebElement contry14 = driver.findElement(By.xpath("//div[@id='q14']"));

        aksiyonlar.clickAndHold(city14).build().perform();
        MyFunc.Bekle(1);
        aksiyonlar.moveToElement(contry14).release().build().perform();


        WebElement city15 = driver.findElement(By.id("a15"));
        WebElement contry15 = driver.findElement(By.xpath("//div[@id='q15']"));

        aksiyonlar.clickAndHold(city15).build().perform();
        MyFunc.Bekle(1);
        aksiyonlar.moveToElement(contry15).release().build().perform();

    }
}
