package com.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.GoodsDAO;
import com.dao.HqlDAO;
import com.listen.TomcatListen;
import com.pojo.Goods;


@Service
public class GoodsService {
	
	@Autowired
	private GoodsDAO goodsDAO;
	
	@Autowired
	private HqlDAO hqlDAO;
	
	public void addGoods(Goods  goods)
	{
		goodsDAO.save(goods);
	}
	
	
	public void clearTmpDirectory()
	{
		File file = new File(TomcatListen.TMP_DIR);
		File[] files = file.listFiles();
		if (files!=null)
		for (File f : files) {
			f.delete();
		}
	}

}









