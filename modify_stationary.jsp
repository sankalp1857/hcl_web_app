<%-- 
    Document   : modify23
    Created on : Jun 8, 2016, 6:26:11 PM
    Author     : Sankalp Mehra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form name="f1"action="./modify_stationary"  method="get"  >
           <fieldset>
               <legend><h2>STATIONARY ITEMS MODIFICATION FORM</h2></legend>
   EMPLOYEE ID : &nbsp&nbsp&nbsp
  <input type="text"  name="EID" required ><br>
  
    <button class="button" style="vertical-align:middle"><span>MODIFY</span></button>

   </fieldset>
</form> 
       
       
    </body>
</html>
