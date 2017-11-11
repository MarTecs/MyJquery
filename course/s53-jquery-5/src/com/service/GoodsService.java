package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.HqlDAO;


@Service
public class GoodsService {
	
	@Autowired
	private HqlDAO hqlDAO;
	
	
	public List getAllGoods()
	{
	    String hql  = "from Goods";
	    List list = hqlDAO.query(hql);
	    return list;
		
	}

}









