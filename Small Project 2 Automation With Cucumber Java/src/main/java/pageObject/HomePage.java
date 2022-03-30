package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
        private static WebDriver driver;

        public HomePage(WebDriver driver) {
            PageFactory.initElements(driver, this);
            this.driver = driver;
        }

    @FindBy(xpath = "//button[@class='nav_toggle']")
    private WebElement navToggle;

    @FindBy(xpath = "//a[.='Home']")
    private WebElement btnHome;

    @FindBy(xpath = "//a[.='Interior']")
    private WebElement btnInterior;

    @FindBy(xpath = "//a[.='Amenities']")
    private WebElement btnAmenities;

    @FindBy(xpath = "//a[.='Rooms']")
    private WebElement btnRooms;

    @FindBy(xpath = "//a[.='Testimonials']")
    private WebElement btnTestimonial;

    @FindBy(xpath = "//li[6]/a[.='Legal Notice']")
    private WebElement btnLegalNotice;

    @FindBy(xpath = "//li[7]/a[.='About us']")
    private WebElement aboutUs;

    @FindBy(xpath = "//a[.='Contact']")
    private WebElement contactUs;

    @FindBy(xpath = "//h1[@class='header-hotel-name']")
    private WebElement logo;

    @FindBy(xpath = "//h1[@class='header-hotel-name']")
    private WebElement textWelcome;

    @FindBy(xpath = "//p[.='Interior']")
    private WebElement textInterior;

    @FindBy(xpath = "//p[.='Amenities']")
    private WebElement textAmenities;

    @FindBy(xpath = "//p[.='Our Rooms']")
    private WebElement textOurRooms;

    @FindBy(xpath = "//p[.='What our Guest say?']")
    private WebElement textTestimonial;

    @FindBy(xpath = "//h2[.='Legal']")
    private WebElement textLegal;

    @FindBy(xpath = "//h1[@class='page-heading bottom-indent']")
    private WebElement textAboutUs;

    @FindBy(xpath = "//p[@class='contact-header col-sm-offset-2 col-sm-8']")
    private WebElement textContactUs;

    @FindBy(xpath = "//div[@class='shopping_cart']/a[@href='http://qa.cilsy.id:8080/en/quick-order']")
    private WebElement logoShoppingCart;

    @FindBy(xpath = "//h2[@class='page-heading']")
    private WebElement verfyBokingCart;




    public boolean displayContactUs(){
        textContactUs.isDisplayed();
        return true;
    }

    public boolean displayAboutUs(){
        textAboutUs.isDisplayed();
        return true;
    }

    public boolean displayLegal(){
        textLegal.isDisplayed();
        return true;
    }

    public boolean displayTestimonial(){
        textTestimonial.isDisplayed();
        return true;
    }

    public boolean displayOurRooms(){
        textOurRooms.isDisplayed();
        return true;
    }

    public boolean displayAmenities(){
        textAmenities.isDisplayed();
        return true;
    }

    public boolean displayTextInterior(){
        textInterior.isDisplayed();
        return true;
    }

    public boolean displayWelcome(){
        textWelcome.isDisplayed();
        return true;
    }

    public boolean isDisplayed(){
        logo.isDisplayed();
        return true;
    }
    public boolean verifyBokingCart(){
        verfyBokingCart.isDisplayed();
        return true;
    }



    public void BtnNavToggle(){
        navToggle.click();
    }
    public void clickBtnHome(){
        btnHome.click();
    }
    public void clickBtnInterior(){
        btnInterior.click();
    }
    public void clickBtnAmenities(){
        btnAmenities.click();
    }
    public void clickBtnRooms(){
        btnRooms.click();
    }
    public void clickBtnTestimonial(){
        btnTestimonial.click();
    }
    public void clickBtnLegalNotice(){
        btnLegalNotice.click();
    }
    public void clickContactUs(){
        contactUs.click();
    }
    public void clickAboutUs(){
        aboutUs.click();
    }
    public void clickLogoShoppingCart(){
        logoShoppingCart.click();
    }

}


