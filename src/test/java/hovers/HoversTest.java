package hovers;
import base.BaseTests;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class HoversTest  extends BaseTests{

    @Test
    public void testHovers() {
        int index=1;
        var hoversPage=homePage.clickHovers();
        var figureCaption=hoversPage.hoverOverFigure(index);
        assertTrue(figureCaption.isCaptionDisplayed(),
                "The caption is not correct");
    }
}
