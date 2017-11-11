package com.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/time.do")
public class TimeAction {
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	@RequestMapping
	@ResponseBody
	public String getTime()
	{
		Date date = new Date();
		String str = sdf.format(date);
		date = null;
		return str;
	}

}






