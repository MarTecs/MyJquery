<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<input type=button value="下载" id="btnDownload"/>

<script>
   document.getElementById("btnDownload").onclick = function()
   {
     var url = "goods.do?p=exportExcel";
     location = url;
   }
</script>