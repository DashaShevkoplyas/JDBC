import jdbc.connection.Jdbc;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/test_schema";
    private static final String USERNAME = "root";
    private static final String PASS = "root123";
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";


    public static void main(String[] args) {
        Jdbc jdbc = new Jdbc(URL, USERNAME, PASS, JDBC_DRIVER);
        jdbc.connect();


    }
}
