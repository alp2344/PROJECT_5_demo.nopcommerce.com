package testCase;

import utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ElementsPage extends Parent {

    public ElementsPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//a[@class='ico-login']")
    private WebElement loginButton;
    @FindBy(css = "[id='Email']")
    private WebElement loginEmail;
    @FindBy(css = "[id='Password']")
    private WebElement loginPassword;
    @FindBy(xpath = "//button[@class='button-1 login-button']")
    private WebElement log_inButton;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    private WebElement loginErrorMsg;
    @FindBy(css = ".ico-logout")
    private WebElement logout;
    @FindBy(xpath = "//a[@class='ico-account']")
    private WebElement myAccButton;
    @FindBy(css = "select[name='DateOfBirthDay']")
    private WebElement day;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    private WebElement month;
    @FindBy(css = "select[name='DateOfBirthYear']")
    private WebElement year;
    @FindBy(xpath = "//div[@class='header-menu']")
    private List<WebElement> listheader;
    @FindBy(xpath = "//ul[@class='sublist first-level']")
    private List<WebElement> subtabs;
    @FindBy(xpath = "//div[@class='header-menu']")
    private WebElement headerMenu;
    @FindBy(xpath = "//*[text()='Computers ']")
    private WebElement computers;
    @FindBy(xpath = "//a[text()='Desktops ']")
    private WebElement desktop;
    @FindBy(xpath = " //a[text()='Notebooks ']")
    private WebElement notebooks;
    @FindBy(xpath = " //a[text()='Software ']")
    private WebElement software;
    @FindBy(linkText = "Electronics")
    private WebElement electronics;
    @FindBy(xpath = " //a[text()='Camera & photo ']")
    private WebElement cameraAndPhoto;
    @FindBy(xpath = " //a[text()='Cell phones ']")
    private WebElement cellPhone;
    @FindBy(xpath = " //a[text()='Others ']")
    private WebElement others;
    @FindBy(xpath = "//*[text()='Apparel ']")
    private WebElement apparel;
    @FindBy(xpath = " //a[text()='Shoes ']")
    private WebElement shoes;
    @FindBy(xpath = " //a[text()='Clothing ']")
    private WebElement clothing;
    @FindBy(xpath = " //a[text()='Accessories ']")
    private WebElement accessories;
    @FindBy(xpath = "//*[text()='Digital downloads ']")
    private WebElement digitalDownloads;
    @FindBy(xpath = "//*[text()='Books ']")
    private WebElement books;
    @FindBy(xpath = "//*[text()='Jewelry ']")
    private WebElement jewelry;
    @FindBy(xpath = "//*[text()='Gift Cards ']")
    private WebElement giftCards;
    @FindBy(id = "small-searchterms")
    private WebElement search;
    @FindBy(xpath = "//h2[@class='product-title']/a")
    private List<WebElement> productTitle;
    @FindBy(xpath = "//div[@class='product-name']")
    private WebElement productName;
    @FindBy(css = ".product-item")
    private List<WebElement> productItems;
    @FindBy(css = ".product-name > h1")
    private WebElement chosenGiftCard;
    @FindBy(css = "#giftcard_43_RecipientName")
    private WebElement recipientName25;
    @FindBy(css = "#giftcard_43_SenderName")
    private WebElement yourName25;
    @FindBy(css = "#giftcard_43_Message")
    private WebElement messageField25;
    @FindBy(css = "#giftcard_43_RecipientEmail")
    private WebElement recipientEmail25;
    @FindBy(css = "#giftcard_43_SenderEmail")
    private WebElement yourEmail25;
    @FindBy(css = "#giftcard_44_RecipientName")
    private WebElement recipientName50;
    @FindBy(css = "#giftcard_44_SenderName")
    private WebElement yourName50;
    @FindBy(css = "#giftcard_44_Message")
    private WebElement messageField50;
    @FindBy(css = "#giftcard_45_RecipientName")
    private WebElement recipientName100;
    @FindBy(css = "#giftcard_45_SenderName")
    private WebElement yourName100;
    @FindBy(css = "#giftcard_45_Message")
    private WebElement messageField100;
    @FindBy(id = "add-to-cart-button-43")
    private WebElement addToCart25;
    @FindBy(id = "add-to-cart-button-44")
    private WebElement addToCart50;
    @FindBy(id = "add-to-cart-button-45")
    private WebElement addToCart100;
    @FindBy(css = ".content")
    private WebElement msg;
    @FindBy(css = "a[href='/gift-cards']")
    private WebElement giftCardsLink;
    @FindBy(xpath = "(//button[@class='button-2 product-box-add-to-cart-button'])[2]")
    private WebElement addToCardsLink;
    @FindBy(css = "p.content")
    private WebElement warningMessage;
    @FindBy(xpath = "(//ul[@class='top-menu notmobile']/li/a)[1]")
    private WebElement computerS;
    @FindBy(xpath = "(//ul[@class='sublist first-level']/li/a)[1]")
    private WebElement desktopS;
    @FindBy(xpath = "(//h2[@class='product-title']/a)[1]")
    private WebElement buildOwnComp;
    @FindBy(xpath = "//select[@id='product_attribute_2']/option[@data-attr-value]")
    private List<WebElement> ramSelectContents;
    @FindBy(xpath = "//input[@name='product_attribute_3']")
    private List<WebElement> hddButtonS;
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    private WebElement BYOC_addToCardButton;
    @FindBy(xpath = "//p[@class='content']")
    private WebElement chckShopCard;
    @FindBy(name = "q")
    private WebElement searchStore;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;
    @FindBy(xpath = "//a[text()='Adobe Photoshop CS4']")
    private WebElement product;
    @FindBy(linkText = "Register")
    private WebElement register;
    @FindBy(css = "input[id='gender-male']")
    private WebElement cinsiyet;
    @FindBy(css = "input[id='FirstName']")
    private WebElement firstname;
    @FindBy(css = "input[id='LastName']")
    private WebElement lastname;
    @FindBy(css = "input[id='Email']")
    private WebElement email;
    @FindBy(css = "input[id='Company']")
    private WebElement company;
    @FindBy(css = "input[id='Password']")
    private WebElement password;
    @FindBy(css = "input[id='ConfirmPassword']")
    private WebElement confirmPassword;
    @FindBy(css = "button[id='register-button']")
    private WebElement Button;
    @FindBy(css = "div[class='buttons'] [class='button-1 register-continue-button']")
    private WebElement contine;
    @FindBy(xpath = "//div[@class='result']")
    private WebElement regMessage;
    @FindBy(xpath = "//li[text()='The specified email already exists']")
    private WebElement regErrorMessage;

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getDay() {
        return day;
    }

    public WebElement getMonth() {
        return month;
    }

    public WebElement getYear() {
        return year;
    }

    public WebElement getLoginEmail() {
        return loginEmail;
    }

    public WebElement getLoginPassword() {
        return loginPassword;
    }

    public WebElement getLog_inButton() {
        return log_inButton;
    }

    public WebElement getLoginErrorMsg() {
        return loginErrorMsg;
    }

    public WebElement getLogout() {
        return logout;
    }

    public WebElement getMyAccButton() {
        return myAccButton;
    }

    public List<WebElement> getListheader() {
        return listheader;
    }

    public List<WebElement> getSubtabs() {
        return subtabs;
    }

    public WebElement getHeaderMenu() {
        return headerMenu;
    }

    public WebElement getComputers() {
        return computers;
    }

    public WebElement getDesktop() {
        return desktop;
    }

    public WebElement getNotebooks() {
        return notebooks;
    }

    public WebElement getSoftware() {
        return software;
    }

    public WebElement getElectronics() {
        return electronics;
    }

    public WebElement getCameraAndPhoto() {
        return cameraAndPhoto;
    }

    public WebElement getCellPhone() {
        return cellPhone;
    }

    public WebElement getOthers() {
        return others;
    }

    public WebElement getApparel() {
        return apparel;
    }

    public WebElement getShoes() {
        return shoes;
    }

    public WebElement getClothing() {
        return clothing;
    }

    public WebElement getAccessories() {
        return accessories;
    }

    public WebElement getDigitalDownloads() {
        return digitalDownloads;
    }

    public WebElement getBooks() {
        return books;
    }

    public WebElement getJewelry() {
        return jewelry;
    }

    public WebElement getGiftCards() {
        return giftCards;
    }

    public WebElement getSearch() {
        return search;
    }

    public List<WebElement> getProductTitle() {
        return productTitle;
    }

    public WebElement getProductName() {
        return productName;
    }

    public List<WebElement> getProductItems() {
        return productItems;
    }

    public WebElement getChosenGiftCard() {
        return chosenGiftCard;
    }

    public WebElement getRecipientName25() {
        return recipientName25;
    }

    public WebElement getYourName25() {
        return yourName25;
    }

    public WebElement getMessageField25() {
        return messageField25;
    }

    public WebElement getRecipientEmail25() {
        return recipientEmail25;
    }

    public WebElement getYourEmail25() {
        return yourEmail25;
    }

    public WebElement getRecipientName50() {
        return recipientName50;
    }

    public WebElement getYourName50() {
        return yourName50;
    }

    public WebElement getMessageField50() {
        return messageField50;
    }

    public WebElement getRecipientName100() {
        return recipientName100;
    }

    public WebElement getYourName100() {
        return yourName100;
    }

    public WebElement getMessageField100() {
        return messageField100;
    }

    public WebElement getAddToCart25() {
        return addToCart25;
    }

    public WebElement getAddToCart50() {
        return addToCart50;
    }

    public WebElement getAddToCart100() {
        return addToCart100;
    }

    public WebElement getMsg() {
        return msg;
    }

    public WebElement getGiftCardsLink() {
        return giftCardsLink;
    }

    public WebElement getAddToCardsLink() {
        return addToCardsLink;
    }

    public WebElement getWarningMessage() {
        return warningMessage;
    }

    public WebElement getComputerS() {
        return computerS;
    }

    public WebElement getDesktopS() {
        return desktopS;
    }

    public WebElement getBuildOwnComp() {
        return buildOwnComp;
    }

    public List<WebElement> getRamSelectContents() {
        return ramSelectContents;
    }

    public List<WebElement> getHddButtonS() {
        return hddButtonS;
    }

    public WebElement getBYOC_addToCardButton() {
        return BYOC_addToCardButton;
    }

    public WebElement getChckShopCard() {
        return chckShopCard;
    }

    public WebElement getSearchStore() {
        return searchStore;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getProduct() {
        return product;
    }

    public WebElement getRegister() {
        return register;
    }

    public WebElement getCinsiyet() {
        return cinsiyet;
    }

    public WebElement getFirstname() {
        return firstname;
    }

    public WebElement getLastname() {
        return lastname;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getCompany() {
        return company;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getConfirmPassword() {
        return confirmPassword;
    }

    public WebElement getButton() {
        return Button;
    }

    public WebElement getContine() {
        return contine;
    }

    public WebElement getRegMessage() {
        return regMessage;
    }

    public WebElement getRegErrorMessage() {
        return regErrorMessage;
    }
}



