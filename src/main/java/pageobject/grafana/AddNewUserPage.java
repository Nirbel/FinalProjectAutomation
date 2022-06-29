package pageobject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewUserPage {

    @FindBy(how = How.CSS, using = "input[class='css-yn255a-input-input'][id='name-input']")
    public WebElement txt_name;

    @FindBy(how = How.CSS, using = "input[class='css-yn255a-input-input'][id='email-input']")
    public WebElement txt_email;

    @FindBy(how = How.CSS, using = "input[class='css-yn255a-input-input'][id='username-input']")
    public WebElement txt_username;


    @FindBy(how = How.CSS, using = "input[class='css-yn255a-input-input'][id='password-input']")
    public WebElement txt_password;

    @FindBy(how = How.CSS, using = "button[class='css-1sara2j-button']")
    public WebElement btn_createUser;

}
