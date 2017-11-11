package com.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.EmpService;


@Controller
@RequestMapping("/emp.do")
public class EmpAction {
	
	@Autowired
	private EmpService empService;
	
	
	@RequestMapping(params="p=getAllDep")
	@ResponseBody
	public String getAllDep()
	{
		String json = empService.getAllDepJsonString();
		return json;
	}
	
	
	@RequestMapping(params="p=getEmpByDep")
	@ResponseBody
	public String getEmpByDep(@RequestParam(required=false,defaultValue="-1") int id)
	{
	    String json = empService.getAllEmpByDepJsonString(id);
	    return json;
	}

}









