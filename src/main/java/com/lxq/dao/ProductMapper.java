package com.lxq.dao;

import java.util.List;
import java.util.Map;

import com.lxq.domain.Category;
import com.lxq.domain.Products;

/**
 * @function dao��ӿڣ������ѯ����
 * @author ������
 * @time 2018-09-07
 */
public interface ProductMapper {
	//��ѯȫ����Ϣ
	/*@Select("select * from product")*/
	public List<Products> queryProducts();
	
	//������Ϣ
	public int insertProducts(Products product);
	//------���м���������
	public int insertProductWithCategory(Map map);
	
	
	//ɾ��
	public int deleteProduct(int id);
	//-------ɾ���м��
	public int deleteProductWidthcategory(int id);
	
	//���²���һ���ص�����
	public Products queryProduct(int id);
	public List<Category> queryAllCategory();
	//public Category queryCategory02(int id);
	//���²����������¸�������
	public int updateProduct(Products product);
}
