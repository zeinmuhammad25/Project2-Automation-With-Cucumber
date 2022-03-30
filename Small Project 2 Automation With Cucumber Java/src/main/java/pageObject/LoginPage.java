package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private static WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//li[@class='active']/a[contains(.,'Sign in')]")
    private WebElement btnSignIn;

    @FindBy(xpath = "//i[@class='icon-user left']")
    private WebElement btnCreateAnAccount;

    @FindBy(xpath = "//input[@id='email_create']")
    private WebElement inptEmailAddressCreate;

    @FindBy(xpath = "//div[@id='create_account_error']")
    private WebElement errorMassge;

    @FindBy(xpath = "//input[@id='customer_firstname']")
    private WebElement inptFirstName;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    private WebElement inptLastName;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement inptPassword;

    @FindBy(xpath = "//button[@id='submitAccount']")
    private WebElement btnRegister;

    @FindBy(xpath = "//div[@class='alert alert-danger']/p[1]")
    private WebElement textError;

    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement createAnAccount;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[@id='SubmitLogin']/span[contains(.,'Sign in')]")
    private WebElement btnLogin;

    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement vrfyLogin;

    @FindBy(xpath = "//h3[@class='page-subheading htl-reservation-page-sub-heading']")
    private WebElement verifyPageCreateAnAccount;

    @FindBy(xpath = "//ol/li")
    private WebElement vrfyLoginError;

    public String getTextLoginError(){
        return vrfyLoginError.getText();
    }

    public String getTextError(){
        return textError.getText();
    }

    public boolean textCreateAnAccount(){
        createAnAccount.isDisplayed();
        return true;
    }

    public boolean verifyLogin(){
        vrfyLogin.isDisplayed();
        return true;
    }

    public void buttonLogin(){
        btnLogin.click();
    }

    public void setPassword(String password){
        inputPassword.sendKeys(password);
    }

    public void setEmail(String email){
        inputEmail.sendKeys(email);
    }

//  masih salah di xpathnya
    public void setFirstName(String firstName){
        inptFirstName.sendKeys(firstName);
    }

    public void setLastName(String paswrd){
        inptLastName.sendKeys(paswrd);
    }

    public void setPaswrd(String lastName){
        inptLastName.sendKeys(lastName);
    }
    public void buttonRegister(){
        btnRegister.click();
    }

    public boolean verifyPageCreateAnAccount(){
        return verifyPageCreateAnAccount.isDisplayed();

    }

    public void buttonSignIn(){
        btnSignIn.click();
    }
    public void buttonCreateAnAccount(){
        btnCreateAnAccount.click();
    }

    public void setEmailAddress(String user){
        inptEmailAddressCreate.sendKeys(user);
    }
    public boolean textErrorMassage(){
        errorMassge.isDisplayed();
        return true;
    }






}
