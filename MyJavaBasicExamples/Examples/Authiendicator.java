package Examples;
import javax.swing.JOptionPane;

public class Authiendicator {
	
 public static void main(String args[]){
	 
	 String username = JOptionPane.showInputDialog("Username:");
	 String password = JOptionPane.showInputDialog("Password:");
	 
	 if ( 
			 username != null && 
			 password != null &&
	    	( 
		      (username.equals("ram")  &&
			   password.equals("borra"))     ||
			 
			   (username.equals("ram1")  &&
			    password.equals("borra1"))
			)
		)
	 {
		 JOptionPane.showMessageDialog(null,"You are in");
		 		 
	 } else {
		 JOptionPane.showMessageDialog(null, "You are suspicious");
		 
	 }
		 
 }
 
 

}
