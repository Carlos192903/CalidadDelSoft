import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {


        public static void main(String[] args){
            ChromeDriver  chromeDriver= new ChromeDriver();
            chromeDriver.get("http://demo.guru99.com/");
            WebElement
                    element=chromeDriver.findElement(By.xpath("//input[@name='emailid']"));
            element.sendKeys("abc@gmail.com");

            WebElement button=chromeDriver.findElement(By.xpath("//input[@name='btnLogin']"));
            button.click();
        }
    }

