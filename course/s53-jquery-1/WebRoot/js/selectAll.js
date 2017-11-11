$(document).ready(function(){

	$("#selectAll").click(function(){
	     
		   var ch = $("#selectAll").prop("checked");
		   $(".chk").prop("checked",this.checked); //ch
		
	});
});