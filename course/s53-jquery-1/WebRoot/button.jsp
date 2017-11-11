<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<script src="js/jquery-3.2.1.min.js"></script>

<style>
   .colorRed
   {
     color:red;
   }
</style>

<div id="mydiv">

</div>

<script>
    /*
    for (var i=1;i<=33;i++)
    {
      var html = "<button type='button'>"+i+"</button>"
      $("#mydiv").append(html);
    }*/
    
    var html = "";
     for (var i=1;i<=33;i++)
    {
       html = html +"<button type='button'>"+i+"</button>"
      
    }
    $("#mydiv").html(html);
    
    
    $("#mydiv>button").click(function(){
    
        $(this).toggleClass("colorRed"); //addClass/removeClass/toggleClass
        
        /*
         var color = $(this).css("color");
         if (color!="rgb(255, 0, 0)")
         {
        
              $(this).css("color","red");
         }
         else
         {
             $(this).css("color","black");
         }
         */
       
       
        //this.style.color="red";
    });
    
</script>






