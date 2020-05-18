package experiments;

public class Singleton {
	
	public static Singleton s1; 
	public static String FirstName;
	public String LastName;
		
	public Singleton(String FirstName, String LastName){
		this.FirstName = FirstName;
		this.LastName  = LastName;
		
	}
	
	public static Singleton getInstance(){
		
	if (s1 == null) {
		Singleton s1 = new Singleton("ram", "borra");
    	 
	}
	return s1;
	}

}
