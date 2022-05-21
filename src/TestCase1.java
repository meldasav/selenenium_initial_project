
import org.openqa.selenium.WebDriver;

public class TestCase1 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.youtube.com/watch?v=CmgOWVosd1Y");

        Driver.quitDriver();
    }

}
