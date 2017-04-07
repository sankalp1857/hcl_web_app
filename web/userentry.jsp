<html>
    <head>
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
        <title>ENTRY FORM</title>
                                                            <!--meta portion.. whatever u have written here-->
    </head>
    <body>
       <form name="f1" action="./user_entry"  method="get"  >
           <fieldset>
               <legend><h2>ENTRY FORM</h2></legend>
   Name of the employee: &nbsp&nbsp&nbsp
  <input type="text"  name="name" required ><br>
  Employee id:<br>
   <input type="text"  name="n0" ><br>
   Password:<br>
   <input type="password"  name="n1"  ><br>
    <button class="button" style="vertical-align:middle"><span>ADD A USER</span></button>

   </fieldset>
</form> 
       
    </body>
</html>
