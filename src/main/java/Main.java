import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com");
        WebElement input = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));

        input.sendKeys("Cat", Keys.ENTER);


    }
}
