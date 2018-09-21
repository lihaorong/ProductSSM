package com.lxq.dao;

import java.util.List;
import java.util.Map;

import com.lxq.domain.Category;
import com.lxq.domain.Products;

/**
 * @function dao层接口，放入查询方法
 * @author 李晓晴
 * @time 2018-09-07
 */
public interface ProductMapper {
	//查询全部信息
	/*@Select("select * from product")*/
	public List<Products> queryProducts();
	
	//插入信息
	public int insertProducts(Products product);
	//------在中间表插入数据
	public int insertProductWithCategory(Map map);
	
	
	//删除
	public int deleteProduct(int id);
	//-------删除中间表
	public int deleteProductWidthcategory(int id);
	
	//更新操作一：回调数据
	public Products queryProduct(int id);
	public List<Category> queryAllCategory();
	//public Category queryCategory02(int id);
	//更新操作二：更新更改数据
	public int updateProduct(Products product);
}
