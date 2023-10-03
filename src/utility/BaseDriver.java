package utility;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
import static testCase.Parent.waiting;

public class BaseDriver {
    public static final org.apache.logging.log4j.Logger logger4j = LogManager.getLogger();

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void setUpProcess() {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @AfterClass
    public void tearDownProcess() {
        waiting(5);
        driver.quit();
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://demo.nopcommerce.com/");
        logger4j.info("Test metodu başladı");
        logger4j.warn("Warning mesaj test başladı");
    }

    @AfterMethod
    public void afterMethod(ITestResult sonuc) {
        logger4j.info(sonuc.getName() + " Test metodu bitti " + (sonuc.getStatus() == 1 ? " Passed " : "Fail"));
        logger4j.warn("Warning mesaj test bitti");
    }
}
