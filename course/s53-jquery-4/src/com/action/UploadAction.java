package com.action;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


@Controller
@RequestMapping("/upload.do")
public class UploadAction {
	
	
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping(params="p=hello")
	@ResponseBody
	public String hello()
	{
		return "hello,world!";
	}
	
	@RequestMapping
	@ResponseBody
	public String upload(@RequestParam MultipartFile  file) throws IllegalStateException, IOException
	{
		//System.out.println("hello,world");
		//得到旧的文件名  aaa.png
		String oldFileName = file.getOriginalFilename();
		
		//得到扩展名  .png
		int index = oldFileName.lastIndexOf('.');
		String extName = oldFileName.substring(index);
		
		//新的文件名
		String newFileName = System.currentTimeMillis()+extName;
		
		//得到上传的目录
		String uploadDirectory = request.getSession().getServletContext().getRealPath("/tmp");
		
		//复制到tmp目录
		File descFile = new File(uploadDirectory+"/"+newFileName);
		file.transferTo(descFile);
		
		return newFileName;
		
	}

}















