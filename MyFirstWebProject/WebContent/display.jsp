<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="org.ram.dto.DailyProcessingDates,java.util.Date, org.ram.dto.GetProcesingDates" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Processing Dates</title>
</head>
<body>
<p>
<%-- <%= request.getParameter("pdate")%> --%>
<%
/* DailyProcessingDates dp = (DailyProcessingDates) session.getAttribute("dp"); */
//DailyProcessingDates dp = (DailyProcessingDates) request.getAttribute("dp");
%>
<br>
<%-- processing date : <%//=dp.getAdate() %> --%>
<br>
<%-- accounting date : <%//=dp.getPdate() %> --%>
<br>

<jsp:useBean id="currdp" scope="request" class="org.ram.dto.DailyProcessingDates">
  
</jsp:useBean>


Current Processing date : <jsp:getProperty name="currdp" property="pdate" />
<br>
Current Accounting date : <jsp:getProperty name="currdp" property="adate" />

<br>

<jsp:useBean id="nextdp" scope="request" class="org.ram.dto.DailyProcessingDates">
  
</jsp:useBean>

<br>

Next Processing date : <jsp:getProperty name="nextdp" property="pdate" />
<br>
Next Accounting date : <jsp:getProperty name="nextdp" property="adate" />
</body>
</html>