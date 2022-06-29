package utilets;

import org.openqa.selenium.support.PageFactory;
import pageobject.grafana.AddNewUserPage;
import pageobject.grafana.EditUserPage;
import pageobject.grafana.ServerAdminMainPage;
import pageobject.grafana.ServerAdminMenuPage;

public class ManagePages extends Base {
    public  static void intGrafana(){
        Grafanalogin = PageFactory.initElements(driver, pageobject.grafana.LoginPage.class);
        Grafanamaim = PageFactory.initElements(driver, pageobject.grafana.MainPage.class);
        GrafanaLeftMenu = PageFactory.initElements(driver, pageobject.grafana.LeftMenuPage.class);
        GrafanaServerAdmin = PageFactory.initElements(driver, ServerAdminMenuPage.class);
        GrafanaServerAdminMain = PageFactory.initElements(driver, ServerAdminMainPage.class);
        grafanaAddNewUserPage = PageFactory.initElements(driver, AddNewUserPage.class);
        grafanaEditUserPage = PageFactory.initElements(driver, EditUserPage.class);
    }

    public static void initMortgage() {
        mortgageMain = new pageobject.mortgage.MainPage(mobileDriver);
    }

    public static void initToDo() {
        todoMain = PageFactory.initElements(driver, pageobject.todo.MainPage.class);
    }

    public static void initCalculator() {
        calcMain = PageFactory.initElements(driver, pageobject.calculator.MainPage.class);
    }
}
