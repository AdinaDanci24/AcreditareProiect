import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jUnitTest {

    public class LoginTest {

        private WebDriver driver;

        @Before
        public void initDriver() {
            System.setProperty("webdriver.chrome.driver", "resources/chormedriver");
            driver = new ChromeDriver();
        }


            @Test
            public void validLoginTest(){

                driver.get("https://fasttrackit.org/selenium-test/");
                WebElement loginButton = driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a "));
                driver.findElement(By.cssSelector("#email")).sendKeys("adanci25@gmail.com");
                driver.findElement(By.cssSelector("#pass")).sendKeys("noiembrie24");
                loginButton.click();
                WebElement welcomeMessageElement = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong"));


            }

        }
    }