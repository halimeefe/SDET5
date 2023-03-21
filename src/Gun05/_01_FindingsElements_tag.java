package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class FindingsElements_tag extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.hepsiburada.com/");


        List<WebElement> linkler = driver.findElements(By.tagName("a"));

        for (WebElement e : linkler) {

            if (e.getText().isEmpty()) {
                System.out.print(e.getAttribute("href"));
                System.out.print(e.getAttribute("title"));
                System.out.println(e.getAttribute("rel"));

            }
        }


            BekleKapat();
        }
    }

