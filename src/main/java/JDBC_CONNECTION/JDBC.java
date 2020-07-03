package JDBC_CONNECTION;

import java.sql.*;

public class JDBC implements interfaces.Connection {
    private String URL;
    private String USERNAME;
    private String PASS;
    private String JDBC_Driver;

    public JDBC(String URL, String USERNAME, String PASS, String JDBC_Driver){
        this.URL = URL;
        this.USERNAME =USERNAME;
        this.PASS = PASS;
        this.JDBC_Driver = JDBC_Driver;
    }

    public void connect(){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String SQL = "SELECT * FROM new_table WHERE new_table.name LIKE 'D%'";

        try {
            System.out.println("Registering JDBC driver...");
            Class.forName(JDBC_Driver);

            System.out.println("Creating database connection...");
            connection = DriverManager.getConnection(URL, USERNAME, PASS);

            System.out.println("Executing statement...");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL);

            System.out.println("Retrieving data from database...");
            while (resultSet.next()){
                System.out.println(resultSet.getString(2));

            }

            System.out.println("Closing connection and releasing resources...");
            resultSet.close();
            statement.close();
            connection.close();

        }catch (
                SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
