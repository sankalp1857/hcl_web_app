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
         <form name="f1"action="./stationary_book_1"  method="get"  >
           <fieldset>
               <legend><h2>Stationary Item Order Form</h2></legend>
               Employee Id: &nbsp&nbsp&nbsp
  <input type="text"  name="EID" value=${eid11} required ><br>
               PEN:&nbsp&nbsp&nbsp
               <select name="PEN" class="x"> 
                    
                    <option value="0" ${requestScope['eid1'] == '0'?  'selected':''}>None</option>
  <option value="1" ${requestScope['eid1'] == '1'?  'selected':''}>1 packet</option>
  <option value="2" ${requestScope['eid1'] == '2'?  'selected':''}>2 packet</option>
  <option value="3" ${requestScope['eid1'] == '3'?  'selected':''}>3 packet</option>
</select>
               <br> <br> 
 MARKER:&nbsp&nbsp&nbsp
               <select name="MARKER" class="x"> 
                    
                   <option value="0" ${requestScope['contact1'] == '0'?  'selected':''}>None</option>
  <option value="1" ${requestScope['contact1'] == '1'?  'selected':''}>1</option>
  <option value="2" ${requestScope['contact1'] == '2'?  'selected':''}>2</option>
  <option value="3" ${requestScope['contact1'] == '3'?  'selected':''}>3</option>
  <option value="4" ${requestScope['contact1'] == '4'?  'selected':''}>4</option>
  <option value="5" ${requestScope['contact1'] == '5'?  'selected':''}>5</option>
  <option value="6" ${requestScope['contact1'] == '6'?  'selected':''}>6</option>
</select>               
 <br><br> 
 NOTEPAD:&nbsp&nbsp&nbsp
               <select name="NOTEPAD" class="x">
                    
                   <option value="0" ${requestScope['email1'] == '0'?  'selected':''}>None</option>
  <option value="1" ${requestScope['email1'] == '1'?  'selected':''}>1</option>
  <option value="2" ${requestScope['email1'] == '2'?  'selected':''}>2</option>
  <option value="3" ${requestScope['email1'] == '3'?  'selected':''}>3</option>
 
</select>               
 <br>    <br> 
 STICK ON:&nbsp&nbsp&nbsp
               <select name="stick" class="x">
                    
                   <option value="0"  ${requestScope['ename1'] == '0'?  'selected':''}>None</option>
  <option value="1" ${requestScope['ename1'] == '1'?  'selected':''}>1 Packet</option>
  <option value="2" ${requestScope['ename1'] == '2'?  'selected':''}>2 Packet</option>
  <option value="3" ${requestScope['ename1'] == '3'?  'selected':''}>3 Packet</option>
 
</select>               
 <br>  <br> 
 BOARD PINS:&nbsp&nbsp&nbsp
               <select name="BOARD" class="x">
                  <option value="0"  ${requestScope['eid1'] == '0'?  'selected':''}>None</option>
  <option value="1" ${requestScope['eid1'] == '1'?  'selected':''}>1 Packet</option>
  <option value="2" ${requestScope['eid1'] == '2'?  'selected':''}>2 Packet</option>
  <option value="3" ${requestScope['eid1'] == '3'?  'selected':''}>3 Packet</option>
   
</select>               
 <br> <br> 
  TAPE:&nbsp&nbsp&nbsp
               <select name="TAPE" class="x">
                   <option value="0"  ${requestScope['date11'] == '0'?  'selected':''}>None</option>
  <option value="1" ${requestScope['date11'] == '1'?  'selected':''}>1 Packet</option>
  <option value="2" ${requestScope['date11'] == '2'?  'selected':''}>2 Packet</option>
  <option value="3" ${requestScope['date11'] == '3'?  'selected':''}>3 Packet</option>
 
 
</select>               
 <br>  <br> 
 FILES:&nbsp&nbsp&nbsp
               <select name="FILE" class="x">
                    <option value="0"  ${requestScope['date12'] == '0'?  'selected':''}>None</option>
  <option value="1" ${requestScope['date12'] == '1'?  'selected':''}>1 Packet</option>
  <option value="2" ${requestScope['date12'] == '2'?  'selected':''}>2 Packet</option>
  <option value="3" ${requestScope['date12'] == '3'?  'selected':''}>3 Packet</option>
 
 
</select>               
 <br>  <br> 
 A4 SIZE PAPER:&nbsp&nbsp&nbsp
               <select name="PAPER" class="x">
                    <option value="0"  ${requestScope['date13'] == '0'?  'selected':''}>None</option>
  <option value="1" ${requestScope['date13'] == '1'?  'selected':''}>1 Packet</option>
  <option value="2" ${requestScope['date13'] == '2'?  'selected':''}>2 Packet</option>
  <option value="3" ${requestScope['date13'] == '3'?  'selected':''}>3 Packet</option>
 
 
</select>               
 <br>  <br> 
  OTHER ITEMS:&nbsp&nbsp&nbsp
  <textarea name="other" class="x">Item Name * Quantity</textarea>
  <BR>
<button class="button" style="vertical-align:middle"><span>FINALIZE YOUR ORDER
    </span></button>

   </fieldset>
</form> 
   </fieldset>
    </body>
</html>
