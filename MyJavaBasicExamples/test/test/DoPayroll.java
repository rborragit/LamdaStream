package test;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class DoPayroll {
	
	public static void main(String args[]) 
	                   throws IOException{
		 Scanner diskscanner = new Scanner(new File("EmployeeInfo.txt"));
		
		for(int empNum=1; empNum<=4; empNum++){
			payOneEmployee(diskscanner);
		
		}
	}
	
	public static void payOneEmployee(Scanner eScanner){
		Employee anEmployee = new Employee();
		
		anEmployee.setName(eScanner.nextLine());
		anEmployee.setjobTitle(eScanner.nextLine());
		anEmployee.cutCheck(eScanner.nextDouble());
		eScanner.nextLine();
				
	}

}
