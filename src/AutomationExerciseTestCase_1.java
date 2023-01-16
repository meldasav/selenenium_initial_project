import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationExerciseTestCase_1 {
    public static void main(String[] args) {
        WebDriver driver =Driver.getDriver();
        driver.get("https://automationexercise.com/");
        WebElement logo = driver.findElement(By.cssSelector("div[class='logo pull-left'] img"));
        System.out.println(logo.isDisplayed());
        Driver.quitDriver();
    }
}
