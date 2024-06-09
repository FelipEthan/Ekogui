package steps;

import io.cucumber.java.en.Given;
import pages.LoginEkoguiPage;
import pages.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver driver;
    private LoginEkoguiPage loginPage;

    public LoginSteps() {
        this.driver = BasePage.initializeDriver();
        this.loginPage = new LoginEkoguiPage(this.driver);
    }

    @Given("^Since i am on the Ekogui page$")
    public void navigateToEkogui() {
        this.loginPage.navigateToEkogui();
    }
}
