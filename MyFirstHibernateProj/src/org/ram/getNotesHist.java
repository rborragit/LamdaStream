package org.ram;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.ram.dto.Notes_Hist;

public class getNotesHist {

	
	public static void main(String[] args) {
	
	   Notes_Hist notehist = new Notes_Hist();
				   
       SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
       Session session = sessionFactory.openSession();
       session.beginTransaction();
       
       
       notehist = (Notes_Hist) session.get(Notes_Hist.class, "AA0001");
       notehist.setCLMT_FIRST_NM("Ram");
       //session.save(notehist);
       session.update(notehist);
       session.getTransaction().commit();

              
       /*Query query = session.createQuery("from Notes_Hist where CLM_STAT_CD = ? ");
       query.setString(0, "9");
       query.setMaxResults(5);
       
       List<Notes_Hist> notes = (List<Notes_Hist>) query.list();
       for (Notes_Hist n: notes)
       {
           System.out.println("Plan Number " + n.getPLN_NR() + " Claim Number " + n.getCLM_NR());
           
       }*/
       
       
       System.out.print(" name " + notehist.getBEN_ANAL_ID());
       System.out.print(" name " + notehist.getCLMT_FIRST_NM());
     
       session.close();
       
       
	}

}
