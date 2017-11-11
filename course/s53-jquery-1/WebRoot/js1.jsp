<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/calc.js"></script>

第一个数:
<input type=text id="num1"/>  <br/>
第二个数:
<input type=text id="num2"/>  <br/>
结果:
<Input type=text id="num3"/>  <br/>
<button type=button id="btnJia" onclick="jia1()">求和</button>
<input type=button  id="btnJiaJQuery"  onclick="jia2()" value="求和"/>
<input type=button  id="btnJiaJQuery2"   value="求和"/>


<script>

    function jia1()
    {
       var n1 = document.getElementById("num1").value;
       var n2 = document.getElementById("num2").value;
       var n3 = 1*n1+1*n2;
       document.getElementById("num3").value = n3;
    }
    
    
     function jia2()
    {
       //var n1 = document.getElementById("num1").value;
       var n1 = $("#num1").val();
       
       //var n2 = document.getElementById("num2").value;
       var n2  = $("#num2").val();
         
       var n3 = 1*n1+1*n2;
       //document.getElementById("num3").value = n3;
       $("#num3").val(n3);
    }
  
  
</script>













