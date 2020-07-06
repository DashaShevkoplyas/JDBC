package jdbc.connection;

import java.sql.*;

import entities.Host;

public class Jdbc extends Host {
    private String jdbcDriver;

    public Jdbc(String url, String username, String pass, String jdbcDriver) {
        super(url, username, pass);
        this.jdbcDriver = jdbcDriver;
    }

    public void connect() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String SQL = "SELECT * FROM new_table WHERE new_table.name LIKE 'D%'";

        try {
            System.out.println("Registering JDBC driver...");
            Class.forName(jdbcDriver);

            System.out.println("Creating database connection...");
            connection = DriverManager.getConnection(getUrl(), getUsername(), getPass());

            System.out.println("Executing statement...");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL);

            System.out.println("Retrieving data from database...");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2));

            }

            System.out.println("Closing connection and releasing resources...");
            resultSet.close();
            statement.close();
            connection.close();

        } catch (
                SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
