package CampüsOdev;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru_2 extends BaseDriver {

    //   Ödev 2 : http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
   //    buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.

 @Test
    public void Test1() {

  driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html ");

  List<WebElement> students = driver.findElements(By.cssSelector("#allItems>li"));
  List<WebElement> teams = driver.findElements(By.cssSelector("#dhtmlgoodies_mainContainer>div ul"));

  Actions actions = new Actions(driver);

  for (WebElement t : teams) {
   String strHeight = t.getCssValue("height");
   int height = Integer.parseInt(strHeight.replaceAll("[^0-9]", ""));

   // Aşşağıdaki 29( Örnek bir grubunun height/4'üne eşittir
   // bu ekran çözünürlüğünüze göre değişebilir kontrol ediniz)
   // Daha fonksiyonel çözümleride sizlerden bekliyoruz.

   while (height >= 29 && students.size() > 0) {
    actions.clickAndHold(students.get(0)).perform();
    MyFunc.Bekle(1);
    actions.moveToElement(t).release().perform();
    students.remove(students.get(0));
    height = height - 29;
   }
  }


