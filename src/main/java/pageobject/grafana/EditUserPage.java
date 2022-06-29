package pageobject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditUserPage {
    @FindBy(how = How.XPATH, using = "//span[contains(text(), \"Delete user\")]")
    public WebElement btn_deleteUser;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Confirm Modal Danger Button']")
    public WebElement btn_confirmDeleteUser;
}
