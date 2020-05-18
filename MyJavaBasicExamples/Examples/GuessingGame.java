package Examples;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;


public class GuessingGame {
	
	public static void main(String args[]){
	Scanner keyboard = new Scanner(System.in);
	
	out.print("Enter and interger from 1 to 10;");
	
	int imputNumber = keyboard.nextInt();
	int randomNumber = new Random().nextInt(10)+1;
	
	if (imputNumber == randomNumber ){
		out.println("***************");
		out.println("You win.");
		out.println("***************");
	}	
		else {
			out.println("You loose.");
			out.println("The random number was");
			out.println(randomNumber + ".");
		}
	 out.println("Thank You for Playing");
	
			
		
	}

}
