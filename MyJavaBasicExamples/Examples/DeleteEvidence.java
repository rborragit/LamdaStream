package Examples;
import java.io.File;
import java.io.IOException;
import static java.lang.System.out;
import java.util.Scanner;

public class DeleteEvidence {

	public static void main(String args[]) throws IOException {
		
	 File evidence = new File("C:\\cookedBooks.txt");
	 Scanner keyboard = new Scanner(System.in);
	 char reply;
	 
	 do {
		 
		 out.print("Do you want to delete Evidence? (y/n) ");
		 reply = keyboard.findWithinHorizon(".",0).charAt(0);
 	 } while (reply != 'y' && reply != 'n');
 		 
 	if (reply == 'y') {
 		 		out.println("Okay...here you goes..");
 		 		evidence.delete();
 		 		out.println("The evidence has been deleted");
 		
 	} else {
 		
 		 out.println("Sorry buddy..just asking..");
 	
 	      }			
	}
}
