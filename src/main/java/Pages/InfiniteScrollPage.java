package Pages;

public class InfinieScrollPage {
    private WebDriver driver;
    private By paragraphs = By.className("jscroll-added");
    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }
    public void scrollIntoParagraph(int index) {
        var js =(JavascriptExecutor)driver;
        String script = "window.scrollTo(0,document.body.scrollHeight)";
        while (getNumberOfParagraphs()<index) {
            js.executeScript(script);
        }
    }
    public int getNumberOfParagraphs() {
        return driver.findElements(paragraphs).size();

    }
}
}
