import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase6 {
    public static void main(String[] args) {
        /**
         * Test Case 6: Validate ComfyElite Contact Us page "SEND" button
         * Given user navigates to “https://comfyelite.com/”
         * When user clicks on “CONTACT US” link in the header
         * Then user should be navigated to “CONTACT US” page
         * And validate "SEND" button is displayed and clickable
         * And validate button text is displayed as “SEND”
         */
        WebDriver driver=Driver.getDriver();
        driver.get("https://comfyelite.com/");
        WebElement contactUsLink = driver.findElement(By.xpath("//ul[@id='n-3734237352-navId']/li[3]/a"));
        System.out.println(contactUsLink.isDisplayed() && contactUsLink.isEnabled() ? "Contact us validation Passed" : "Contact us validation failed");
        contactUsLink.click();

        WebElement sendButton= driver.findElement(By.cssSelector("button[tccltracking='click']"));
        System.out.println(sendButton.isDisplayed() && sendButton.isEnabled()? "sendButton validation passed" : "sendButton validation failed");
        System.out.println(sendButton.getText().equals("SEND"));

        Driver.quitDriver();
    }
}
