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
 * @function ����㣬���ڴ洢dao������
 * @author ������
 * @time 2018-09-07
 *
 */
@Service
public class ProductService {
	
	@Autowired
	private ProductMapper mapper;
	//��ѯȫ����Ϣ
	public List<Products> getProducts(){
		return mapper.queryProducts();
	}
	//������Ϣ
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
	//ɾ����Ϣ
	public void deleteProduct(int id) {
		mapper.deleteProductWidthcategory(id);
		mapper.deleteProduct(id);
	}
	//���²���1.�ص�����
	public Products queryProduct(int id) {
		return mapper.queryProduct(id);
	}
	//Ϊ���²�ѯCategory������Ϣ
	public List<Category> queryCategory(){
		return mapper.queryAllCategory();
	}
	
	//���²���2.���¸�������
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
