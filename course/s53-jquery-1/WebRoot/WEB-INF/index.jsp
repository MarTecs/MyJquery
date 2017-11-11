<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<script src="js/jquery-3.2.1.min.js"></script>

<input type="text" />
<input type="button" value="clickMe" onclick="go()"/>


<script>
   function go()
   {
      
      $("input[type=\"text\"]").val(123);
   }
  
  
  
</script>