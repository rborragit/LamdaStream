package Examples;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import static java.lang.System.out;
import java.text.NumberFormat;


public class GetData {
	public static void main(String args[]){	

		final String DRIVER     = "org.apache.derby.jdbc.EmbeddedDriver";		                          
		final String CONNECTION = "jdbc:derby:AccountDatabase;create=true" ; 

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
		    ResultSet resultset = statement.executeQuery("select * from ACCOUNTS1");
		    
		    
		    while(resultset.next()){
		    	out.print(resultset.getString("NAME"));
		    	out.println();    	
		    }
		}
		    		
		      catch (SQLException e){
		              e.printStackTrace();
		      }        
			 
		// }

		}
}
