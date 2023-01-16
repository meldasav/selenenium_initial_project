import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationExerciseTestCase_5 {

    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
        driver.findElement(By.xpath("(//ul[@class='nav navbar-nav']//a)[5]")).click();
        try {
//            Alert alert = driver.switchTo().alert();
//            alert.accept();
           driver.switchTo().frame(0);
           driver.findElement(By.id("dismiss-button")).click();
           driver.switchTo().parentFrame();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            System.out.println(driver.getTitle().equals("Automation Practice Website for UI Testing - Test Cases") ? "Title validation Passed" : "Title validation Failed");
            System.out.println(driver.getCurrentUrl().equals("https://automationexercise.com/test_cases") ? "URL validation Passed" : "URL validation Failed");
            Driver.quitDriver();
        }
    }
}

