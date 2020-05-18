package Examples;
import static java.lang.System.out;
import        java.util.Scanner;

public class Authindicator2 {

	public static void main(String args[]){
		
		Scanner keyboard = new Scanner(System.in);
		
		out.print("username");
		String username = keyboard.next();
		
		if (username.equals("ram")){
			out.print("password");
		    String password = keyboard.next();
		    
		  	if(password.equals("borra")) {
		  		 out.println("you are in.");
		  	  }else {
		  		  out.println("Incorrect password.");
		  	  } 
		}
		  	else {
		          out.println("Unknon user.");
		  	      }
	}
}
