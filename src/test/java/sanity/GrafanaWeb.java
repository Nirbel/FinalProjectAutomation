package sanity;

import extnsions.UIActions;
import extnsions.Verfications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilets.CommonOps;
import workflows.WebFlows;

@Listeners(utilets.Listeners.class)
public class GrafanaWeb extends CommonOps {

    @Test(priority = 0, description = "Test01 - verify Header")
    @Description( "This Test verifies the header")
    public void Test01_VerifyHeader() {
        WebFlows.login("admin", "admin");
        Verfications.verifyTextInElement(Grafanamaim.head_dashboard, "Welcome to Grafana");

    }

    @Test(priority = 1, description = "Test02 - verify Defult Users")
    @Description("This test verifies the defult users ")
    public void Test02_VerifyDefultUsers() {
        UIActions.mouseHover(GrafanaLeftMenu.btn_server, GrafanaServerAdmin.link_users);
        Verfications.numOfElements(GrafanaServerAdminMain.rows, 1);


    }

    @Test(priority = 2, description = "Test03 - verify New User")
    @Description( "This test verifies new user been added ")
    public void Test03_VerifyNewUser() {
        UIActions.mouseHover(GrafanaLeftMenu.btn_server, GrafanaServerAdmin.link_users);
        WebFlows.createNewUser("nir", "nirbel@gmail.com", "nirbel", "123456");
        Verfications.numOfElements(GrafanaServerAdminMain.rows, 2);

    }

    @Test(priority = 3, description = "Test04 - verify User Deletion")
    @Description("This test verifies deletion of a user ")
    public void Test04_VerifyUserDeletion() throws InterruptedException {
        UIActions.mouseHover(GrafanaLeftMenu.btn_server, GrafanaServerAdmin.link_users);
        WebFlows.deleteLastUser();
        Thread.sleep(5000);
        Verfications.numOfElements(GrafanaServerAdminMain.rows, 1);
    }

    @Test(priority = 4, description = "Test05 - verify Basic Steps")
    @Description( "This test verifies the defult basic steps are displayed (using soft assertion)")
    public void Test05_verifyBasicSteps() {
        Verfications.visbilityOfElements(Grafanamaim.list_basicSteps);
        Verfications.visbilityOfElements(Grafanamaim.dataSource_icon);
    }

    @Test(priority = 5, description = "Test06 - verify Avatar Icon")
    @Description("This test verifies the Avatar Image (using Sikuli tool)")
    public void Test06_verifyAvatarIcon() {
        Verfications.visualElement("GrafanaAvatar");
    }

    @Test(priority = 6, description = "Test07 - Search Users", dataProvider = "data-provider-users",dataProviderClass = utilets.ManageDDT.class)
    @Description( "This test Search Users in a table using DDT")
    public void Test07_searchUsers(String user,String shouldExist) {
        UIActions.mouseHover(GrafanaLeftMenu.btn_server, GrafanaServerAdmin.link_users);
        WebFlows.searchAndVerifyUser(user,shouldExist);
    }
}
