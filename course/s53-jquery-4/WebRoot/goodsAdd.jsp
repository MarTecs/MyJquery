<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<link href="js/webuploader/0.1.5/webuploader.css" rel="stylesheet" type="text/css" />
<script src="js/jquery-3.2.1.js"></script>
<script src="js/webuploader/0.1.5/webuploader.min.js"></script>


<form action="goods.do?p=addGoods" method="post">

     商品名称:<input type=text name="goodsName"/> <br/>
     商品图片:   <div>
                <div id="fileList" class="uploader-list"></div>
			
				<div id="filePicker" >
							<i class="Hui-iconfont">&#xe642;</i> 选择图片
				</div>
			</div>  
			<br/><br/>
	<button type="submit">上传</button>		 

</form>

<script src="js/upload.js"></script>