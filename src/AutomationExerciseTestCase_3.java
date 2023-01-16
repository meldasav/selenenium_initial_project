import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AutomationExerciseTestCase_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");

        Actions actions = new Actions(driver);

        WebElement subscription = driver.findElement(By.cssSelector("div[class='single-widget']>h2"));

        while (subscription.isDisplayed()) {
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            if (subscription.isDisplayed()) {
                WebElement emailInputBox = driver.findElement(By.id("susbscribe_email"));
                WebElement emailInputPlaceholder= driver.findElement(By.cssSelector("input[placeholder='Your email address']"));
                System.out.println(emailInputPlaceholder.getAttribute("placeholder"));
                System.out.println(emailInputPlaceholder.isDisplayed());
                emailInputBox.sendKeys("melsa@gmail.com");
                WebElement submitButton = driver.findElement(By.id("subscribe"));
                System.out.println(submitButton.isEnabled());
                submitButton.click();
                WebElement pText = driver.findElement(By.cssSelector("form[class='searchform'] p"));
                System.out.println(pText.isDisplayed());
                System.out.println(pText.getText());
                break;
            }
        }
        Driver.quitDriver();
    }
}