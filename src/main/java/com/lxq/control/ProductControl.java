package com.lxq.control;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lxq.domain.Category;
import com.lxq.domain.Products;
import com.lxq.service.ProductService;

/**
 * @function ���Ʋ㣬�õ����������ݣ��洢�ң�ʵ�ֽ�����ת
 * @author ������
 * @time 2018-09-07
 *
 */
@Controller
public class ProductControl {
	
	@Autowired
	private ProductService service;
	
	//��ѯ������Ϣ
	@RequestMapping("/queryProducts.do")
	public ModelAndView getProductView() {
		ModelAndView mv = new ModelAndView();
		
		List<Products> products = service.getProducts();
		mv.addObject("products",products);
		mv.setViewName("/HomePage");
		
		return mv;
	}
	
	
	//�������
	@RequestMapping("/insertProducts.do")
	public ModelAndView insertProducts(Products product,int[] cid) {
		ModelAndView mv = new ModelAndView();
		try {
			service.insertProducts(product, cid);
			mv.setViewName("redirect:queryProducts.do");
			return mv;
		} catch (Exception e) {
			mv.setViewName("/fail");
			e.printStackTrace();
			return mv;
		}	
	}
	
	//ɾ�����
	@RequestMapping("/deleteProduct.do")
	public ModelAndView deleteProduct(int id) {
		ModelAndView mv = new ModelAndView();		
		try {
			service.deleteProduct(id);
			mv.setViewName("redirect:queryProducts.do");
			return mv;
		} catch (Exception e) {
			mv.setViewName("/fail");
			e.printStackTrace();
			return mv;
		}	
	}
	
	//���²���1.�ص�����
	@RequestMapping("/getUpdatePage.do")
	public ModelAndView getUpdatePage(int id) {
		ModelAndView mv = new ModelAndView();
		
		Products product = service.queryProduct(id);
		List<Category> categories = service.queryCategory();
		mv.addObject("product",product);
		mv.addObject("categories",categories);
		mv.setViewName("/showUpdate");
		
		return mv;
	}
	
	//���²���2.���¸�������
	@RequestMapping("/updateProduct.do")
	public ModelAndView updateProduct(Products product,int[] ids) {
		ModelAndView mv = new ModelAndView();
		try {
			service.updateProduct(product,ids);
			mv.setViewName("redirect:queryProducts.do");
			return mv;
		} catch (Exception e) {
			mv.setViewName("/fail");
			e.getStackTrace();
			return mv;
		}
		
		
		
	}
}
