package steps;
import io.cucumber.java.en.Given;
import pages.LoginEkoguiPage;
public class LoginSteps {
    LoginEkoguiPage login = new LoginEkoguiPage();
    public LoginSteps() {
    }
    @Given("^Since i am on the Ekogui page$")
    public void navigateToEkogui() {
        this.login.navigateToEkogui();
    }
}
