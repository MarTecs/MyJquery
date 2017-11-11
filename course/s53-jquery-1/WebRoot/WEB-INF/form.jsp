<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<script src="js/jquery-3.2.1.min.js"></script>

<input type="text"/>
<input type="text" />
<input type="checkbox" />
<input type="button" value="clickMe" onclick="go()"/>


<script>
   function go()
   {
    
      //$("input[type=\"text\"]").val(123);
      $(":text").val(456);
      $(":checkbox").prop("checked",true);
   }
  
  
  
</script>