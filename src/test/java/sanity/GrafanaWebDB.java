package sanity;

import extnsions.Verfications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilets.CommonOps;
import workflows.WebFlows;

@Listeners(utilets.Listeners.class)
public class GrafanaWebDB extends CommonOps {

    @Test( description = "Test01 - verify Login to Grafana with DB  Credentials")
    @Description(" This Test  Login to Grafana with DB  Credentials and verifies the main header")
    public void Test01_VerifyHeader() {
        WebFlows.loginDB();
        Verfications.verifyTextInElement(Grafanamaim.head_dashboard, "Dashboards");


    }
}
