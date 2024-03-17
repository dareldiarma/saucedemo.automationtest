package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pageObject.InventoryPage;
import org.openqa.selenium.WebDriver;

public class InventorySteps {
    private final WebDriver driver = Hooks.driver;

    InventoryPage inventoryPage = new InventoryPage(driver);

    @When("User sort product by {string}")
    public void sortProduct(String text) throws InterruptedException {
        inventoryPage.selectSortProduct(text);
        Thread.sleep(3000);
    }

    @And("User click add to cart item sauce labs fleece jacket")
    public void userClickAddToCartItemSauceLabsFleeceJacket() {
        inventoryPage.clickProductSauceJacket();
    }

    @And("User add to click button add to cart item {string}")
    public void userAddToClickButtonAddToCartItem(String text) {
        inventoryPage.clickAddToCartItem(text);
    }
}
