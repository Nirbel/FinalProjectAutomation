package workflows;


import extnsions.DBActions;
import extnsions.UIActions;
import extnsions.Verfications;
import io.qameta.allure.Step;
import utilets.CommonOps;

import java.util.List;

public class WebFlows extends CommonOps {
    @Step("Business Flow: Login")
    public static void login(String user, String pass){
        UIActions.updateText(Grafanalogin.txt_username , user);
        UIActions.updateText(Grafanalogin.txt_password , pass);
        UIActions.click(Grafanalogin.btn_login);
        UIActions.click(Grafanalogin.btn_skip);
    }
    @Step("Business Flow: Login to Grafana with DB Credentials ")
    public static void loginDB(){
        String query ="SELECT name, password FROM Employees WHERE id ='3'";
        List<String> cred = DBActions.getCredentials(query);
        UIActions.updateText(Grafanalogin.txt_username ,cred.get(0));
        UIActions.updateText(Grafanalogin.txt_password ,cred.get(1));
        UIActions.click(Grafanalogin.btn_login);
        UIActions.click(Grafanalogin.btn_skip);
    }
    @Step("Business Flow: Create New User")
    public static void createNewUser(String Name,String email,String userName,String pass){
        UIActions.click(GrafanaServerAdminMain.btn_newUser);
        UIActions.updateText(grafanaAddNewUserPage.txt_name, Name);
        UIActions.updateText(grafanaAddNewUserPage.txt_email,email);
        UIActions.updateText(grafanaAddNewUserPage.txt_username,userName);
        UIActions.updateText(grafanaAddNewUserPage.txt_password,pass);
        UIActions.click(grafanaAddNewUserPage.btn_createUser);

    }
    @Step("Business Flow: Delete Last User")
    public static void deleteLastUser()  {
        UIActions.click(GrafanaServerAdminMain.rows.get(GrafanaServerAdminMain.rows.size()-1));
        UIActions.click(grafanaEditUserPage.btn_deleteUser);
        UIActions.click(grafanaEditUserPage.btn_confirmDeleteUser);
    }

    @Step("Business Flow: Search And Verify  User")
    public static void searchAndVerifyUser(String user, String shouldExists) {
        UIActions.updateTextHumen(GrafanaServerAdminMain.txt_search,user);
        if (shouldExists.equalsIgnoreCase("exist"))
            Verfications.existanceOfElement(GrafanaServerAdminMain.rows);
        else if (shouldExists.equalsIgnoreCase("not-exist"))
            Verfications.visbilityOfElements(GrafanaServerAdminMain.rows);
        else
            throw new RuntimeException("Invalid Expected Output Option in Data Driven testing,Should be exist or not exist");
    }
}
