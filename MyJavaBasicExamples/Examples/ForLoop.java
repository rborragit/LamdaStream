package Examples;

import static java.lang.System.out;

public class ForLoop {
	
	public static void main(String args[]){
		
		out.println("Exmaple of Java For Loop");
		
		for (int i=0; i<5;){
		
			if (i < 4 ){
				out.print("count display in  IF ");
						out.print(i);
						out.println();
				i++;
			} else {
			
				out.print("count display in ELSE ");
						out.print(i);
						out.println();
						i++;
			}
			
			
		}
	}

}
