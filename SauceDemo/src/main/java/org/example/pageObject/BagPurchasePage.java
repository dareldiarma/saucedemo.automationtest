package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BagPurchasePage {
    public static WebDriver webDriver;

    public BagPurchasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement cartbutton;
    @FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
    private WebElement removeSauceLabsBikeLight;
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement chekoutbutton;
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement fieldFirstName;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement fieldLastName;
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement fieldpostalcode;
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continuebutton;
    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement itemtotal;
    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement tax;
    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement total;
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishbutton;
    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement textthankyou;
    @FindBy(xpath = "//div[@class='complete-text']")
    private WebElement textorderdispatched;
    @FindBy(xpath = "//button[@id='back-to-products']")
    private WebElement backhomebutton;

    public void clickcartbutton(){
        cartbutton.click();
    }
    public void clickremoveSauceLabsBikeLight(){
        removeSauceLabsBikeLight.click();
    }
    public void clickchekoutbutton(){
        chekoutbutton.click();
    }
    public void inputfieldFirstName(String Firstname){
        fieldFirstName.sendKeys(Firstname);
    }
    public void inputfieldLastName(String Lastname){
        fieldLastName.sendKeys(Lastname);
    }
    public void inputpostalcode(String postalcode){
        fieldpostalcode.sendKeys(postalcode);
    }
    public void clickcontinuebutton(){
        continuebutton.click();
    }
    public boolean verifytotal(){
        float itemTotalPrice = Float.parseFloat(itemtotal.getText().split("\\$")[1]);
        float taxAmount = Float.parseFloat(tax.getText().split("\\$")[1]);
        float totalAmount = Float.parseFloat(total.getText().split("\\$")[1]);
        return itemTotalPrice + taxAmount == totalAmount;
    }
    public void clickfinishbutton(){
        finishbutton.click();
    }
    public boolean verifychekoutcompletepage(){
        boolean Textthankyou = textthankyou.isDisplayed();
        boolean Textorderdispatched = textorderdispatched.isDisplayed();
        boolean Backhomebutton = backhomebutton.isDisplayed();
        return Textthankyou && Textorderdispatched && Backhomebutton;
    }
}