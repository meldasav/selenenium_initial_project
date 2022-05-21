import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase3 {
    public static void main(String[] args) {
        /**
         * Test Case 3: Validate ComfyElite Contact Us page "Contact Us" "SEND US A MESSAGE" form headings
         * Given user navigates to “https://comfyelite.com/”
         * When user clicks on “CONTACT US” link in the header
         * Then user should be navigated to “CONTACT US” page
         * And user should be able to see heading2 as "Contact Us"
         * And user should be able to see heading4 as "SEND US A MESSAGE"
         */

        WebDriver driver=Driver.getDriver();
        driver.get("https://comfyelite.com/");
        WebElement contactUs=driver.findElement(By.xpath("(//ul[@id='n-4856048570-navId']/li/a)[3]"));
        System.out.println(contactUs.isDisplayed());

        Driver.quitDriver();

    }
}
