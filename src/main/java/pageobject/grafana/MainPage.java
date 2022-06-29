package pageobject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {

    @FindBy(how = How.XPATH, using = "//h1[contains(text(), \"Welcome to Grafana\")]")
    public WebElement head_dashboard;

    @FindBy(how = How.XPATH, using = "//a[@class='css-k5db0k']")
    public List<WebElement> list_basicSteps;

    @FindBy(how = How.XPATH, using = "//div[contains(text(), \"data sources\")]")
    public List<WebElement> dataSource_icon;
}
