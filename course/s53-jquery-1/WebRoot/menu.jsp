<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<script src="js/jquery-3.2.1.min.js"></script>

<style>
   div
   {
     margin-left: 15px;
     display: none;
   }
</style>

<a class="menuOne" href="javascript:void(0)">菜单一</a> <br/>
<div>
	<a href="">子菜单一</a><br/>
	<a href="">子菜单一</a><br/>
	<a href="">子菜单一</a><br/>
	<a href="">子菜单一</a><br/>
	<a href="">子菜单一</a><br/>
	<a href="">子菜单一</a><br/>

</div>


<a class="menuOne" href="javascript:void(0)">菜单二</a> <br/>
<div>
	<a href="">子菜单2</a><br/>
	<a href="">子菜单2</a><br/>
	<a href="">子菜单2</a><br/>
	<a href="">子菜单2</a><br/>
	<a href="">子菜单2</a><br/>
	<a href="">子菜单2</a><br/>

</div>




<a class="menuOne" href="javascript:void(0)">菜单三</a> <br/>
<div>
	<a href="">子菜单3</a> <br/>
	<a href="">子菜单3</a><br/>
	<a href="">子菜单3</a><br/>
	<a href="">子菜单3</a><br/>
	<a href="">子菜单3</a><br/>
	<a href="">子菜单3</a><br/>

</div>



<script>
   $(".menuOne").click(function(){
   
       $(this).next().next().toggle(); // .show()显示. hide()隐藏, toggle()切换
   });
</script>








