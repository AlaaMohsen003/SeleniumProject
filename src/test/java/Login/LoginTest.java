package Login;

import Pages.LoginPage;
import base.BaseTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class LoginTest  extends BaseTests{
@Test
    public void testSuccessfulLogin(String username,String password){


        LoginPage  loginPage = homePage.clickFormAuthenticationLink();
        loginPage.setUsernameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");

        var secureAreaPage=loginPage.clickLoginButton();
        String message = secureAreaPage.getMessage();
        assertTrue(message.contains("you logged into a secure area!"),"you didnt login");

}




}
