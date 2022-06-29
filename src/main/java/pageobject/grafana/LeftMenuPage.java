package pageobject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LeftMenuPage {
    @FindBy(how = How.CSS, using = "nav[data-testid = \"sidemenu\"] a[aria-label = \"Alerting\"]")
    public WebElement btn_alerting;

    @FindBy(how = How.CSS, using = "nav[data-testid = \"sidemenu\"] a[aria-label = \"Configuration\"]")
    public WebElement btn_configuration;

    @FindBy(how = How.CLASS_NAME, using = "css-16buu1m")
    public WebElement btn_server;
}
