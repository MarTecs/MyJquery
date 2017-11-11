<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<script src="js/jquery-3.2.1.min.js"></script>

<input type="text"/>
<input type="text" />
<input type="text" />

<input type="button" value="clickMe" onclick="go()"/>


<script>
   function go()
   {
    
      
      $(":text:first").val(123);
      $(":text").eq(1).val(456);
      $(":text:last").val(789);
      
       var size =  $(":text").length; //高版本不支持size()方法
      
       $(":text").eq(size-1).val("777");
      
   }
  
  
  
</script>