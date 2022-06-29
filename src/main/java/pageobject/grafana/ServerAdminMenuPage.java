package pageobject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ServerAdminMenuPage {

    @FindBy(how = How.XPATH, using = "//a[@href='/admin/users']")
    public WebElement link_users;

    @FindBy(how = How.XPATH, using = "//a[href='/orgs'] ")
    public WebElement link_orgs;

    @FindBy(how = How.XPATH, using = "//a[href='/settings'] ")
    public WebElement link_settings;
}
