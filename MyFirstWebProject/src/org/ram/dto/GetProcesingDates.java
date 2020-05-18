package org.ram.dto;


import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;

public class GetProcesingDates {

    /* This method takes the current processing and accounting dates 
     * and determines the next processing and accounting dates 
     * and returns them */
	public DailyProcessingDates calcDates(){
 
	DailyProcessingDates nextdp = new DailyProcessingDates();

    ProcessingTab pt = new ProcessingTab();
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    Session session = sessionFactory.openSession();
    session.beginTransaction();
   
    pt = (ProcessingTab) session.get(ProcessingTab.class, "PROCESSING_DT");
     
    Calendar c = Calendar.getInstance();
    c.setTime(pt.getPARM_DT());
    int day = c.get(Calendar.DAY_OF_WEEK);
   
    switch (day) {
      case 6:
        c.setTime(pt.getPARM_DT());
        c.add(Calendar.DATE,3);
        break;
      default:
        c.setTime(pt.getPARM_DT());
        c.add(Calendar.DATE,1);
        break;
      }
        
    System.out.println("New Processing date " + c.getTime());
    nextdp.setPdate(c.getTime()); // setting up the next processing date
   
    pt = (ProcessingTab) session.get(ProcessingTab.class, "ACCOUNTING_DT");
        
    c = Calendar.getInstance();
    c.setTime(pt.getPARM_DT());
    day = c.get(Calendar.DAY_OF_WEEK);
   
    switch (day) {
      case 6:
        c.setTime(pt.getPARM_DT());
        c.add(Calendar.DATE,3);
        break;
      default:
        c.setTime(pt.getPARM_DT());
        c.add(Calendar.DATE,1);
        break;
      }
     
    System.out.println("New Accounting date " + c.getTime());
    
    nextdp.setAdate(c.getTime()); // setting up the next processing date
    
  
    session.close();
    
    return nextdp;
    
      
	}
   
   
	/* This method returns the current processing and accounting dates*/
	
   public DailyProcessingDates getDates(){
	   
		DailyProcessingDates currentdp = new DailyProcessingDates();

	    ProcessingTab pt = new ProcessingTab();
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	   
	    pt = (ProcessingTab) session.get(ProcessingTab.class, "PROCESSING_DT");
	    currentdp.setPdate(pt.getPARM_DT());
	 
        System.out.println("Current Processing date " + pt.getPARM_DT());
 

	    pt = (ProcessingTab) session.get(ProcessingTab.class, "ACCOUNTING_DT");
        currentdp.setAdate(pt.getPARM_DT());
	    	         
	    System.out.println("Current Accounting date " + pt.getPARM_DT());
	   
	    session.close();
	    
	    return currentdp;
	    
	   
	    
		}
	   
   /* This method save the processing and accounting dates being passed */
   public void UpdateDates(DailyProcessingDates saveDates){
	   
	ProcessingTab pt = new ProcessingTab();
		
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    Session session = sessionFactory.openSession();
    session.beginTransaction();
   
    pt = (ProcessingTab) session.get(ProcessingTab.class, "PROCESSING_DT");
    pt.setPARM_DT(saveDates.getPdate());
    session.update(pt);
    
    session.getTransaction().commit();
    
   // System.out.print("saved" + pt.getPARM_DT());
    
    session.beginTransaction();
      
    pt = (ProcessingTab) session.get(ProcessingTab.class, "ACCOUNTING_DT");
    pt.setPARM_DT(saveDates.getAdate());
    session.update(pt);    
    session.getTransaction().commit();
    
   // System.out.print("saved" + pt.getPARM_DT());
    session.close();
 
 
    
	}
    
}
    
    
    
