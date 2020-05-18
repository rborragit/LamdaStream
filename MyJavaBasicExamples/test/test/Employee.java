package test;
import static java.lang.System.out;

public class Employee {

	private String name;
	private String jobTitle;
	
	public void setName(String inName){
		name = inName;
	}
	
	public String getName(){
		
		return name;
	}
	
	public void setjobTitle(String jobTitleIn){
		
		jobTitle = jobTitleIn;
		
	}
	public String getjobTitle(){
		return jobTitle;
		
	}
	
	public void cutCheck(double amountPaid){
		out.printf("Pay to the order of %s", name);
		out.printf("(%s) ****$",jobTitle);
		out.printf("%,.2f\n", amountPaid);
		
			}
	
}
