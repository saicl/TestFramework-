import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProductsFeature {
    WebDriver driver;
    private By locatorAddtoCart = By.xpath("//*[text()='29.99']/../button");
    private By locatorBasketicon = By.xpath("//*[@fill='currentColor']");

    public ProductsFeature(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement getLocatorAddtoCart() {
        return driver.findElement(locatorAddtoCart);
    }

    private WebElement getLocatorBasketIcon() {
        return driver.findElement(locatorBasketicon);
    }

    public void addProductToTheBasket() {
        getLocatorAddtoCart().click();
    }


    public void openBasket() {
        getLocatorBasketIcon().click();
    }


}

