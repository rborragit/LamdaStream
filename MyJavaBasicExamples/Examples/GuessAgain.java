package Examples;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class GuessAgain {

	public static void main(String args[]){
		
		Scanner keyborad = new Scanner(System.in);
		
		int numberofguess = 0;
		int randomnumber  = new Random().nextInt(10)+1;
		
		out.print("************************");
		out.println("Welcome to Guessing Game");
		out.print("************************");
		out.println();
		
		out.print("Please Enter the numbers between 1 to 10");
		int inputnumber = keyborad.nextInt();
		numberofguess++;
		
		while (inputnumber != randomnumber){
			
			out.println();
			out.println("Try Agin....");
			out.print("Please Enter the numbers between 1 to 10");
			inputnumber = keyborad.nextInt();
			numberofguess++;
		}
	 out.println("You win after " + numberofguess + " guess");
	}
	
}
