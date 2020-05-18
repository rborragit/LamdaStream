package Examples;
import static java.lang.System.out;
import java.util.Scanner;

public class FallingForYou {
	
	public static void main(String args[]){
		
		Scanner keyborad = new Scanner(System.in);
		out.print("Which verse?");
		int verse = keyborad.nextInt();
		
		switch(verse){
		case 3:
			out.print("Last refrain,");
			out.println("last refrain,");
		case 2:
			out.print("He is pain,");
			out.println("he is pain,");		
		case 1:
			out.print("Has no brain,");
			out.println("has no brian,");	
		
			}
		 out.println("in the rain, in the rain.");
		 out.println("Ohhhhh...");
		 out.println();
	}
	 
	 }
