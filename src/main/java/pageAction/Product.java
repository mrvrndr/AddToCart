package pageAction;

import Pages.HomePage;
import Pages.ProductPage;
import base.Base;
import com.microsoft.playwright.Page;

public class Product extends Base {

    private Page page;
    private ProductPage productPage = new ProductPage();

    // Constructor to initialize 'page'
    public Product(Page page) {
        this.page = page;
    }

    public void addToCart(){
        String headerText = page.locator(productPage.productPageHeaderText).textContent();
        validate(headerText,"Products","User landed on Product display page");
        page.click(productPage.backpackAddToCartButton);
        page.click(productPage.shoppingCartIcon);
    }
}
