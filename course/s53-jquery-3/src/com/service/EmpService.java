package com.service;

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.HqlDAO;
import com.util.JsonFilter;


@Service
public class EmpService {
	
	@Autowired
	private HqlDAO hqlDAO;
	
	/**
	 * 得部门的所有员工
	 * @param depid
	 * @return  list
	 */
	public List getAllEmpByDep(int depid)
	{
		String hql = "from Yuangong  e where e.bumen.BId=?";
		List list = hqlDAO.query(hql,depid);
		return list;
	}
	
	
	/**
	 * 得部门所有员工转为json
	 * @param depid
	 * @return
	 */
	public String getAllEmpByDepJsonString(int depid)
	{
		List list = getAllEmpByDep(depid);
		JsonConfig jsonConfig = new JsonConfig();
		JsonFilter.ignoredSet(jsonConfig);
		String str = JSONArray.fromObject(list,jsonConfig).toString();
		return str;
	}
	
	/**
	 * 得所有部门
	 * @return list
	 */
	public List getAllDep()
	{
		String hql = "from Bumen";
		List list = hqlDAO.query(hql);
		return list;
	}
	
	/**
	 * 得所有部门并转json字符串
	 * @return
	 */
	public String getAllDepJsonString()
	{
		List list = getAllDep();
		JsonConfig jsonConfig = new JsonConfig();
		JsonFilter.ignoredSet(jsonConfig);
		String json = JSONArray.fromObject(list,jsonConfig).toString();
		return json;
	}
	
	

}









