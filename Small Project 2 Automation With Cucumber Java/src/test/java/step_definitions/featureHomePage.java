package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.HomePage;

public class featureHomePage {
    private WebDriver webDriver;

    public featureHomePage() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User open the home page")
    public void verifyLoginHomePage() {
        HomePage homePage = new HomePage(webDriver);
        Assert.assertTrue(homePage.isDisplayed());
    }

    @And("User click button nav toggle")
    public void ClickButtonNav() throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        homePage.BtnNavToggle();
        Thread.sleep(1000);
    }

    @And("User click button home")
    public void ClickButtonHome() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickBtnHome();
    }

    @Then("User can see the home screen")
    public void displayHome() {
        HomePage homePage = new HomePage(webDriver);
        Assert.assertTrue(homePage.displayWelcome());
    }

    @And("User click button interior")
    public void ClickButtonInterior() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickBtnInterior();
    }
    @Then("User can see the interior screen")
    public void displayInterior() {
        HomePage homePage = new HomePage(webDriver);
        Assert.assertTrue(homePage.displayTextInterior());
    }
    @And("User click button amenities")
    public void ClickButtonAmenities() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickBtnAmenities();
    }
    @Then("User can see the amenities screen")
    public void verifyDisplayAmenities() {
        HomePage homePage = new HomePage(webDriver);
        Assert.assertTrue(homePage.displayAmenities());
    }
    @And("User click button rooms")
    public void ClickButtonRooms() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickBtnRooms();
    }
    @Then("User can see the rooms screen")
    public void verifyDisplayOurRooms() {
        HomePage homePage = new HomePage(webDriver);
        Assert.assertTrue(homePage.displayOurRooms());
    }
    @And("User click button testimonials")
    public void ClickButtonTestimonial() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickBtnTestimonial();
    }
    @Then("User can see the testimonials screen")
    public void verifyDisplayTestimonial() {
        HomePage homePage = new HomePage(webDriver);
        Assert.assertTrue(homePage.displayTestimonial());
    }
    @And("User click button legal notice")
    public void ClickButtonLegal() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickBtnLegalNotice();
    }
    @Then("User can see the legal notice screen")
    public void verifyDisplayLegal() {
        HomePage homePage = new HomePage(webDriver);
        Assert.assertTrue(homePage.displayLegal());
    }
    @And("User click button about us")
    public void clickAboutUs() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickAboutUs();
    }
    @Then("User can see the about us screen")
    public void verifyAboutUs() {
        HomePage homePage = new HomePage(webDriver);
        Assert.assertTrue(homePage.displayAboutUs());
    }

    @And("User click button contact")
    public void clickContactUs() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickContactUs();
    }
    @Then("User can see the contact us screen")
    public void verifyContactUs() {
        HomePage homePage = new HomePage(webDriver);
        Assert.assertTrue(homePage.displayContactUs());
    }

    @And("User click button shopping cart")
    public void clickShopingCart() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickLogoShoppingCart();
    }
    @Then("User can see the booking cart page")
    public void verifyBokingCart() {
        HomePage homePage = new HomePage(webDriver);
        Assert.assertTrue(homePage.verifyBokingCart());
    }

}
