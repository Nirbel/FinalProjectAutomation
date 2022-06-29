package workflows;

import extnsions.UIActions;
import io.qameta.allure.Step;
import utilets.CommonOps;

public class DesktopFlows extends CommonOps {

    @Step("Calculate Addition 1+5+9")
    public static void calculateAddition(){
        UIActions.click(calcMain.btn_clear);
        UIActions.click(calcMain.btn_one);
        UIActions.click(calcMain.btn_plus);
        UIActions.click(calcMain.btn_five);
        UIActions.click(calcMain.btn_plus);
        UIActions.click(calcMain.btn_nine);
        UIActions.click(calcMain.btn_equals);


    }

}