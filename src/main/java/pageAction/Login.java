package pageAction;

import Pages.HomePage;
import base.Base;
import com.microsoft.playwright.Page;

public class Login extends Base {
    private Page page;
    private HomePage homePage = new HomePage();

    public Login(Page page) {
        this.page = page;
    }

    public void login()  {
        String homePageHeaderValue = page.locator(homePage.headerText).textContent();
        validate(homePageHeaderValue,"Swag Labs","User landed on Home page");
        page.locator(homePage.username).fill("standard_user");
        page.locator(homePage.password).fill("secret_sauce");
        page.click(homePage.loginButton);
    }
}
