import com.saucelabs.saucebindings.SauceSession;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class TestBaseCI {
    WebDriver driver;

    @Before
    public void setup() {
        driver = getDriver();
    }

    @After
    public void cleanup() {
        driver.quit();
    }

    private WebDriver getDriver() {
        return new SauceSession().start();
    }

}