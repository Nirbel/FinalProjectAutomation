package pageobject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ServerAdminMainPage {

    @FindBy(how = How.CSS, using = "td[class='width-4 text-center link-td']")
    public List<WebElement> rows;


    @FindBy(how = How.CSS, using = "span[class='css-1mhnkuh']")
    public WebElement btn_newUser;

    @FindBy(how = How.CSS, using = "input[class='css-yn255a-input-input']")
    public WebElement txt_search;
}
