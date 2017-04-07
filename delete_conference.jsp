
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form name="f1" action="./del_conference"  method="get"  >
           <fieldset>
               <legend><h2>CONFERENCE HALL CANCELLATION FORM</h2></legend>
   ID of the Employee : &nbsp&nbsp&nbsp
  <input type="text"  name="EID" required ><br>
  
    <button class="button" style="vertical-align:middle"><span>CANCEL</span></button>

   </fieldset>
</form> 
       
       
    </body>
</html>

