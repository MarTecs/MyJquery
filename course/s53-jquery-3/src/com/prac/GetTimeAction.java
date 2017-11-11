package com.prac;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/date.do")
public class GetTimeAction {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	
	@RequestMapping
	@ResponseBody		//加上这句话的意思就是，返回内容的时候将会返回给aJax，而不是返回另外一个页面
	public String getTime(){
		
		Date date = new Date();
		String date_str = sdf.format(date);
		return date_str;
	}
	
	

}
