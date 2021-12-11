package StepDefinitions;

import PageObjectModel.contactUsPage;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class stepDefinition1 {
    WebDriver driver;
    contactUsPage contactUsPage = new contactUsPage();

    @Given("navigate to the website")
    public void navigate_to_the_website() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @And("click on contact us button")
    public void click_on_contact_us_button() {
      contactUsPage.setContactUsButton();

    }

    @And("select subject heading")
    public void select_subject_heading() {
        contactUsPage.setSubjectHeadingDropdown();

    }

    @And("type order reference")
    public void type_order_reference() {
        contactUsPage.setOrder();

    }

    @And("type email")
    public void type_email() {
        contactUsPage.setSendEmail();

    }

    @And("type a message")
    public void type_a_message() {
        contactUsPage.setMessage();

    }

    @When("click on send button")
    public void click_on_send_button() {
        contactUsPage.setClickSendButton();

    }

    @Then("verify success message")
    public void verify_success_message() {
        contactUsPage.setSuccessMessage();
    }

    public void tearDown() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }


}
