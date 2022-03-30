package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.MyAccount;

import static org.junit.Assert.assertEquals;

public class featureMyAccount {
    private WebDriver webDriver;

    public featureMyAccount() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click button add my first address")
    public void clickButtonFirstAddress() {
        MyAccount myAccount = new MyAccount(webDriver);
        myAccount.buttonFirstAddress();
    }

    @When("User select \"(.*)\" as state")
    public void inputState(String state){
        MyAccount myAccount = new MyAccount(webDriver);
        myAccount.selectDropDownState(state);
    }

    @When("User input \"(.*)\" as company and \"(.*)\" as address and \"(.*)\" as postal code and \"(.*)\" as city and \"(.*)\" as mobile phone")
    public void inputCreadential1(String company, String address,String postalCode,String city,String mobilePhone) {
        MyAccount myAccount = new MyAccount(webDriver);
        myAccount.setCompany(company);
        myAccount.setAddress(address);
        myAccount.setPostalCode(postalCode);
        myAccount.setCity(city);
        myAccount.setMobilePhone(mobilePhone);
    }

    @And("User click button save")
    public void clickButtonSave() {
        MyAccount myAccount = new MyAccount(webDriver);
        myAccount.buttonSave();
    }

    @Then("User can see the input that has been filled in previously that is available on the card and will be linked to the my addresses page")
    public void verifyElementPresent() {
        MyAccount myAccount = new MyAccount(webDriver);
        String textAddress = "medan percut";
        assertEquals(textAddress, myAccount.getTextAddress() );
    }

    @Then("User can make sure the next page is the data entry display")
    public void verifyNextPage() {
        MyAccount myAccount = new MyAccount(webDriver);
        Assert.assertTrue(myAccount.verifyButtonSave());


    }
    @Then("User will see error \"(.*)\" with various error conditions")
    public void verifyErrorLogin(String errorMassage) {
        MyAccount myAccount = new MyAccount(webDriver);
        assertEquals(errorMassage,myAccount.vrfyErrorText() );

    }

    @And("User click button order history and details")
    public void clickButtonOrderHistory() {
        MyAccount myAccount = new MyAccount(webDriver);
        myAccount.buttonOrderHistory();
    }
    @And("User click button my credit slips")
    public void clickButtonCreditSlips() {
        MyAccount myAccount = new MyAccount(webDriver);
        myAccount.buttonCreditSlips();
    }
    @And("User click button my personal information")
    public void clickButtonPMyPersonalInformation() {
        MyAccount myAccount = new MyAccount(webDriver);
        myAccount.buttonPersonalInformation();
    }

    @Then("User will see display page order history")
    public void verifyOrderHistory() {
        MyAccount myAccount = new MyAccount(webDriver);
        Assert.assertTrue(myAccount.verifyOrderHistory());
    }

    @Then("User will see display page credit slips")
    public void verifyCreditSlips() {
        MyAccount myAccount = new MyAccount(webDriver);
        Assert.assertTrue(myAccount.verifyCreditSlips());
    }

    @Then("User will see display page your personal information")
    public void verifyYourPersonalInformation() {
        MyAccount myAccount = new MyAccount(webDriver);
        Assert.assertTrue(myAccount.verifyYourPersonalInformation());
    }

}
