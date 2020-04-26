import java.sql.Connection; 
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ConnectDB {
    //DB Connection variables
    
    static Connection connection = null; 
    static String databaseName = "emclau5db"; 
    static String url = "jdbc:mysql://localhost:3360/" +databaseName; 
    
    static String username = "emclau5d";       //username of MySQL Workbench
    static String password = "Cosc*r7e8";     //password of MySQL Workbench
    
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
     
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        connection = DriverManager.getConnection(url,username,password); 
        
        
        // THE CODE BELOW IS TO TEST WHETHER A RECORD CAN BE INSERTED ONCE CONNECTION IS ESTABLISHED.
        /*PreparedStatement ps = connection.prepareStatement("INSERT INTO . . . "); 
        int status = ps.executeUpdate();   //This method always returns in integer value of the execution is successful
        
        if (status != 0) {
            System.out.println("Database was conneted");
            System.out.println("Record was inserted!");            
            
        }
        */
        
    }
    
}
