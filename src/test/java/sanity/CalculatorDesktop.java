package sanity;

import extnsions.Verfications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilets.CommonOps;
import workflows.DesktopFlows;

@Listeners(utilets.Listeners.class)
public class CalculatorDesktop extends CommonOps {

    @Test(description = "Test01 -  Verify Addition Command")
    @Description("This test  verifies the Addition Command ")
    public void Test01_verifyAdditionCommand() {
        DesktopFlows.calculateAddition();
        Verfications.verifyTextInElement(calcMain.field_result, "התצוגה היא 15");
    }

}
