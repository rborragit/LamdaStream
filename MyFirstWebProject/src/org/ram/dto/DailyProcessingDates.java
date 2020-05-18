package org.ram.dto;

import static java.lang.System.out;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class DailyProcessingDates {

	private Date pdate;
	private Date adate;
	

	public void setPdate(Date pdate) {
		this.pdate = pdate;		
	}
	
	public Date getPdate() {
		
	/*SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");	
	sdf.setLenient(false);
		try{
		     Date d = sdf.format(pdate);
			
			  } catch(ParseException exception) { 
				  
				  pdate= "Invalid Procesing date passed. Format should be MM/DD/YYYY. ";
		  }*/
	
		return pdate;
		
	}
	
	public void setAdate(Date adate) {
		this.adate = adate;
	}
	
	public Date getAdate() {
		
		/*SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");	
		sdf.setLenient(false);
			try{
			     Date d = sdf.parse(adate);
				
				  } catch(ParseException exception) { 
					  
					  adate= "Invalid Accounting date passed. Format should be MM/DD/YYYY. ";
			  }*/
		return adate;
	}


	
	  


}
