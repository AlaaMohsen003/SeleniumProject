package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    //private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthenticationLink() {
    //    driver .findElement(formAuthenticationLink).click();
        clickLink("Form Authentication");
return new LoginPage(driver);
    }
    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public KeyPressesPage clickKeyPresses(){
        clickLink("key presses");
        return new KeyPressesPage(driver);
    }
    public JavaScriptAlertsPage clickJavaScriptAlrts(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }
public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);


}
public EntryAdPage clickEntryAd(){
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
}
public FramesPage clickFrames(){
        clickLink("Frames");
        return new FramesPage(driver);
}
    public DynamicLoadingPage clickDynamicLoadingLink()
    {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeAndDeepDomPag clickLargeAndDeepLink()
    {
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPag(driver);
    }
    public InfiniteScrollPage clickInfiniteScroll()
    {
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindowsLink()
    {
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }






    public void clickLink(String linkText){

        driver.findElement(By.linkText(linkText)).click();
    }

}

