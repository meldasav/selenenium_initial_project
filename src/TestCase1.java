
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase1 {

    /**
         * Test Case 1: Validate ComfyElite Contact Us Page heading section
         * Given user navigates to “https://comfyelite.com/”
         * When user clicks on “CONTACT US” link in the header
         * Then user should be navigated to “CONTACT US” page
         * And user should be able to see ComfyElite logo
         * And user should be able to see heading2 as “High quality comfy pillows and accessories for travel, office and home.”
         */
        public static void main(String[] args) {
            WebDriver driver = Driver.getDriver();
            driver.get("https://comfyelite.com/");

            WebElement contactUsLink = driver.findElement(By.xpath("//ul[@id='n-3734237352-navId']/li[3]/a"));
            System.out.println(contactUsLink.isDisplayed() && contactUsLink.isEnabled() ? "Contact us validation Passed" : "Contact us validation failed");
            contactUsLink.click();

            WebElement verifyWholePageContactUs = driver.findElement(By.xpath("//div[@id='page-48559']"));
            System.out.println(verifyWholePageContactUs.isDisplayed() && verifyWholePageContactUs.isEnabled() ? "Page verification PASSED" : "Page verification FAILED");

            WebElement comfyEliteLogo = driver.findElement(By.cssSelector("img[id='n-48560']"));
            System.out.println(comfyEliteLogo.isDisplayed() && comfyEliteLogo.isEnabled() ? "Logo validation PASSED" : "Logo validation FAILED");

            WebElement heading2 = driver.findElement(By.id("dynamic-tagline-48605"));
            System.out.println(heading2.isDisplayed() && heading2.getText().equals("High quality comfy pillows and accessories for travel, office and home.") ? "heading2 verification Passed" : "heading2 verification failed");

            Driver.quitDriver();


        }
    }

