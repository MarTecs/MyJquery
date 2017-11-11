package com.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Goods;
import com.service.GoodsService;


@Controller
@RequestMapping("/goods.do")
public class GoodsAction {
	
	@Autowired
	private GoodsService goodsService;
	
	@Autowired
	private HttpServletRequest request;
	
	@ResponseBody
	@RequestMapping(params="p=exportExcel")
	public String exportExcel(HttpServletResponse response) throws IOException, WriteException
	{
		//在tmp生成excel文件
		String tmp = request.getSession().getServletContext().getRealPath("/tmp");
		List<Goods> list = goodsService.getAllGoods();
		String filename  = System.currentTimeMillis()+".xls";
		WritableWorkbook  workbook = Workbook.createWorkbook(new File(tmp,filename));
		WritableSheet     sheet = workbook.createSheet("商品列表", 0);
		
		Label lblId = new Label(0,0,"编号");
		Label lblName = new Label(1,0,"名称");
		sheet.addCell(lblId);
		sheet.addCell(lblName);
		
		for (int i=0;i<list.size();i++)
		{
			Goods goods  = list.get(i);
			Label lblIdValue = new Label(0,i+1,goods.getId()+"");
			Label lblNameValue = new Label(1,i+1,goods.getName());
			sheet.addCell(lblIdValue);
			sheet.addCell(lblNameValue);
			
		}
		
		
		workbook.write();
		workbook.close();
		
		//下载
		response.setContentType("application/excel");
		response.addHeader("content-disposition", "attachment;filename="+filename);//弹出下载框
		
		//循环读写
		InputStream is = new FileInputStream(new File(tmp,filename));
		OutputStream os = response.getOutputStream();
		byte[] b = new byte[10240];
		int size = is.read(b);
		while (size>0)
		{
			os.write(b,0,size);
			size = is.read(b);
		}
		os.close();
		is.close();
		
		
		return "导出成功";
		
		
	}

}











