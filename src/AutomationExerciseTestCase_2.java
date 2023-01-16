import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AutomationExerciseTestCase_2 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
        List<WebElement> headerItems = driver.findElements(By.cssSelector("ul[class='nav navbar-nav']>li"));

        for (WebElement headerItem : headerItems) {
            System.out.println(headerItem.isDisplayed() ? "PASSED" : "FAILED");
            System.out.println(headerItem.isEnabled() ? "ENABLED" : "UNABLE");
            System.out.println(headerItem.getText().trim());
        }
        Driver.quitDriver();
        }



}
