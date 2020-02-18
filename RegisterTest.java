import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class RegisterTest {
    public WebDriver driver;

    @Before
        public void initDriver() {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
            driver = new ChromeDriver();
}

    @Test
    public void validRegisterTest(){

        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Adina");
        driver.findElement(By.cssSelector("#middlename")).sendKeys("Maria");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Danci");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("adanci25@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("noiembrie24");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("noiembrie24");
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label"));



    }

    }