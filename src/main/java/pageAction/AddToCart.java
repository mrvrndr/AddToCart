package pageAction;

import Pages.CartPage;
import Pages.ProductPage;
import base.Base;
import com.microsoft.playwright.Page;

public class AddToCart extends Base {

    private Page page;
    private CartPage cartPage = new CartPage();

    public AddToCart(Page page) {
        this.page = page;
    }

    public void addToCart(){

        String  cartPageHeaderText = page.locator(cartPage.cartPageHeader).textContent();
        validate(cartPageHeaderText,"Your Cart","User landed on cart page");
        String productTitle = page.locator(cartPage.productTitle).textContent();
        validate(productTitle,"Sauce Labs Backpack","Product is added into the cart");
        page.locator(cartPage.checkoutButton).isEditable();
        page.locator(cartPage.continueShoppingButton).isEditable();
    }
}
