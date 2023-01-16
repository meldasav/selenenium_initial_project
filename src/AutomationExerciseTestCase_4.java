import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AutomationExerciseTestCase_4 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
        Actions actions = new Actions(driver);

        WebElement footer_bottom = driver.findElement(By.cssSelector("div[class='footer-bottom'] p"));

        for (int i = 0; i < 10; i++) {
            actions.sendKeys(Keys.PAGE_DOWN).perform();
        }
        System.out.println(footer_bottom.isDisplayed());
        System.out.println(footer_bottom.getText().equals("Copyright © 2021 All rights reserved"));
        Driver.quitDriver();
    }
}
