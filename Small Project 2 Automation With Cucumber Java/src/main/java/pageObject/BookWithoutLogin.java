package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookWithoutLogin {
    private static WebDriver driver;

    public BookWithoutLogin(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    // set tanggal
    @FindBy(xpath = "//a[.='30']")
    private WebElement setDate1;
    @FindBy(xpath = "//a[.='31']")
    private WebElement setDate2;

    @FindBy(xpath = "//div[@class='homeAmenitiesBlock home_block_content']//div[@class='col-md-6 padding-lr-0 hidden-xs hidden-sm']//p[.='Gym & Spa']")
    private WebElement txtGymAndSpa;

    @FindBy(xpath = "//a[@href='http://qa.cilsy.id:8080/en/the-hotel-prime/3-super-delux-rooms.html']")
    private WebElement btnBookNowExecutiveRooms;

    @FindBy(xpath = "//div[.='o Business Services']")
    private WebElement txtRoomInformation;

    @FindBy(xpath = "//a[.='Refund policies']")
    private WebElement btnRefondPolicies;
    @FindBy(xpath = "//a[.='Reviews']")
    private WebElement btnReviews;

    @FindBy(xpath = "//input[@id='hotel_location']")
    private WebElement btnHotelLocation;
    @FindBy(xpath = "//button[@id='id_hotel_button']")
    private WebElement selctHotel1;
    @FindBy(xpath = "//li[@class='search_result_li']")
    private WebElement selctHotel2;
    @FindBy(xpath = "//input[@id='check_in_time']")
    private WebElement checkInTime;
    @FindBy(xpath = "//input[@id='check_out_time']")
    private WebElement checkOutTime;

    @FindBy(xpath = "//span[.='Search Now']")
    private WebElement btnSearchNow;
    @FindBy(xpath = "//div[@id='category_data_cont']/div[1]//a[.='View More....']")
    private WebElement btnViewMore;
    @FindBy(xpath = "//button[@class='btn btn-default modify_roomtype_search_btn pull-right']")
    private WebElement btnModifySearch;
    @FindBy(xpath = "//button[@id='search_room_submit']")
    private WebElement btnSearchRooms;
    @FindBy(xpath = "//div[@id='category_data_cont']")
    private WebElement verifySlider;


    public boolean verifySlider(){
        verifySlider.isDisplayed();
        return true;
    }

    public boolean verifyViewMore(){
        btnViewMore.isDisplayed();
        return true;
    }
    public void buttonModifySearch(){
        btnModifySearch.click();
    }
    public void buttonViewMore(){
        btnViewMore.click();
    }
    public void buttonSearchRooms(){
        btnSearchRooms.click();
    }

    public void buttonSearchNow(){
        btnSearchNow.click();
    }

    public void buttonSetDate1(){
        setDate1.click();
    }

    public void buttonSetDate2(){
        setDate2.click();
    }

    public void buttonCheckInTime(){
        checkInTime.click();
    }

    public void buttonCheckOutTime(){
        checkOutTime.click();
    }

    public void setHotelLocation(String hotelLocation){
        btnHotelLocation.sendKeys(hotelLocation);
    }

    public void buttonHotel1(){
        selctHotel1.click();
    }
    public void buttonHotel2(){
        selctHotel2.click();
    }

    public void buttonReviews(){
        btnReviews.click();
    }
    public void buttonRefondPolicies(){
        btnRefondPolicies.click();
    }


    public String getTextGymAndSpa(){
        return txtGymAndSpa.getText();
    }
    public String gettxtRoomInformation(){
        return txtRoomInformation.getText();
    }


    public void buttonBookNowExecutiveRooms(){
        btnBookNowExecutiveRooms.click();
    }

//
//
//  proses payment

    @FindBy(xpath = "//div[@id='category_data_cont']/div[1]//span[.='Book Now']")
    private WebElement buttonBookNow;
    @FindBy(xpath = "//span[contains(.,'Proceed to checkout')]")
    private WebElement buttonProceedToCheckOut;
    @FindBy(xpath = "//div[@class='col-sm-12 proceed_btn_block']//span[contains(.,'Proceed')]")
    private WebElement buttonProceed1;
    @FindBy(xpath = "//span[.='Save']")
    private WebElement buttonSave;
    @FindBy(xpath = "//div[@id='collapse-guest-info']//a[contains(.,'Proceed')]")
    private WebElement buttonProceed2;
    @FindBy(xpath = "//input[@id='cgv']")
    private WebElement buttonRadioButton;
    @FindBy(xpath = "//a[contains(.,'Pay by bank wire (order processing will be longer)')]")
    private WebElement buttonPayByBankWire;
    @FindBy(xpath = "//a[contains(.,'Pay by check (order processing will be longer)')]")
    private WebElement buttonPayByCheck;
    @FindBy(xpath = "//a[contains(.,'Pay with your card or your PayPal account')]")
    private WebElement buttonPayWithYourPaypal;
    @FindBy(xpath = "//span[contains(.,'I confirm my order')]")
    private WebElement buttonConfirmMyOrder;
    @FindBy(xpath = "//p[@class='alert alert-success']")
    private WebElement verifyOrderSuccess;
    @FindBy(xpath = "//a[.='View your order history']")
    private WebElement buttonViewOrderHistory;
    @FindBy(xpath = "//span[contains(.,'Home')]")
    private WebElement verifyHomeOrderHistory;
    @FindBy(xpath = "//p[@class='header-desc-welcome']")
    private WebElement verifyDisplayWelcome;



    @FindBy(xpath = "//input[@id='customer_firstname']")
    private WebElement inputFirstName;
    @FindBy(xpath = "//input[@id='customer_lastname']")
    private WebElement inputLastName;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement inputEmail;
    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement inputPassword;
    @FindBy(xpath = "//input[@id='phone_mobile']")
    private WebElement inputMobilePhone;

    public void setFirstName(String firstName){
        inputFirstName.sendKeys(firstName);
    }
    public void setLastName(String lastName){
        inputLastName.sendKeys(lastName);
    }
    public void setEmail(String email){
        inputEmail.sendKeys(email);
    }
    public void setPassword(String password){
        inputPassword.sendKeys(password);
    }
    public void setMobilePhone(String mobilePhone){
        inputMobilePhone.sendKeys(mobilePhone);
    }


    public void buttonBookNow(){
        buttonBookNow.click();
    }
    public void buttonProceedToCheckOut(){
        buttonProceedToCheckOut.click();
    }
    public void buttonProceed1(){
        buttonProceed1.click();
    }
    public void buttonSave(){
        buttonSave.click();
    }
    public void buttonProceed2(){
        buttonProceed2.click();
    }
    public void buttonRadioButton(){
        buttonRadioButton.click();
    }
    public void buttonPayByBankWire(){
        buttonPayByBankWire.click();
    }
    public void buttonPayByCheck(){
        buttonPayByCheck.click();
    }
    public void buttonPayWithYourPaypal(){
        buttonPayWithYourPaypal.click();
    }
    public void buttonConfirmMyOrder(){
        buttonConfirmMyOrder.click();
    }

    public boolean verifyOrderSuccess(){
        verifyOrderSuccess.isDisplayed();
        return true;
    }
    public void buttonViewOrderHistory(){
        buttonViewOrderHistory.click();
    }
    public boolean verifyHomeOrderHistory(){
        verifyHomeOrderHistory.isDisplayed();
        return true;
    }
    public boolean verifybuttonSave(){
        buttonSave.isDisplayed();
        return true;
    }



    @FindBy(xpath = "//div[@id='opc_account_errors']/b")
    private WebElement errorMassage;

    public String getErrorMassageGuestInformation(){
        return errorMassage.getText();
    }










}
