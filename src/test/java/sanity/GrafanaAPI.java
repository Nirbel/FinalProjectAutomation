package sanity;


import extnsions.Verfications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilets.CommonOps;
import workflows.ApiFlows;

@Listeners(utilets.Listeners.class)
public class GrafanaAPI extends CommonOps {

    @Test(description = "Test01 : Get Team From Grafana")
    @Description("This Test Verify Team Property")
    public void test01_verifyTeam() {
        Verfications.verifyText(ApiFlows.getTeamProperty("teams[0].name"), "Nir_team01");
    }

    @Test(description = "Test02 : Add Team And Verify")
    @Description("This Test Adds Team to Grafana  And Verify it")
    public void test02_addTeamAndVerify() {
        ApiFlows.postTeam("NitTeam", "nir@gmail.com");
        Verfications.verifyText(ApiFlows.getTeamProperty("teams[1].name"), "NitTeam");
    }

    @Test(description = "Test03 : Update Team And Verify")
    @Description("This Test Updates a Team in Grafana  And Verify it")
    public void test03_updateTeamAndVerify() {
        String id = ApiFlows.getTeamProperty("teams[1].id");
        ApiFlows.updateTeam("NitTeam", "nir@bel.com", id);
        Verfications.verifyText(ApiFlows.getTeamProperty("teams[1].email"), "nir@bel.com");
    }

    @Test(description = "Test04 : Update Team And Verify")
    @Description("This Test Delete a Team in Grafana  And Verify it")
    public void test04_deleteTeamAndVerify() {
        String id = ApiFlows.getTeamProperty("teams[1].id");
        ApiFlows.deleteTeam(id);
        Verfications.verifyText(ApiFlows.getTeamProperty("totalCount"), "1");
    }
}
