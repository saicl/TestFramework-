import com.saucelabs.saucebindings.SauceSession;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProductsFeatureTest1 extends TestBase{

//    WebDriver driver;
//
//    @BeforeClass
//    public static void beforeClass() {
//        WebDriverManager.chromedriver().setup();
//
//    }
//
//    @Before
//    public void setUp() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }
//
//    @After
//    public void tearDown()  {
//        driver.quit();
//    }

    @Test
    public void name() {
        driver.get("https://www.saucedemo.com/");
//        driver.navigate().to("https://www.saucedemo.com/");
    }

    @Test
    public void Login() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.logIn("standard_user", "secret_sauce");
        ProductsFeature productsFeature = new ProductsFeature(driver);
        productsFeature.addProductToTheBasket();
        productsFeature.openBasket();
        YourCartPage yourCartPage = new YourCartPage(driver);
        yourCartPage.isItemPresent();
//        Assert.assertTrue("woohooo",driver.findElement(By.xpath("//*[text()='Continue Shopping']")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Continue Shopping']")).isDisplayed());
//        Assert.assertTrue(yourCartPage.getDdd().isDisplayed());
        assertTrue("Seems your locator has been broken", yourCartPage.getDdd().isDisplayed());


    }
    @Test
    public void Login1() {


        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.logIn("standard_user", "secret_sauce");
        ProductsFeature productsFeature = new ProductsFeature(driver);
        productsFeature.addProductToTheBasket();
        productsFeature.openBasket();
        YourCartPage yourCartPage = new YourCartPage(driver);
        yourCartPage.isItemPresent();
//        Assert.assertTrue("woohooo",driver.findElement(By.xpath("//*[text()='Continue Shopping']")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Continue Shopping']")).isDisplayed());
//        Assert.assertTrue(yourCartPage.getDdd().isDisplayed());
        assertTrue("Seems your locator has been broken", yourCartPage.getDdd().isDisplayed());




    }
    @Test
    public void Login2() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.logIn("standard_user", "secret_sauce");
        ProductsFeature productsFeature = new ProductsFeature(driver);
        productsFeature.addProductToTheBasket();
        productsFeature.openBasket();
        YourCartPage yourCartPage = new YourCartPage(driver);
        yourCartPage.isItemPresent();
//        Assert.assertTrue("woohooo",driver.findElement(By.xpath("//*[text()='Continue Shopping']")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Continue Shopping']")).isDisplayed());
//        Assert.assertTrue(yourCartPage.getDdd().isDisplayed());
        assertTrue("Seems your locator has been broken", yourCartPage.getDdd().isDisplayed());


    }
    @Test
    public void Login3() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.logIn("standard_user", "secret_sauce");
        ProductsFeature productsFeature = new ProductsFeature(driver);
        productsFeature.addProductToTheBasket();
        productsFeature.openBasket();
        YourCartPage yourCartPage = new YourCartPage(driver);
        yourCartPage.isItemPresent();
//        Assert.assertTrue("woohooo",driver.findElement(By.xpath("//*[text()='Continue Shopping']")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Continue Shopping']")).isDisplayed());
//        Assert.assertTrue(yourCartPage.getDdd().isDisplayed());
        assertTrue("Seems your locator has been broken", yourCartPage.getDdd().isDisplayed());


    }
    @Test
    public void Login4() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.logIn("standard_user", "secret_sauce");
        ProductsFeature productsFeature = new ProductsFeature(driver);
        productsFeature.addProductToTheBasket();
        productsFeature.openBasket();
        YourCartPage yourCartPage = new YourCartPage(driver);
        yourCartPage.isItemPresent();
//        Assert.assertTrue("woohooo",driver.findElement(By.xpath("//*[text()='Continue Shopping']")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Continue Shopping']")).isDisplayed());
//        Assert.assertTrue(yourCartPage.getDdd().isDisplayed());
        assertTrue("Seems your locator has been broken", yourCartPage.getDdd().isDisplayed());


    }
    @Test
    public void Login5() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.logIn("standard_user", "secret_sauce");
        ProductsFeature productsFeature = new ProductsFeature(driver);
        productsFeature.addProductToTheBasket();
        productsFeature.openBasket();
        YourCartPage yourCartPage = new YourCartPage(driver);
        yourCartPage.isItemPresent();
//        Assert.assertTrue("woohooo",driver.findElement(By.xpath("//*[text()='Continue Shopping']")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Continue Shopping']")).isDisplayed());
//        Assert.assertTrue(yourCartPage.getDdd().isDisplayed());
        assertTrue("Seems your locator has been broken", yourCartPage.getDdd().isDisplayed());


    }

    @Test
    public void dd() {
        SauceSession session = new SauceSession();

        // 2. Start Session to get the Driver
        RemoteWebDriver driver = session.start();

        // 3. Use the driver in your tests just like normal
        driver.get("https://www.saucedemo.com/");

        // 4. Stop the Session with whether the test passed or failed
        session.stop(true);
    }
}