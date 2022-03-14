import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class parabank {
    @Test
    public void getWindowsSizeTest()throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC%20");
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("john");
        driver.findElement(By.name("password")).sendKeys("demo");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='ng-binding']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("month")).sendKeys("marzo");
        driver.findElement(By.id("transactionType")).sendKeys("Credit");
        driver.findElement(By.xpath("//input[@value='Go']")).click();






    }
}
