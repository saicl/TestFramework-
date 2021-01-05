import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YourCartPage {
    WebDriver driver;
    private By qtyLocator = By.xpath("//*[@class='cart_quantity']");
    private By ddd = By.xpath("//*[text()='Continue Shopping']");

    public WebElement getDdd() {
        return driver.findElement(ddd);
    }

    public YourCartPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement getQtyLocator() {
        return driver.findElement(qtyLocator);
    }

    // is element present
    public void isItemPresent(){
        driver.findElement(qtyLocator);
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(qtyLocator));
    }
}
