import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleTest {

	@Test
	public void testing() {
    WebDriver driver = new FirefoxDriver();
        
        //And now use this to visit the website
        driver.get("https://www.training-support.net");
        
        //Check the title of the page
        String title = driver.getTitle();
        //Print the title of the page
        System.out.println("Page title is: " + title);
        Assert.assertEquals(title, "Training Support");
	}
}
