package Examples;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import static java.lang.System.out;
import java.text.NumberFormat;

public class CreateTable {
public static void main(String args[]){	

	final String DRIVER     = "org.apache.derby.jdbc.EmbeddedDriver";		                          
	final String CONNECTION = "jdbc:derby:AccountDatabase;create=true" ; ; 
                          

try {
	Class.forName(DRIVER).newInstance();
	} catch (InstantiationException e) {
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}	


 //try  (   connection statements here ) { statement.* here  } catch {}

try { 
    Connection connection = DriverManager.getConnection(CONNECTION);
    Statement statement = connection.createStatement();
    
    statement.executeUpdate("Create table ACCOUNTS         " 
    	+	" (NAME VARCHAR(32) NOT NULL PRIMARY KEY,      "
    	+   "  ADDRESSS VARCHAR(32),                       "
    	+   "  BALANCE FLOAT)                              ");
    
    System.out.println("table created");
    statement.executeUpdate("insert into ACCOUTNS values"
    		+ "  ('Barry Burd', '223 XYZ LN', 24.50)");
    
    statement.executeUpdate("insert into ACCOUTNS values"
    		+ "  ('Linda Burd', '111 abc LN', 42.50)"); }
    		
      catch (SQLException e){
              e.printStackTrace();
      }        
	 
// }

}
}
