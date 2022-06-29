package sanity;


import extnsions.Verfications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilets.CommonOps;
import workflows.MobileFlows;

@Listeners(utilets.Listeners.class)

public class mortgageMobile extends CommonOps {
    @Test( description = "Test01 - verify Mortgage")
    @Description("This Test fill in mortgage fields and calculate")
    public void Test01_verifyMortgage()  {
        MobileFlows.calculateMortgage("800", "5", "3");
        Verfications.verifyTextInElement(mortgageMain.txt_repayment, "£14.56");

    }
}
