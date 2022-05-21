import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase2 {
    /**
     * Test Case 2: Validate ComfyElite Contact Us page "Connect With Us" section
     * Given user navigates to “https://comfyelite.com/”
     * When user clicks on “CONTACT US” link in the header
     * Then user should be navigated to “CONTACT US” page
     * And user should be able to see heading1 as "Connect With Us"
     * And user should be able to see “Facebook” icon and hyperlink reference for it should be “https://www.facebook.com/103179127717601”
     * And user should be able to see “Instagram” icon and hyperlink reference for it should be “https://www.instagram.com/comfyelite”
     */
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsLink = driver.findElement(By.xpath("//ul[@id='n-3734237352-navId']/li[3]/a"));
        System.out.println(contactUsLink.isDisplayed() && contactUsLink.isEnabled() ? "Contact us validation Passed" : "Contact us validation failed");
        contactUsLink.click();

        WebElement verifyWholePageContactUs = driver.findElement(By.xpath("//div[@id='page-48559']"));
        System.out.println(verifyWholePageContactUs.isDisplayed() && verifyWholePageContactUs.isEnabled() ? "Page verification PASSED" : "Page verification FAILED");

        WebElement heading1 = driver.findElement(By.tagName("h1"));
        System.out.println(heading1.isDisplayed() && heading1.isEnabled() ? "H1 PASSED" : "H1 FAILED");

        WebElement faceBookIcon = driver.findElement(By.cssSelector("a[rel='noopener']"));
        System.out.println(faceBookIcon.isDisplayed() && faceBookIcon.getAttribute("href").equals("https://www.facebook.com/103179127717601") ? "Facebook icon Passed" : "Facebook icon Failed");

        WebElement instagramIcon = driver.findElement(By.cssSelector("a[aria-label='Instagram Social Link']"));
        System.out.println(instagramIcon.isDisplayed() && instagramIcon.getAttribute("href").equals("https://www.instagram.com/comfyelite") ? "instagram icon PAssed " : "Instegram icon failed");

        Driver.quitDriver();
    }
}