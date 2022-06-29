package utilets;

import io.qameta.allure.Step;

import java.sql.DriverManager;

public class ManageDB extends CommonOps{

    @Step("Connecting to MySQl DataBase")
    public static void openConnection(String dbURL, String user, String pass)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbURL, user, pass);
            stmt = con.createStatement();
        } catch (Exception e)
        {
            System.out.println("Error Occurred while Connecting to DB, See details: " +e);
        }
    }
    @Step("Closing MySQl Connection")
    public static void closeConnection()
    {
        try
        {
            con.close();
        } catch (Exception e)
        {
            System.out.println("Error Occurred while closing DB, See details: "+e);
        }
    }
}
