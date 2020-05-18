package Examples;
import static java.lang.System.out;

public class useAssignmentOperator {

public static void main(String args[]) {
		
	int numberofBunnies = 27;
	int numberofExtra   = 53;
	
	numberofBunnies += 1;
	
	out.println(numberofBunnies);
	
	numberofBunnies +=5;
	out.println(numberofBunnies);
	
	numberofBunnies += numberofExtra;
	out.println(numberofBunnies);
	
	numberofBunnies *=2;
	out.println(numberofBunnies);
	
	out.println(numberofBunnies -= 7);
	out.println(numberofBunnies = 100);
			
	
		
	}
	
}
