package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.BagPurchasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class BagPurchaseSteps {
    private final WebDriver driver = Hooks.driver;
    BagPurchasePage bagPurchasePage = new BagPurchasePage(driver);

    @And("User click cart button")
    public void userclcikcartbutton(){
        bagPurchasePage.clickcartbutton();
    }

    @And("User remove Sauce Labs Bike Light by clicking remove button")
    public void userRemoveSauceLabsBikeLightByClickingRemoveButton() {
        bagPurchasePage.clickremoveSauceLabsBikeLight();
    }

    @And("user click checkout button")
    public void userClickCheckoutButton() {
        bagPurchasePage.clickchekoutbutton();
    }

    @And("User input {string} as first name, {string} as last name, and {string} as postal code and click continue")
    public void userInputAsFirstNameAsLastNameAndAsPostalCodeAndClickContinue(String firstname, String lastname, String postal) {
        bagPurchasePage.inputfieldFirstName(firstname);
        bagPurchasePage.inputfieldLastName(lastname);
        bagPurchasePage.inputpostalcode(postal);
        bagPurchasePage.clickcontinuebutton();
    }

    @And("User click finish")
    public void userClickFinish() {
        Assert.assertTrue(bagPurchasePage.verifytotal());
        bagPurchasePage.clickfinishbutton();
    }

    @Then("User land on Checkout complete page")
    public void userLandOnCheckoutCompletePage() {
        Assert.assertTrue(bagPurchasePage.verifychekoutcompletepage());
    }
}
