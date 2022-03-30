package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyAccount {
    private static WebDriver driver;

    public MyAccount(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[.='Add my first address']")
    private WebElement btnAddMyFirstAddress;
    @FindBy(xpath = "//span[.='Order history and details']")
    private WebElement btnOrderHistory;
    @FindBy(xpath = "//span[.='My credit slips']")
    private WebElement btnCreditSlips;
    @FindBy(xpath = "//span[.='My addresses']")
    private WebElement btnMyAddresses;
    @FindBy(xpath = "//span[.='My personal information']")
    private WebElement btnPersonalInformation;


// Locator  page your addres
    @FindBy(xpath = "//select[@id='id_state']")
    private WebElement selectState;
    @FindBy(xpath = "//input[@id='company']")
    private WebElement inputCompany;
    @FindBy(xpath = "//form[@id='add_address']/div[5]/input[@class='is_required validate form-control']")
    private WebElement inputAddres;
    @FindBy(xpath = "//input[@id='postcode']")
    private WebElement inputPostalCode;
    @FindBy(xpath = "//input[@id='city']")
    private WebElement inputCity;
    @FindBy(xpath = "//input[@id='phone_mobile']")
    private WebElement inputPhoneNumber;
    @FindBy(xpath = "//span[contains(.,'Save')]")
    private WebElement btnSave;
    @FindBy(xpath = "//div[@class='alert alert-danger']/p[1]")
    private WebElement errorText;

    //
//    locator card my address
    @FindBy(xpath = "//span[@class='address_address1']")
    private WebElement textAddres;

    //
//    method card my addres
    public String getTextAddress(){
        return textAddres.getText();
    }

    //
// method page your personal information

    public void selectDropDownState(String label){
        Select selectDropdownProduct = new Select(selectState);
        selectDropdownProduct.selectByVisibleText(label);
    }
    public void setAddress(String address){
        inputAddres.sendKeys(address);
    }
    public void setCompany(String company){
        inputCompany.sendKeys(company);
    }
    public void setPostalCode(String postalCode){
        inputPostalCode.sendKeys(postalCode);
    }
    public void setCity(String city){
        inputCity.sendKeys(city);
    }
    public void setMobilePhone(String mobilePhone){
        inputPhoneNumber.sendKeys(mobilePhone);
    }
    public void buttonSave(){
        btnSave.click();
    }
    public boolean verifyButtonSave(){
        btnSave.isDisplayed();
        return true;
    }

//
// button page my account
    public void buttonFirstAddress(){
        btnAddMyFirstAddress.click();
    }
    public void buttonOrderHistory(){
        btnOrderHistory.click();
    }
    public void buttonCreditSlips(){
        btnCreditSlips.click();
    }
    public void buttonMyAddresses(){
        btnMyAddresses.click();
    }
    public void buttonPersonalInformation(){
        btnPersonalInformation.click();
    }
    public String vrfyErrorText(){
        return errorText.getText();
    }


    @FindBy(xpath = "//h1[@class='page-heading bottom-indent']")
    private WebElement vrfyOrderHistory;

    @FindBy(xpath = "//h1[@class='page-heading bottom-indent']")
    private WebElement verfyCreditSlips;

    @FindBy(xpath = "//h1[@class='page-subheading']")
    private WebElement verfyYourPersonalInformation;

    public boolean verifyOrderHistory(){
        vrfyOrderHistory.isDisplayed();
        return true;
    }

    public boolean verifyCreditSlips(){
        verfyCreditSlips.isDisplayed();
        return true;
    }
    public boolean verifyYourPersonalInformation(){
        verfyYourPersonalInformation.isDisplayed();
        return true;
    }


}

