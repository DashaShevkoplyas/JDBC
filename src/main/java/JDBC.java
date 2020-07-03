import java.sql.*;

public class JDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/test_schema";
    private static final String USERNAME = "root";
    private static final String PASS = "root123";
    private static final String JDBC_Driver = "com.mysql.cj.jdbc.Driver";


    public static void main(String[] args) {
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
                System.out.println(resultSet.getString(1));
            }

            System.out.println("Closing connection and releasing resources...");
            resultSet.close();
            statement.close();
            connection.close();

        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
