<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<script src="js/jquery-3.2.1.min.js"></script>

<table border="1" align="center" width="80%">
  <thead>
  <tr>
    <th>Column 1 Heading</th>
    <th>Column 2 Heading</th>
  </tr>
  </thead>
  
  <tbody>
	  <tr>
	    <td>Row 1: Col 1</td>
	    <td>Row 1: Col 2</td>
	  </tr>
	  
	   <tr>
	    <td>Row 1: Col 1</td>
	    <td>Row 1: Col 2</td>
	  </tr>
	  
	  
	   <tr>
	    <td>Row 1: Col 1</td>
	    <td>Row 1: Col 2</td>
	  </tr>
	  
	  
	   <tr>
	    <td>Row 1: Col 1</td>
	    <td>Row 1: Col 2</td>
	  </tr>
	  
	  
	   <tr>
	    <td>Row 1: Col 1</td>
	    <td>Row 1: Col 2</td>
	  </tr>
	  
	  
	   <tr>
	    <td>Row 1: Col 1</td>
	    <td>Row 1: Col 2</td>
	  </tr>
	  
	  
	   <tr>
	    <td>Row 1: Col 1</td>
	    <td>Row 1: Col 2</td>
	  </tr>
  </tbody>
</table>

<script>
   
   $(function(){
      
       // >找儿子
       // :odd奇数
       // css样式
       $("table>tbody>tr:odd").css("color","red");
   
       $("table>tbody>tr:even").css("color","yellow");
   });
   
   
  
  
  
</script>








