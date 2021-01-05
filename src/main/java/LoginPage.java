import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    private By userNameLocator = By.id("user-name");
    private By userPasswordLocator = By.id("password");
    private By loginButtonLocator = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement getUserNameLocator() {
        return driver.findElement(userNameLocator);
    }

    private WebElement getUserPasswordLocator() {
        return driver.findElement(userPasswordLocator);
    }

    private WebElement getLoginButtonLocator() {
        return driver.findElement(loginButtonLocator);
    }

    public void open() {
        driver.get("https://www.saucedemo.com/");

    }

    public void logIn(String username, String password) {
        getUserNameLocator().sendKeys(username);
        getUserPasswordLocator().sendKeys(password);
        getLoginButtonLocator().click();
    }

}
