package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObject.BookWithLogin;
import pageObject.MyAccount;

import static org.junit.Assert.assertEquals;


public class featureBookWithLogin {
    private final WebDriver webDriver;


    public featureBookWithLogin() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("User click button My Account")
    public void clickMyAccount() {
        BookWithLogin bookWithLogin = new BookWithLogin(webDriver);
        bookWithLogin.MyAccount();
    }
    @And("User click button add quantity room")
    public void clickMyButtonAddQuantity() throws InterruptedException {
        BookWithLogin bookWithLogin = new BookWithLogin(webDriver);
        webDriver.findElement(By.xpath("//div[@id='category_data_cont']/div[1]//i[@class='icon-plus']")).click();
        Thread.sleep(1000);
    }
    @Then("User will see display input address page")
    public void verifyText() {
        BookWithLogin bookWithLogin = new BookWithLogin(webDriver);
        Assert.assertTrue(bookWithLogin.verifyTextYourAddress());
    }
    @Then("Users can ensure that the price is in accordance with the initial price")
    public void verifyFinalPrice() {
        BookWithLogin bookWithLogin = new BookWithLogin(webDriver);
        String hasil = "2 200,00 Rp";
        assertEquals(hasil, bookWithLogin.verifyFinalTotal());
    }
    @And("User click button logo cilsy")
    public void clickButtonSekolahQa() {
        BookWithLogin bookWithLogin = new BookWithLogin(webDriver);
        bookWithLogin.buttonSekolahQa();
    }
    @And("User click button chart")
    public void clickButtonShoppingCart() {
        BookWithLogin bookWithLogin = new BookWithLogin(webDriver);
        bookWithLogin.buttonShoppingCart();
    }



}
