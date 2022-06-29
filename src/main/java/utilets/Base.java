package utilets;

import io.appium.java_client.AppiumDriver;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;
import pageobject.grafana.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base {

    //General
    protected static WebDriverWait wait;
    protected static Actions action;
    protected static SoftAssert softAssert;
    protected static Screen screen;
    protected static String Platform;

    //Web
    protected static WebDriver driver;

    //Mobile
    protected static AppiumDriver mobileDriver;
    protected static DesiredCapabilities dc = new DesiredCapabilities();



    //Rest API
    public static RequestSpecification httpRequest;
    public static Response response;
    public static JSONObject params = new JSONObject();
    public static JsonPath jp;

    //DataBase
    protected static Connection con;
    protected static Statement stmt;
    protected static ResultSet rs;



    //Page Objects-Web
    public static LoginPage Grafanalogin;
    public static MainPage Grafanamaim;
    public static LeftMenuPage GrafanaLeftMenu;
    public static ServerAdminMenuPage GrafanaServerAdmin;
    public static ServerAdminMainPage GrafanaServerAdminMain;
    public static AddNewUserPage grafanaAddNewUserPage;
    public static EditUserPage grafanaEditUserPage;

    //Page Objects-Mobile
    protected static pageobject.mortgage.MainPage mortgageMain;

    //Page Objects-Electron
    protected static pageobject.todo.MainPage todoMain;

    //Page Objects-Desktop
    protected static pageobject.calculator.MainPage calcMain;
}
