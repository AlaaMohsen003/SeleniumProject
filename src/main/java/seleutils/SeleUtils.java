package seleutils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleUtils {
    private WebDriver driver;
    public SeleUtils(WebDriver driver){

        this.driver=driver;
    }
    public void selectFromDropdown(By dropdownLocator ,String option){

        Select dropdown=new Select(driver.findElement(dropdownLocator));
        dropdown.selectByVisibleText(option);
    }
}
