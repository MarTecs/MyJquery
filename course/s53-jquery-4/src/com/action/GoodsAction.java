package com.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Goods;
import com.service.GoodsService;
import com.util.FileCopy;


@Controller
@RequestMapping("/goods.do")
public class GoodsAction {
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping(params="p=addGoods")
	@ResponseBody
	public String addGoods()
	{
		
		String goodsName = request.getParameter("goodsName");
		String file      = request.getParameter("file");
		//System.out.println(goodsName);
		//System.out.println(file);
		FileCopy.copy(request, "/tmp", "/images", file);
		
		Goods goods = new Goods();
		goods.setName(goodsName);
		goods.setImage("/images/"+file);
		goodsService.addGoods(goods);
		
		return "添加成功";
		
	}

}





