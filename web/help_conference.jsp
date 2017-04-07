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
    color:#8B4513
               }

    body {
background-image: URL("B.jpg");
 background-repeat:no-repeat;
        background-color: lightblue;
         color: red; 
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
	.button {
  display: inline-block;
  border-radius: 4px;
  background-color:#F0E68C;
  border: none;
  color:	#FF8C00;
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
          <form name="f1"action="./conference_save"  method="get"  >
         <fieldset>
                <legend><h2>CONFERENCE ROOM BOOKING FORM</h2></legend>
      Employee Id: &nbsp&nbsp&nbsp
  <input type="text"  name="EID" value="${name}" required ><br>          
   Employee Name: &nbsp&nbsp&nbsp
  <input type="text"  name="ENAME" value="${gender}" required ><br>
  Contact No:<br>
   <input type="text"  name="CONTACT" value="${contact}" Min=1000000000 max=9999999999><br>
  E-Mail:<br>
   <input type="email"  name="email" value="${email}" required><br>
    Purpose-of-the-conference:&nbsp&nbsp&nbsp
   <input type="text" name="PURPOSE" value="${ename}" required><br>
   Date-of-the-conference:&nbsp&nbsp&nbsp
   <input type="date" name="date"  value="${eid}" required>
   <BLINK><a class="z"href="./check" target="_blank"><span>Check Availability</span></a></BLINK><br>
  Commencement-Time:&nbsp&nbsp&nbsp
   <input type="time" value="${time}" name="ENTRY" required>
   <br>
   Duration:&nbsp&nbsp&nbsp
   <select name="DURATION" class="x">
  <option value="1" ${requestScope['purpose'] == '1'?  'selected':''}>1 hour</option>
  <option value="2" ${requestScope['purpose'] == '2'?  'selected':''}>2 hours</option>
  <option value="3" ${requestScope['purpose'] == '3'?  'selected':''}>3 hours</option>
  <option value="4" ${requestScope['purpose'] == '4'?  'selected':''}>4 hours</option>
  <option value="5" ${requestScope['purpose'] == '5'?  'selected':''}>5 hours</option>
  <option value="6" ${requestScope['purpose'] == '6'?  'selected':''}>6 hours</option>
  
</select>
   <br>
  Conference-Room Location:&nbsp&nbsp&nbsp
  <select name="LOCATION" class="x">
  <option value="SOFTWARE TOWER-1" ${requestScope['laptop'] == 'SOFTWARE TOWER-1'?  'selected':''}>SOFTWARE TOWER-1</option>
  <option value="SOFTWARE TOWER-2" ${requestScope['laptop'] == 'SOFTWARE TOWER-2'?  'selected':''}>SOFTWARE TOWER-2</option>
  <option value="SOFTWARE TOWER-3" ${requestScope['laptop'] == 'SOFTWARE TOWER-3'?  'selected':''}>SOFTWARE TOWER-3</option>
  <option value="SOFTWARE TOWER-4" ${requestScope['laptop'] == 'SOFTWARE TOWER-4'?  'selected':''}>SOFTWARE TOWER-4</option>
</select>
  <br>
  No of Attendees:<br>
   <input type="text"  value="${laptop1}" name="NUMBER"><br>
<button class="button" style="vertical-align:middle"><span>SUBMITT</span></button>

</form> 
   </fieldset>
    </body>
</html>
