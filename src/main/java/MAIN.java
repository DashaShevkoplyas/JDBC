import JDBC_CONNECTION.JDBC;
public class MAIN {
    private static final String URL = "jdbc:mysql://localhost:3306/test_schema";
    private static final String USERNAME = "root";
    private static final String PASS = "root123";
    private static final String JDBC_Driver = "com.mysql.cj.jdbc.Driver";


    public static void main(String[] args) {
        JDBC jdbc = new JDBC(URL, USERNAME,PASS,JDBC_Driver);
        jdbc.connect();

    }
}
