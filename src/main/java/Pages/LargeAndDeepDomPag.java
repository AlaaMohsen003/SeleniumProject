package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LargeAndDeepDomPag {
    private WebDriver driver;
    private By table= By.id("large-table");
    public LargeAndDeepDomPag(WebDriver driver) {
        this.driver = driver;
    }
    public void scrollToTable(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement tableElement = driver.findElement(table);
        String script = "arguments[0].scrollIntoView();";
        js.executeScript(script,tableElement);
    }
}

