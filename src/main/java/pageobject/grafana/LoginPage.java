package pageobject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.CSS ,using = "input[name=\"user\"]")
    public WebElement txt_username;

    @FindBy(how = How.CSS ,using = "input[name=\"password\"]")
    public WebElement txt_password;

    @FindBy(how = How.CSS ,using = "button[aria-label=\"Login button\"]")
    public WebElement btn_login;

    @FindBy(how = How.XPATH ,using = "//span[contains(text(), \"Skip\")]")
    public WebElement btn_skip;
}
