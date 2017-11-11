$(function(){

	
	$("#btnJiaJQuery2").click(function(){
	
		  var n1 = $("#num1").val();
       
         //var n2 = document.getElementById("num2").value;
         var n2  = $("#num2").val();
         
         var n3 = 1*n1+1*n2;
         //document.getElementById("num3").value = n3;
         $("#num3").val(n3);
	});
	
});