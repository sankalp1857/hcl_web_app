<html>
    <head>
         <style>
            h2 {
    color:#040100  
               }
.x
{
   outline: none;
    font-size: 20px;
    font-family:gabriola;
    padding: 4px 8px;
    background:	#F5DEB3;
     color:#040100;
    border-radius: 6px;
    border: none;
    box-shadow: 0 0 6px rgba(0,0,0,.2);
    transition:ease-out .1s; 
}
    body {
background-image: URL("3-1.jpg");
 background-repeat:repeat;
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
    font-family:gabriola;
    padding: 3px 6px;
    background:	#F5DEB3; 
    border-radius: 4px;
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
        <title>ENTRY FORM</title>
                                                            <!--meta portion.. whatever u have written here-->
    </head>
    <body>
       <form name="f1"action="./stationary_book_1"  method="get"  >
           <fieldset>
               <legend><h2>Stationary Item Order Form</h2></legend>
               Employee Id: &nbsp&nbsp&nbsp
  <input type="text"  name="EID" value=${name} required ><br>
               PEN:&nbsp&nbsp&nbsp
               <select name="PEN" class="x"> 
                    <option value="0">QUANTITY</option>
                    
  <option value="1">1 packet</option>
  <option value="2">2 packet</option>
  <option value="3">3 packet</option>
</select>
               <br> <br> 
 MARKER:&nbsp&nbsp&nbsp
               <select name="MARKER" class="x"> 
                    <option value="0">QUANTITY</option>
                  
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
  <option value="6">6</option>
</select>               
 <br><br> 
 NOTEPAD:&nbsp&nbsp&nbsp
               <select name="NOTEPAD" class="x">
                    <option value="0">QUANTITY</option>
                 
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
 
</select>               
 <br>    <br> 
 STICK ON:&nbsp&nbsp&nbsp
               <select name="stick" class="x">
                    <option value="0">QUANTITY</option>
                  
  <option value="1">1 Packet</option>
  <option value="2">2 Packet</option>
  <option value="3">3 Packet</option>
 
</select>               
 <br>  <br> 
 BOARD PINS:&nbsp&nbsp&nbsp
               <select name="BOARD" class="x">
                    <option value="0">QUANTITY</option>
                  
  <option value="1">1 Packet</option>
  <option value="2">2 Packet</option>
  <option value="3">3 Packet</option>
 
</select>               
 <br> <br> 
  TAPE:&nbsp&nbsp&nbsp
               <select name="TAPE" class="x">
                    <option value="0">QUANTITY</option>
                  
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
 
</select>               
 <br>  <br> 
 FILES:&nbsp&nbsp&nbsp
               <select name="FILE" class="x">
                    <option value="0">QUANTITY</option>
                  
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
 
</select>               
 <br>  <br> 
 A4 SIZE PAPER:&nbsp&nbsp&nbsp
               <select name="PAPER" class="x">
                   <option value="0">QUANTITY</option>
                  
  <option value="1">1 Packet</option>
  <option value="2">2 Packet</option>
  <option value="3">3 Packet</option>
 
</select>               
 <br>  <br> 
  OTHER ITEMS:&nbsp&nbsp&nbsp
  <textarea name="other" class="x">Item Name * Quantity</textarea>
  <BR>
<button class="button" style="vertical-align:middle"><span>FINALIZE YOUR ORDER
    </span></button>

   </fieldset>
</form> 
       
    </body>
</html>
