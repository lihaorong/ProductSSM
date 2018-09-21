package com.lxq.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxq.dao.ProductMapper;
import com.lxq.domain.Category;
import com.lxq.domain.Products;

/**
 * @function 服务层，用于存储dao层数据
 * @author 李晓晴
 * @time 2018-09-07
 *
 */
@Service
public class ProductService {
	
	@Autowired
	private ProductMapper mapper;
	//查询全部信息
	public List<Products> getProducts(){
		return mapper.queryProducts();
	}
	//增加信息
	public void insertProducts(Products product,int[] cids) {
		 mapper.insertProducts(product);
		 System.out.println(product.getId());
		 for(int id:cids) {
			 Map map=new HashMap<>();
			 map.put("pid", product.getId());
			 map.put("cid", id);
			 mapper.insertProductWithCategory(map);
		 }
		
	}
	//删除信息
	public void deleteProduct(int id) {
		mapper.deleteProductWidthcategory(id);
		mapper.deleteProduct(id);
	}
	//更新操作1.回调数据
	public Products queryProduct(int id) {
		return mapper.queryProduct(id);
	}
	//为更新查询Category所有信息
	public List<Category> queryCategory(){
		return mapper.queryAllCategory();
	}
	
	//更新操作2.更新给改数据
	public void updateProduct(Products product,int[] ids) {
		mapper.updateProduct(product);
		mapper.deleteProductWidthcategory(product.getId());
		for(int id:ids) {
			 Map map=new HashMap<>();
			 map.put("pid", product.getId());
			 map.put("cid", id);
			 mapper.insertProductWithCategory(map);
		 }
	}
}
