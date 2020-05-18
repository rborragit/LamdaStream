package Examples;
import static java.lang.System.out;

class MakeChange {

	public static void main(String args[]) {
		
		int total     = 248;
		int quaters   = total / 25;
		int whatsleft = total % 25;
		
		int dimes     = whatsleft / 10;
	     whatsleft    = whatsleft % 10;
	  
    	int nickels   = whatsleft / 5;
	     whatsleft    = whatsleft % 10;
	     
	     int cents   = whatsleft;
	     
	     out.println("From " + total  + " cents you get");
	     out.println(quaters + " quaters");
	     out.println(dimes   +  " dimes");
	     out.println(nickels + " nickels");
	     out.println(cents   + " cents");
	     
	     
	     
	     
	    
}
         
	
}
