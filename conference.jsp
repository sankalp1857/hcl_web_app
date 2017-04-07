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
        <title>ADMIN CONSOLE</title>
                                                            <!--meta portion.. whatever u have written here-->
    </head>
    <body>
       
           <fieldset>
               <legend><b><h2>CONFERENCE ROOM MENU</h2></b></legend>
   
                     <a href="conference_entry.jsp" <button class="button" style="vertical-align:middle">><span>BOOK</span></button></a><BR>
               <a href="./conference_display " <button class="button" style="vertical-align:middle">><span>VIEW</span></button></a><BR>
               
              
                
    </body><div> <a href="modify_conference.jsp"<button class="button" "style="vertical-align:middle">><span>MODIFY</span></button></a><bR></div>
 <a href="delete_conference.jsp" <button class="button" style="vertical-align:middle">><span>CANCEL</span></button></a><BR>
          <div style="text-align:left">
<a href="intro.jsp" <button class="button" style="vertical-align:middle">><span>HOME</span></button></a><BR>
 </div> </fieldset></html>
