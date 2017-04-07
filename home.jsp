<html>
    <head>
        <style>
            h2 {
    color: black;
               }

    body {
background-image: URL("Untitled-1.jpg");
 background-repeat: no-repeat;
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
        <title>ADMIN CONSOLE</title>
                                                            <!--meta portion.. whatever u have written here-->
    </head>
    <body>
       <form name="f2"     >
           <fieldset>
               <legend><h2>ADMIN CONSOLE</h2></legend>
   
               <a href="admin_validation.jsp" <button class="button" style="vertical-align:middle">><span>I AM AN ADMIN</span></button></a>
    <br><a href="user.jsp" <button class="button" style="vertical-align:middle">><span>I AM A REGISTERED USER</span></button></a>
    

   </fieldset>
</form> 
       
    </body>
</html>
