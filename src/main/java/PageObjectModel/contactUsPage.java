package PageObjectModel;

import Utilities.Base;
import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactUsPage extends Base {
    WebDriver driver;

    public contactUsPage() {
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@title='Contact Us']")
    private WebElement contactUsButton;


    public void setContactUsButton() {
     clickFunction(contactUsButton);

    }
    @FindBy( name="id_contact")
    private WebElement subjectHeadingDropdown;

    public void setSubjectHeadingDropdown(){
       selectElementFromDropdown(subjectHeadingDropdown,"Webmaster");
    }
    @FindBy(id = "email")
    private WebElement sendEmail;

    public void setSendEmail(){
        sendKeysFunction(sendEmail,"rustem@gmail.com");
    }
    @FindBy(name = "id_order")
    private WebElement order;
    public void setOrder(){
        sendKeysFunction(order,"blue jean");
    }
    @FindBy(id="message")
    private  WebElement message;
    public void setMessage(){

        sendKeysFunction(message,"thank you very much");
    }
    @FindBy(name= "submitMessage")
    private WebElement clickSendButton;

    public void setClickSendButton() {
        clickFunction(clickSendButton);
    }
    @FindBy(css = "p.alert-success")
    private WebElement successMessage;
    public void setSuccessMessage(){
        Assertion(successMessage,"Your message has been successfully sent to our team.");

    }
}

