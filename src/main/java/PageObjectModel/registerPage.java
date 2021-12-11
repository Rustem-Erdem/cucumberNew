package PageObjectModel;

import Utilities.Base;
import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPage extends Base {
    private WebDriver driver;

    public registerPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a.login")
    private WebElement signInButton;

    @FindBy(name = "email_create")
    private WebElement emailTextBox;

    @FindBy(id = "SubmitCreate")
    private WebElement submitButton;

    @FindBy(id = "id_gender1")
    private WebElement gender;

    @FindBy(id = "customer_firstname")
    private WebElement firstname;

    @FindBy(id = "customer_lastname")
    private WebElement lastname;

    @FindBy(name = "passwd")
    private WebElement password;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(name = "address1")
    private WebElement address;


    public void clickOnSignButton() {

        clickFunction(signInButton);
    }

    public void typeEmail(String email) {
        sendKeysFunction(emailTextBox, email);
    }

    public void setSubmitButton() {

        clickFunction(submitButton);
    }

    public void setGender() {
        clickFunction(gender);

    }

    public void setFirstname(String firstName, String lastName) {
        sendKeysFunction(firstname, firstName);
        sendKeysFunction(lastname, lastName);
    }

    public void setPassword(String Password) {

        sendKeysFunction(password, Password);
    }

    public void setCompany(String Company) {

        sendKeysFunction(company, Company);
    }

    public void setAddress(String address1) {

        sendKeysFunction(address, address1);
    }

}
