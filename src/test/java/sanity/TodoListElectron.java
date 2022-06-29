package sanity;

import extnsions.Verfications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilets.CommonOps;
import workflows.ElectronFlows;

@Listeners(utilets.Listeners.class)
public class TodoListElectron extends CommonOps {

    @Test(description = "Test01 - Add And Verify New Task ")
    @Description("This test adds a new task and verifies it in the list of tasks ")
    public void Test01_AddAndVerifyNewTask() {
        ElectronFlows.addNewTask("Learn C#");
        Verfications.verifyNumber(ElectronFlows.getNumberOfTask(), 1);
    }

    @Test(description = "Test02 - Add And Verify New Task ")
    @Description("This test adds a new task and verifies it in the list of tasks ")
    public void Test02_AddAndVerifyNewTask() throws InterruptedException {
        Thread.sleep(5000);
        ElectronFlows.addNewTask("Learn Python");
        ElectronFlows.addNewTask("Learn C++");
        ElectronFlows.addNewTask("Learn Java");
        Verfications.verifyNumber(ElectronFlows.getNumberOfTask(), 3);
    }
}
