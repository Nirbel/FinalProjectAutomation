package workflows;

import extnsions.UIActions;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import utilets.CommonOps;

public class ElectronFlows extends CommonOps {

    @Step("Business Flow: Add New Task to The List")
    public static void addNewTask(String taskName) {
        UIActions.updateText(todoMain.txt_create, taskName);
        UIActions.insertKey(todoMain.txt_create, Keys.RETURN);
    }

    @Step("Business Flow: Count and Return Number of Task in List")
    public static int getNumberOfTask() {
        return todoMain.list_tasks.size();
    }

    @Step("Business Flow: Empty Lists From Tasks")
    public static void emptyList() {
        for (int i = 0; i < getNumberOfTask(); i++) {
            UIActions.mouseHover(todoMain.btn_x);
        }
    }
}

