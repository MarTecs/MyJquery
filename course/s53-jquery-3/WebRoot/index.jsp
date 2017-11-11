<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<script src="js/jquery-3.2.1.js"></script>
<div id="mydiv">

</div>


部门:<select id="dep"></select>
员工:<select id="emp"></select>


<script>
  function showTime()
  {
     /*
     $.ajax(
        {
          url:"time.do?x="+Math.random(),
          success:function(result)
          {
             $("#mydiv").html(result);
          } 
        }
     )
     */
     
     /*
     $.post("time.do",function(d){
          $("#mydiv").html(d);
     });
     */
     
     $("#mydiv").load("time.do?"+Math.random());
     
  }
  window.setInterval("showTime()", 1000);
  
  
  $(function(){
      
      var dep = $("#dep");
      $.getJSON("emp.do?p=getAllDep",function(json){
      
           for (var i=0;i<json.length;i++)
           {
            // <option value=""></option>
              var op = new Option(json[i].BName,json[i].BId);
              dep.append(op); 
           }
           getEmp();//首次去查下 员工
      });
      
      //绑定改变事件
      dep.change(function(){
         getEmp();
      });
    
  });
  
  
  function getEmp()
  {
      //找员工并清空记录
      var emp = $("#emp");
      emp.prop("length",0);
      //emp.children("option").remove();
      //得到选中的部门id
      var depid = $("#dep").val();
      
      //查员工
      $.getJSON("emp.do?p=getEmpByDep",{id:depid},function(json){
          for (var i=0;i<json.length;i++)
          {
              var option = new Option(json[i].YName,json[i].YId);
              emp.append(option);
          }
      });
  }
  
</script>









