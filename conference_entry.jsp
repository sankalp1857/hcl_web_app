<html>
    <head>
        <style>
            h2 {
    color:#191999
               }

    body {
background-image: URL("B.jpg");
 background-repeat:no-repeat;
        background-color: lightblue;
         color:#191999; 
	font-family:gabriola;
	font-size:25px;
 	font-weight:bold;  
            }
input 
{
    outline: none;
    font-size: 20px;
    font-family: "san francisco";
    padding: 4px 8px;
    background: rgba(255,255,255,.4); 
    border-radius: 6px;
    border: none;
    box-shadow: 0 0 6px rgba(0,0,0,.2);
    transition:ease-out .1s;
}
.z
{
   color:#FF8C00; 
}
.x
{
   outline: none;
    font-size: 20px;
    font-family: "san francisco";
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
  background-color:#191999;
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
        <title>ENTRY FORM</title>
                                                            <!--meta portion.. whatever u have written here-->
    </head>
    <body>
       <form name="f1"action="./conference_entry"  method="get"  >
           <fieldset>
               <legend><h2>CONFERENCE ROOM BOOKING FORM</h2></legend>
      Employee Id: &nbsp&nbsp&nbsp
  <input type="text"  name="EID" required ><br>          
   Employee Name: &nbsp&nbsp&nbsp
  <input type="text"  name="ENAME" required ><br>
  Contact No:<br>
   <input type="text"  name="CONTACT"  Min=1000000000 max=9999999999><br>
  E-Mail:<br>
   <input type="email"  name="email" required><br>
    Purpose-of-the-conference:&nbsp&nbsp&nbsp
   <input type="text" name="PURPOSE" required><br>
   Date-of-the-conference:&nbsp&nbsp&nbsp
   <input type="date" name="date" required>
   <BLINK><a class="z"href="./check" target="_blank"><span>Check Availability</span></a></BLINK><br>
  Commencement-Time:&nbsp&nbsp&nbsp
   <input type="time" name="ENTRY" required>
   <br>
   Duration:&nbsp&nbsp&nbsp
   <select name="DURATION" class="x">
  <option value="1">1 hour</option>
  <option value="2">2 hours</option>
  <option value="3">3 hours</option>
  <option value="4">4 hours</option>
  <option value="5">5 hours</option>
  <option value="6">6 hours</option>
  
</select>
   <br>
  Conference-Room Location:&nbsp&nbsp&nbsp
  <select name="LOCATION" class="x">
  <option value="SOFTWARE TOWER-1">SOFTWARE TOWER-1</option>
  <option value="SOFTWARE TOWER-2">SOFTWARE TOWER-2</option>
  <option value="SOFTWARE TOWER-3">SOFTWARE TOWER-3</option>
  <option value="SOFTWARE TOWER-4">SOFTWARE TOWER-4</option>
</select>
  <br>
  No of Attendees:<br>
   <input type="text"  name="NUMBER"><br>
<button class="button" style="vertical-align:middle"><span>SUBMITT</span></button>

   </fieldset>
</form> 
       
    </body>
</html>
