package pages;
public class LoginEkoguiPage extends BasePage {

    public LoginEkoguiPage() {
        super(driver);
    }
    public void navigateToEkogui() {
        navigateTo("https://www.adidas.co/");
    }
}
