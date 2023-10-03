package testCase;

import utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Random;

public class Parent {
    static WebDriverWait wait;

    public Parent() {
        wait = new WebDriverWait(BaseDriver.driver, Duration.ofSeconds(15));
    }

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisible(element);
        element.clear();
        element.sendKeys(value);
    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        element.click();
    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waiting(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int RandomGenerator(int Limit) {
        return (int) (Math.random() * Limit);
    }

    public void verifyContainsText(WebElement element, String msg) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(msg));
    }

    public void selectElement(WebElement element, String msg) {
        Select select = new Select(element);
        waiting(1);
        select.selectByValue(msg);
    }

    public void hoverFunction(WebElement element) {
        Actions actions = new Actions(BaseDriver.driver);
        Action action = actions.moveToElement(element).build();
        action.perform();
    }

    public static int generalRandom(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt((max - min) + 1) + min;

    }

    public void elementfindersText(WebElement element) {
        ElementsPage ep = new ElementsPage();
        hoverFunction(element);
        for (WebElement e : ep.getSubtabs()) {
            System.out.println(e.getText());
        }
    }
}
