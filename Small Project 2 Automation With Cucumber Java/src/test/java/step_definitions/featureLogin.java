package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.HomePage;
import pageObject.LoginPage;

import javax.xml.transform.SourceLocator;

import static org.junit.Assert.assertEquals;

public class featureLogin {
    private WebDriver webDriver;

    public featureLogin() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User input \"(.*)\" as email address")
    public void inputCreadential(String inptEmailAddress) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setEmailAddress(inptEmailAddress);
    }

    @And("Click button sign in")
    public void ClickButonSignIn() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.buttonSignIn();
    }

    @And("User click button create an account")
    public void ClickButtonCreateAnAccount() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.buttonCreateAnAccount();
    }

    @Then("User see error massage")
    public void verifyErrorMassage() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.textErrorMassage());

    }
    @Then("User see display create an account")
    public void displayCreateAnAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Thread.sleep(1000);
    }

    @Then("User will see the create an account input page")
    public void displayInputFirstName() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Thread.sleep(2000);
        Assert.assertTrue(loginPage.verifyPageCreateAnAccount());
    }

//
//

    @When("User input \"(.*)\" as first name and \"(.*)\" as last name \"(.*)\" as password")
    public void inputCreadential1(String FirstName, String lastName, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Thread.sleep(2000);
        loginPage.setFirstName(FirstName);
        loginPage.setLastName(lastName);
        loginPage.setPassword(password);
    }

    @And("User Click button register")
    public void ClickButtonRegister() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.buttonRegister();
    }

    @Then("User see \"(.*)\" in display page")
    public void verifyErrorMassage(String error) {
        LoginPage loginPage = new LoginPage(webDriver);
        assertEquals(error,loginPage.getTextError() );

    }

    @When("User input \"(.*)\" as email and \"(.*)\" as password")
    public void inputCreadential2(String email, String password) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setEmail(email);
        loginPage.setPassword(password);
    }
    @And("User click button sign in")
    public void clickButtonSigIn() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.buttonLogin();
    }

    @Then("User will direct to my account page")
    public void verifyNextElement() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLogin());

    }
    @Then("User will see error \"(.*)\" on login page")
    public void verifyErrorLogin(String errorText) {
        LoginPage loginPage = new LoginPage(webDriver);
        assertEquals(errorText,loginPage.getTextLoginError() );

    }



}
