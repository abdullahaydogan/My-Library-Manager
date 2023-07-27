import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String dbUserName="root";
    private String dbPassword="";
    private String dbUrl="jdbc:mysql://localhost:3306/Library";
    private Connection connection=null;

    Connection getConnection() throws SQLException{
        return connection= DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
    }




}
