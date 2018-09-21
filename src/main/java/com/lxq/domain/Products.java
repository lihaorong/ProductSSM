package com.lxq.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @function javaBean类：与数据库中的product_ssm字段对应
 * @author 李晓晴
 * @time 2018-09-07
 *
 */
public class Products {
	private int id;
	private String name;
	private String price;
	private String createtime;
	private String detail;
	
	private List<Category> category;

	public Products() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + ", createtime=" + createtime + ", detail="
				+ detail + ", category=" + category + "]";
	}
	

}
