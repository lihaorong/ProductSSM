<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="lxq" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="a/css/index.css" type="text/css" rel="stylesheet">
<script type="application/javascript" src="a/My97DatePicker/WdatePicker.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form action="insertProducts.do" method="post">
		<table>
			<tr>
				<td>商品名称:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>商品价格:</td>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td>上架时间:</td>
				<td><input type="text" name="createtime" onclick="WdatePicker()"></td>
			</tr>
			<tr>
				<td>商品描述:</td>
				<td><input type="text" name="detail"></td>
			</tr>
			<tr>
				<td>商品类别:</td>
				<td>					
					 <input type="checkbox" name="cid" value="1">手机
					 <input type="checkbox" name="cid" value="2">电子产品
					<input type="checkbox" name="cid" value="3">电脑
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="添加"></td>
			</tr>
		</table>
	</form>
</body>
</html>