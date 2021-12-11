package StepDefinitions;

import PageObjectModel.registerPage;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinition {
    WebDriver driver;
    registerPage registerPage = new registerPage();

    @Given("navigate to website")
    public void navigate_to_website() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("click sign in button")
    public void click_sign_in_button() {
        registerPage.clickOnSignButton();

    }

    @And("Type {string}")
    public void type(String email) {
        registerPage.typeEmail(email);

    }

    @And("click on create an account button")
    public void click_on_create_an_account_button() {
        registerPage.setSubmitButton();

    }

    @And("choose title")
    public void choose_title() {
        registerPage.setGender();


    }

    @And("type firstname {string} and lastname {string}")
    public void type_firstname_and_lastname(String firstname, String lastname) {
        registerPage.setFirstname(firstname, lastname);

    }

    @And("type password {string}")
    public void type_password(String password) {
        registerPage.setPassword(password);

    }

    @And("type company {string}")
    public void type_company(String company) {
        registerPage.setCompany(company);

    }

    @And("type address {string}")
    public void type_address(String address) {
        registerPage.setAddress(address);

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
