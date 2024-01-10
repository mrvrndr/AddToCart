import com.microsoft.playwright.*;
import pageAction.AddToCart;
import pageAction.Login;
import pageAction.Product;

public class AddToCartTest {
    public static void main(String[] args)  {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            page.navigate("https://www.saucedemo.com/");

            Login login = new Login(page);
            login.login();

            Product product = new Product(page);
            product.addToCart();

            AddToCart addToCart = new AddToCart(page);
            addToCart.addToCart();
        }
    }
}
