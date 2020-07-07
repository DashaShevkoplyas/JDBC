package jdbc.connection;

import java.sql.*;

import entities.Host;
import entities.Person;
import implementation.InfoImpl;
import implementation.QueriesImpl;

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
        try {
            System.out.println("Registering JDBC driver...");
            Class.forName(jdbcDriver);

            System.out.println("Creating database connection...");
            connection = DriverManager.getConnection(getUrl(), getUsername(), getPass());

            System.out.println("Create statement...");
            statement = connection.createStatement();

            System.out.println("Insert record...");
            String insert = new QueriesImpl().insert(new Person("Jake", 15));
            statement.executeUpdate(insert);

            System.out.println("Execute statement...");
            String SQL = new QueriesImpl().selectAll();
            resultSet = statement.executeQuery(SQL);

            System.out.println("Retrieving data from database...");
            new InfoImpl().getAllPeople(resultSet);

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
