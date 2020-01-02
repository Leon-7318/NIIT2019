package com.Leon.controller;

import java.io.IOException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.Leon.bean.NewBean;
import com.Leon.bean.ProductBean;
import com.Leon.bean.UtilBean;
import com.Leon.pojo.Product;
import com.Leon.service.Impl.ProductServiceImpl;

@Controller
@RequestMapping(value="product")
public class ProductController {
	
	@Resource(name="productServiceImpl")
	private ProductServiceImpl service;
	
	private UtilBean util;
	private ProductBean product;
	
	//显示指定类型的商品页面
	@RequestMapping(value="showProducts")
    public String showProducts(@RequestParam(value="type") String type
    		,HttpSession session){
    	product = (ProductBean) session.getAttribute("product");
    	product.showProducts(type);
    	
    	util = (UtilBean) session.getAttribute("util");
		if(util.getK()==1)
			return "redirect:/web_back/page/product/productList.jsp";
		else
			return "redirect:/web_front/product/products.jsp";
    }
    //显示当前产品的详情页
	@RequestMapping(value="showProduct")
    public String showProduct(@RequestParam(value="id") Integer id
    		,HttpSession session){
    	product = (ProductBean) session.getAttribute("product");
    	product.showProduct(service.findById(id));
        return "redirect:/web_front/product/product.jsp";
    }
	
	@RequestMapping(value="searchByKey")
    public String searchByKey(HttpSession session){
    	product = (ProductBean) session.getAttribute("product");
    	product.searchByKey();
		util = (UtilBean) session.getAttribute("util");
		if(util.getK()==1)
			return "redirect:/web_back/page/product/result.jsp";
		else
			return "redirect:/web_front/product/result.jsp";
    }

	@RequestMapping(value="add_product")
    public String add_product(HttpSession session){
    	product = (ProductBean) session.getAttribute("product");
    	product.add_product();
        return "redirect:/web_back/page/product/productEdit.jsp";
    }
    
	@RequestMapping(value="edit_product")
    public String edit_product(@RequestParam(value="id") Integer id
    		,HttpSession session){
    	product = (ProductBean) session.getAttribute("product");
    	product.edit_product(id);
        return "redirect:/web_back/page/product/productEdit.jsp";
    }
	
//翻页 跳转
	@RequestMapping(value="previous")
	public String previous(HttpSession session){
		product = (ProductBean) session.getAttribute("product");
		product.previous();
		
		System.out.println("---------product-------previous");
		
		util = (UtilBean) session.getAttribute("util");
		if(util.getK()==1)
			return "redirect:/web_back/page/product/productList.jsp";
		else
			return "redirect:/web_front/product/products.jsp";
    }
    
	@RequestMapping(value="next")
    public String next(HttpSession session){
		product = (ProductBean) session.getAttribute("product");
		product.next();

		System.out.println("---------product-------next");
		
		util = (UtilBean) session.getAttribute("util");
		if(util.getK()==1)
			return "redirect:/web_back/page/product/productList.jsp";
		else
			return "redirect:/web_front/product/products.jsp";
    }
    
	@RequestMapping(value="jumpTo")
    public String jumpTo(@RequestParam(value="id") Integer i,
    		HttpSession session){
		product = (ProductBean) session.getAttribute("product");
		product.jumpTo(i);
		
		System.out.println("---------product-------jumpTo"+" "+i);
		
		util = (UtilBean) session.getAttribute("util");
		if(util.getK()==1)
			return "redirect:/web_back/page/product/productList.jsp";
		else
			return "redirect:/web_front/product/products.jsp";
	}
		
	
	//后台页面
	@RequestMapping(value="productList")
	public String productList(HttpSession session){
    	product = (ProductBean) session.getAttribute("product");
		product.refreshPage();
        return "redirect:/web_back/page/product/productList.jsp";
    }
	
//	name author date type state file brand price cpu size ram weight rom battery sketch details
	@RequestMapping(value="submit")
    public String submit(
    		@RequestParam(value="name") String name,
    		@RequestParam(value="author") String author,
    		@RequestParam(value="date") String date,
    		@RequestParam(value="type") String type,
    		@RequestParam(value="state") String state,
    		@RequestParam(value="uploadFile") MultipartFile file,
    		@RequestParam(value="brand") String brand,
    		@RequestParam(value="price") String price,
    		@RequestParam(value="cpu") String cpu,
    		@RequestParam(value="size") String size,
    		@RequestParam(value="ram") String ram,
    		@RequestParam(value="weight") String weight,
    		@RequestParam(value="rom") String rom,
    		@RequestParam(value="battery") String battery,
    		@RequestParam(value="sketch") String sketch,
    		@RequestParam(value="details") String details,
    		HttpSession session){
    	product = (ProductBean) session.getAttribute("product");
		Product p = product.getTemp_product();
		p.setName(name);
		p.setAuthor(author);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	    ParsePosition pos = new ParsePosition(0);
	    Date sdate = formatter.parse(date, pos);
		p.setDate(sdate);
		p.setType(type);
		p.setState(Integer.parseInt(state));
		p.setBrand(brand);
		p.setPrice(Float.parseFloat(price));
		p.setCpu(cpu);
		p.setSize(size);
		p.setRam(ram);
		p.setWeight(weight);
		p.setRom(rom);
		p.setBattery(battery);
		p.setSketch(sketch.trim());
		p.setDetails(details);
		try {
			product.submit(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return "redirect:/web_back/page/product/productList.jsp";
    }
	

//更新	
	
	@RequestMapping(value="delete")
    public String delete(@RequestParam(value="id") Integer id,
    		HttpSession session){
    	product = (ProductBean) session.getAttribute("product");

		product.delete(service.findById(id));
		product.refreshPage();
        return "redirect:/web_back/page/product/productList.jsp";
    }
    
	@RequestMapping(value="update")
    public String update(@RequestParam(value="id") Integer id,
    		HttpSession session){
    	product = (ProductBean) session.getAttribute("product");

		product.update(service.findById(id));
		product.refreshPage();
        return "redirect:/web_back/page/product/productList.jsp";
    }
	
}
