package test;
import static java.lang.System.out;

public class UseAccount1 {
	
	public static void main(String args[]){
		
		Account1 myAccount = new Account1();
		Account1 yourAccount = new Account1();
		
		myAccount.setName("Ram Borra");
		myAccount.setAddress("1 Hanover Square");
		myAccount.setBalance(22.25);

		yourAccount.setName("Dinesh Borra");
		yourAccount.setAddress("2 Hanover Square");
		yourAccount.setBalance(34.72);
		
		
		out.print(myAccount.getName());
		out.print("  {");
		out.print(myAccount.getAddress());
		out.print(") has $ ");
		out.print(myAccount.getBalance());
		out.println();
		
		out.print(yourAccount.getName());
		out.print("  {");
		out.print(yourAccount.getAddress());
		out.print(") has $ ");
		out.print(yourAccount.getBalance());
		out.println();
		
		
		
		
		
	}


}

