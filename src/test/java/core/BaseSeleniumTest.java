package core;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

abstract public class BaseSeleniumTest {
    protected ChromeDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        BaseSeleniumPage.setDriver(driver);
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
