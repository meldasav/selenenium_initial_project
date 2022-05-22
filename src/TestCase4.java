import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCase4 {
    public static void main(String[] args) {
        /**
         * Test Case 4: Validate ComfyElite Contact Us page "SEND US A MESSAGE" form
         * Given user navigates to “https://comfyelite.com/”
         * When user clicks on “CONTACT US” link in the header
         * Then user should be navigated to “CONTACT US” page
         * And validate "First Name" input box
         * And validate "Last Name" input box
         * And validate "Email" input box
         * And validate "Message" input box
         * NOTE: Input validation includes input being displayed and user being able
         * send keys to input box. It also requires validating the given labels and placeholders
         */
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("//ul[@id='n-3734237352-navId']/li[3]/a"));
        contactUs.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@data-aid='First Name']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@data-aid='Last Name']"));
        WebElement email = driver.findElement(By.xpath("//input[@data-aid='CONTACT_FORM_EMAIL']"));
        WebElement message = driver.findElement(By.xpath("//textarea[@data-aid='CONTACT_FORM_MESSAGE']"));

        List<WebElement> elements = new ArrayList<>(Arrays.asList(firstName,lastName,email,message));
        firstName.sendKeys("Melda");
        lastName.sendKeys("Sav");
        email.sendKeys("meldasav@gmail.com");
        message.sendKeys("Selenium is fun to learn");

        for (WebElement element : elements) {
            System.out.println(element.isDisplayed() && element.isEnabled() ? "working as expected" : "something wrong");

            System.out.println(firstName.getAttribute("value").equals("Melda") && lastName.getAttribute("value").equals("Sav")
            && email.getAttribute("value").equals("meldasav@gmail.com") && message.getAttribute("value").equals("Selenium is fun to learn"));
        }
        Driver.quitDriver();
    }

}
