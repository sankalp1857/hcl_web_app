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
    color: black;
               }

    body {
background-image: URL("Untitled-1.jpg");
 background-repeat:no-repeat;
        background-color: lightblue;
         color:red; 
	font-family:gabriola;
	font-size:25px;
 	font-weight:bold;  
            }
input 
{
    outline: none;
    font-size: 20px;
    font-family: "TW Cen MT";
    padding: 4px 8px;
    background: rgba(255,255,255,.4); 
    border-radius: 6px;
    border: none;
    box-shadow: 0 0 6px rgba(0,0,0,.2);
    transition:ease-out .1s;
}


input:focus
{
    background: rgba(0,0,0,.3);
    color: white;
    box-shadow: 0 0 10px rgba(255,255,255,1); 
}

	.button {
  display: inline-block;
  border-radius: 4px;
  background-color: #f4511e;
  border: none;
  color: #FFFFFF;
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
          <form name="f1"action="./update_save"  method="get"  >
         <fieldset>
               <legend><h2>MODIFICATION FORM</h2></legend>
   Name of the visitor: &nbsp&nbsp&nbsp
  <input type="text"  name="name" value="${name}"required ><br>
  Contact No:<br>
   <input type="text"  name="contact" value="${contact}" required Min=1000000000 max=9999999999><br>
  E-Mail:<br>
   <input type="email"  name="email" value="${email}" required><br>
  
 GENDER<br>
  <input type="radio" name="gender" required value="male" ${requestScope['gender'] == 'male'? 'checked':''}> Male
  <input type="radio" name="gender" required value="female" ${requestScope['gender'] == 'female'? 'checked':''} > Female
   <input type="radio" name="gender" required value="other"  ${requestScope['gender'] == 'other'? 'checked':''}> Other<br>
  Employee Name to visit:&nbsp&nbsp&nbsp
  <input type="text" name="ename" value="${ename}" required><br>
  Employee Id:&nbsp&nbsp&nbsp
   <input type="text" name="eid" value="${eid}" required><br>
   Entry-Time:&nbsp&nbsp&nbsp
   <input type="time" name="time" value="${purpose}" required>
   <br>
   Purpose-of-the-visit:&nbsp&nbsp&nbsp
   <input type="text" name="purpose" value="${time}" required><br>
   Do you have a laptop:<br>
            <input type="radio"  name="laptop" required value="y" ${requestScope['laptop'] == 'y'?  'checked':''}> YES
   <input type="radio" name="laptop"required value="n" ${requestScope['laptop'] == 'n'? 'checked':''}> NO<br>
    <button class="button" style="vertical-align:middle"><span>MODIFY</span></button>

   
</form> 
   </fieldset>
    </body>
</html>
