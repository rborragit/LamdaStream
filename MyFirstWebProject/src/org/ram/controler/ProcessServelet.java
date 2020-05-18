package org.ram.controler;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.ram.dto.DailyProcessingDates;
import org.ram.dto.GetProcesingDates;
import org.ram.dto.ProcessingTab;

/**
 * Servlet implementation class ProcessServelet
 */
@WebServlet("/ProcessServelet")
public class ProcessServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get adate " + request.getParameter("adate"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  	System.out.println("post pdate " + request.getParameter("pdate"));
		System.out.println("post adate " + request.getParameter("adate"));
		
		
		String pdSt = request.getParameter("pdate");
		String adSt = request.getParameter("adate");
		

        Date pdt = null;
		Date adt = null;
		
				
		try {
			pdt = new SimpleDateFormat("MM/dd/yyyy",Locale.ENGLISH).parse(pdSt);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        
		try {
			adt = new SimpleDateFormat("MM/dd/yyyy").parse(adSt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" pdate " + pdt + "  adate " + adt);
		
		DailyProcessingDates savedp = new DailyProcessingDates();
		
		DailyProcessingDates currdp = new DailyProcessingDates();
		DailyProcessingDates nextdp = new DailyProcessingDates();
		
		GetProcesingDates gp = new GetProcesingDates();
		
		savedp.setPdate(pdt);
		savedp.setAdate(adt);
		gp.UpdateDates(savedp);
		
       // nextdp = (DailyProcessingDates) gp.calcDates();
      //  currdp = (DailyProcessingDates) gp.getDates();
        
     /* System.out.println("servelet currdp class -  accouting date" + currdp.getAdate());
      System.out.println("servelet currdp class -  processing date" + currdp.getPdate());
      
      System.out.println("servelet nextdp class -  accouting date" + nextdp.getAdate());
      System.out.println("servelet nextdp class -  processing date" + nextdp.getPdate());*/
            		
		
       /* passing dp object using sesssion.  
        request.getSession().setAttribute("dp", dp);
	 	response.sendRedirect("./display.jsp");*/
        
        /* passing dp object using request */
        
        /*request.setAttribute("currdp", currdp);
        request.setAttribute("nextdp", nextdp);
        RequestDispatcher dispatcher = request.getRequestDispatcher("display.jsp");
        dispatcher.forward(request, response);
        */
	 	
		
		
	}

}

