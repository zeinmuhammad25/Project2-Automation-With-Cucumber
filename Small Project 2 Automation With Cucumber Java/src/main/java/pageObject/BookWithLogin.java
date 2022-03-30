package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BookWithLogin {
    private static WebDriver driver;

    public BookWithLogin(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//a[@title='Home']/span")
    private WebElement MyAccount;

    @FindBy(xpath = "//h1[@class='page-subheading']")
    private WebElement textYourAddress;

    @FindBy(xpath = "//p[@class='cart_final_total_block']/span[@class='cart_total_values']")
    private WebElement verifyFinalTotal;

    @FindBy(xpath = "//p[@class='cart_final_total_block']/span[@class='cart_total_values']")
    private WebElement buttonAddQuantity;

    @FindBy(xpath = "//img[@alt='Sekolah QA']")
    private WebElement buttonSekolahQa;

    @FindBy(xpath = "//div[@class='shopping_cart']/a[@href='http://qa.cilsy.id:8080/en/quick-order']")
    private WebElement buttonShoppingCart;


    public void buttonSekolahQa(){
        buttonSekolahQa.click();
    }

    public void buttonShoppingCart(){
        buttonShoppingCart.click();
    }

    public Object verifyFinalTotal(){
        return verifyFinalTotal.getText();
    }
    public void buttonAddQuantity(){
        buttonAddQuantity.click();
    }

    public void MyAccount(){
        MyAccount.click();
    }
    public boolean verifyTextYourAddress(){
        textYourAddress.isDisplayed();
        return true;
    }
}
