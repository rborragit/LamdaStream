<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.3/jquery.min.js"></script>
<style type="text/css">
   h3{ font-size: 30px; color: aqua; width: 600px; border-width : 3px; border-style: solid;
          border-color: grey; padding : 10px}
   table{ table-layout: fixed; width: 300px; border-width : 3px; border-style: solid;
          border-color: blue; padding : 60px}
   td   { width: 175px; border-width : 1px; border-style: solid;
          border-color: green ; padding : 1px}
  
</style>
<title>Welcome to Processing Dates</title>
</head>

<body>
<img src="images/submit.jpg" />

<form action="ProcessServelet" method="post">
<p>
<center>
<h3>Welcome to Processing Management</h3>
</center>
<br>
<br>
<table class="tbls">
   <tr>
         <td>Processing Date </td>
         <td><input type="text" name="pdate" ></td>
   </tr>
   <tr>
         <td>Accounting Date </td>
         <td><input type="text" name="adate"></td>
    </tr>
    <tr>         
         <td><center><input type="submit" value="Submit"></center> </td>
         <td><center><input type="reset" value="reset"></center></td>
    </tr>
    
</table>
<br>

<br>


</p>
</form>  

<script type="text/javascript" >
$(document).ready(function(){
	
	 /*  $(".imgcls").css({"background-image" : "url(Images/submit.jpg"
			  
	                    });
	  $("table").css({ "table-layout" : "auto",
		               "width "       : "200px",
		                "border-width" : "3px",
		                "border-style": "solid",
					    "border-color": "blue",
					    "padding"     : "20px"
		             });
	  
	  $("td").css({
          
           "border-width" : "1px",
           "border-style": "solid",
		    "border-color": "red",
		    "padding"     : "2px"
        });
	 */
	});

</script>

</body>
</html>