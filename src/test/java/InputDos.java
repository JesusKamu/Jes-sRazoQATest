import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class InputDos {

    @Test
    public void getWindowsSizeTest() {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com/?");
        driver.manage().window().maximize();


        List<WebElement> listaInput = driver.findElements(By.tagName("input"));
        System.out.println("La cantidad de input del sitio son: " +
                listaInput.size());
        System.out.println("---> Elementos inPut: <---");
        for (WebElement elementoInput : listaInput) {
            System.out.println(elementoInput.getText());
        }

    }
}
