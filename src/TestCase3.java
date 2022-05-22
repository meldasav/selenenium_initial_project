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
        //https://comfyelite.com/contact-us

        WebDriver driver=Driver.getDriver();
        driver.get("https://comfyelite.com/");
        WebElement contactUs=driver.findElement(By.xpath("//ul[@id='n-3734237352-navId']/li[3]/a"));
        contactUs.click();
        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")?"validation ContactUs PASSED" : "validation ContactUs FAILED");
        WebElement heading2contactUs= driver.findElement(By.xpath("//h2[@data-aid='CONTACT_SECTION_TITLE_REND']/span"));
        System.out.println(heading2contactUs.isDisplayed()&& heading2contactUs.getText().equals("Contact Us")? "heading2 PASSED" : "HEADING2 FAILED");

        WebElement heading4=driver.findElement(By.xpath("//h4[text()='Send Us a Message']"));
        System.out.println(heading4.isDisplayed() && heading4.getText().equals("SEND US A MESSAGE")?"H4 PASSED" :"H4 FAILED");

        Driver.quitDriver();

    }
}
