package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccount;
import pageObject.BookWithoutLogin;

import java.util.Map;

import static java.awt.SystemColor.text;
import static org.junit.Assert.assertEquals;

public class featureBookWithoutLogin {
    private final WebDriver webDriver;


    public featureBookWithoutLogin() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click button now at executive rooms")
    public void ClickButtonNav() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.buttonBookNowExecutiveRooms();
    }

    @Then("User will to direct to link new tab")
    public void verifyErrorLogin(String errorMassage) {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        assertEquals(bookWithoutLogin.gettxtRoomInformation(), bookWithoutLogin.getTextGymAndSpa() );

    }

    @Then("User sees the view of the facilities offered at amenities")
    public void displayAmanities() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.getTextGymAndSpa();
    }

    @Then("The user will see the available display on the personal room view that does not match")
    public void verifyAmenitiesAndPersonalInformation() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        String gymAndSpa = "Restaurant";
        assertEquals(gymAndSpa, bookWithoutLogin.gettxtRoomInformation()  );
    }
    @And("User click view more at description room")
    public void ClickviewMore() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.buttonViewMore();
    }

    @And("User click button Refund policies")
    public void ClickRefondPolicies() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.buttonRefondPolicies();
    }
    @And("User click button reviews can work")
    public void ClickReviews() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.buttonReviews();
    }
    @And("User click button search rooms")
    public void ClickSearchRooms() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.buttonSearchRooms();
    }
    @And("User click button modify search")
    public void ClickModifySearch() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.buttonModifySearch();
    }
    @When("User Input \"(.*)\" as location")
    public void inputCreadential(String hotelLocation) throws InterruptedException {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.setHotelLocation(hotelLocation);
        Thread.sleep(1000);

    }

    @And("User choose hotel")
    public void clickButtonHotel() throws InterruptedException {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.buttonHotel1();
        Thread.sleep(1000);
        bookWithoutLogin.buttonHotel2();
    }

    @When("User choose check in date and check out date")
    public void setTimeCheckOutCheckIn() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.buttonCheckInTime();
        bookWithoutLogin.buttonSetDate1();
        bookWithoutLogin.buttonCheckOutTime();
        bookWithoutLogin.buttonSetDate2();
    }
    @When("User slide the slider for setting display value price")
    public void slideSlider() {
        WebElement slider = webDriver.findElement(By.xpath("//div[@id='filter_price_silder']/a[1]"));
        Actions action = new Actions(webDriver);
        action.dragAndDropBy(slider, 10, 0).perform();
    }

    @And("User click button search now")
    public void clickButtonSearchNow() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.buttonSearchNow();

    }
    @Then("User be linked to the room selection page")
    public void verifyNextPage() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        Assert.assertTrue(bookWithoutLogin.verifyViewMore());
    }
    @Then("Displaying will sort the display according to the slide made by the user")
    public void verifySlider() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        Assert.assertTrue(bookWithoutLogin.verifySlider());
    }

//
//
//

    @And("User click button book now")
    public void clickBookNow() throws InterruptedException {
    BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
    bookWithoutLogin.buttonBookNow();
    Thread.sleep(1000);
    }

    @And("User click button proceed to checkout")
    public void clickProceedToCheckOut() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.buttonProceedToCheckOut();
    }

    @And("User click button proceed1")
    public void clickProceed1() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.buttonProceed1();
    }

    @Then("User will be linked to the login page")
    public void verifybuttonSave() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        Assert.assertTrue(bookWithoutLogin.verifybuttonSave());
    }


    @When("User Input \"(.*)\" as firstName and \"(.*)\" as lastName and \"(.*)\" as email and \"(.*)\" as password and \"(.*)\" as numberPhone and save")
    public void inputCreadential(String firstName, String lastName,String email,String password,String mobilePhone) throws InterruptedException {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.setFirstName(firstName);
        bookWithoutLogin.setLastName(lastName);
        bookWithoutLogin.setEmail(email);
        bookWithoutLogin.setPassword(password);
        bookWithoutLogin.setMobilePhone(mobilePhone);
        bookWithoutLogin.buttonSave();
        Thread.sleep(1000);
    }
    @Then("User see display \"(.*)\" in display Rooms & Price Summary")
    public void ErrorMassageGuestInformation(String errorMassage) {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        assertEquals(errorMassage,bookWithoutLogin.getErrorMassageGuestInformation() );

    }

    @And("User click button proceed2")
    public void clickProceed2() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.buttonProceed2();
    }
    @And("User click radio button i agree to the terms of service")
    public void clickRadioButton() throws InterruptedException {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.buttonRadioButton();
        Thread.sleep(2000);
    }
    @And("User click button pay bank wire")
    public void clickPayByBankWire() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.buttonPayByBankWire();
    }
    @And("User click button pay by check")
    public void clickPayByCheck() throws InterruptedException {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.buttonPayByCheck();
        Thread.sleep(1000);
    }
    @And("User click button pay with your paypal")
    public void clickPayWithYourPaypal()  {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.buttonPayWithYourPaypal();
    }
    @And("User click button i confirm my order")
    public void clickConfirmMyOrder() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.buttonConfirmMyOrder();
    }
    @Then("User get a message successfully make payment")
    public void verifyOrderSuccess() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        Assert.assertTrue(bookWithoutLogin.verifyOrderSuccess());
    }
    @And("User click button view your order history")
    public void buttonViewOrderHistory() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        bookWithoutLogin.buttonViewOrderHistory();
    }

    @Then("User have been finished to order and page link to order history")
    public void verifyDisplayWelcome() {
        BookWithoutLogin bookWithoutLogin = new BookWithoutLogin(webDriver);
        Assert.assertTrue(bookWithoutLogin.verifyHomeOrderHistory());
    }





    }
