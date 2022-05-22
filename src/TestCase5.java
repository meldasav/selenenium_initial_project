import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase5 {
    public static void main(String[] args) {
        /**
         * Test Case 5: Validate ComfyElite Contact Us page "Sign up for our email list
         * for updates, promotions, and more." Checkbox
         * Given user navigates to “https://comfyelite.com/”
         * When user clicks on “CONTACT US” link in the header
         * Then user should be navigated to “CONTACT US” page
         * And validate the "Sign up for our email list for updates, promotions, and more." checkbox
         * Note: Checkbox validation includes checkbox being selected and deselected by user
         */

        WebDriver driver=Driver.getDriver();
        driver.get("https://comfyelite.com/");
        WebElement contactUsLink = driver.findElement(By.xpath("//ul[@id='n-3734237352-navId']/li[3]/a"));
        System.out.println(contactUsLink.isDisplayed() && contactUsLink.isEnabled() ? "Contact us validation Passed" : "Contact us validation failed");
        contactUsLink.click();

        WebElement checkbox= driver.findElement(By.xpath("(//div[@data-ux='Element'])[2]"));
        checkbox.click();
        System.out.println(checkbox.isSelected()?"check box is selected passed" : "check box is failed");
        checkbox.click();
        System.out.println(!checkbox.isSelected()?"passed" : "failed");
        System.out.println(checkbox.getText().equals("Sign up for our email list for updates, promotions, and more."));
        Driver.quitDriver();
    }
}
