<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.3/jquery.min.js"></script>
<title>Welcome Page</title>
</head>
<body>
<img src="submit.jpg" />

<h2>Processing Dates Management</h2>
<h3><a href="viewupdate.jsp"> 1)  View/Update Processing Dates</a></h3>

<script type="text/javascript" >
$(document).ready(function(){
	$("h2").css({
		        "background-color":"Yellow",
		        "border-width": "1px",
			    "border-style": "solid",
			    "border-color": "blue",
			  	"width": "400px",
			  	"position": "relative",
			  	"top"     : "20px",			  	
                "left"    : "200px",	
               
	});
	
	$("h3").css({
        "border-width": "2px",
	    "border-color": "blue",
	  	"width": "400px",
	  	"position": "relative",
	  	"top"     : "100px",			  	
        "left"    : "50px",	
       
});
	$("h2").mouseenter(function() {
		$("h2").css("background-color","Yellow");
	/* 	alert("welcome"); */
	   
	   });

	});

</script>

</body>
</html>

