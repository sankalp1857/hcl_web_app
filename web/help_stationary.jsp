<%-- 
    Document   : help
    Created on : Jun 7, 2016, 10:19:38 PM
    Author     : Sankalp Mehra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
     <style>
            h2 {
    color:#040100  
               }

    body {
background-image: URL("3.jpg");
 background-repeat:no-repeat;
        background-color: lightblue;
         color:#040100  ; 
	font-family:gabriola;
	font-size:25px;
 	font-weight:bold;  
            }
input 
{
    outline:#8B4513;
    font-size: 20px;
    font-family: "TW Cen MT";
    padding: 4px 8px;
    background:	#F5DEB3; 
    border-radius: 6px;
    border: none;
    box-shadow: 0 0 6px rgba(0,0,0,.2);
    transition:ease-out .1s;
}

	.button {
            background:#040100;
  display: inline-block;
  border-radius: 4px;
  
  border: none;
  color:	#F5DEB3;
  text-align: center;
  font-size: 14px;
  padding: 20px;
  border-radius:12px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '>>';
  position: absolute;
  opacity: 0;
  top: 0;
  right:-40px;
  transition: 0.5s;
  
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}
        </style>
        <title>JSP Page</title>
    </head>
    <body>
         <form name="f1" action="./stationary_save"  method="get"  >
           <fieldset>
               <legend><h2>Stationary Item Order Form</h2></legend>
               Employee Id: &nbsp&nbsp&nbsp<br>
  <input type="text"  name="EID" value="${eid1}" required ><br>          
  Employee Name: &nbsp&nbsp&nbsp<br>
  <input type="text"  name="ENAME" value="${ename1}" required ><br>
  Contact No:<br>
   <input type="text"  name="CONTACT" value="${contact1}"  Min=1000000000 max=9999999999><br>
  E-Mail:<br>
   <input type="email"  name="email" value="${email1}" required><br>
   Date-of-the-order:&nbsp&nbsp&nbsp<br>
   <input type="date"  name="DATE" value="${date1}" required><br><BR>
<button class="button" style="vertical-align:middle"><span>SUBMITT</span></button>

</form> 
   </fieldset>
    </body>
</html>
