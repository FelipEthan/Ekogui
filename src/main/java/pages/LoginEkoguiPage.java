package pages;

import org.openqa.selenium.WebDriver;

public class LoginEkoguiPage extends BasePage {

    public LoginEkoguiPage(WebDriver driver) {
        super(driver);
    }
    public void navigateToEkogui() {
        navigateTo("https://www.adidas.co/");
    }
}
