<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="lxq" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="a/css/index1.css" type="text/css" rel="stylesheet">
	
</style>
<title>Insert title here</title>
</head>
<body>
	<table border="1px">
		<tr>
			<td>商品名称</td>
			<td>商品价格</td>
			<td>上架时间</td>
			<td>商品描述</td>
			<td>商品类别</td>
			<td>操作 <a href="add.jsp">添加</a></td>
		</tr>
		<lxq:forEach items="${products}" var="p">
			<tr>
				<td>${p.name }</td>
				<td>${p.price }</td>
				<td>${p.createtime }</td>
				<td>${p.detail }</td>
				<%-- <td>${p.category }</td> --%>
				<td>
					<lxq:forEach items="${p.category }" var="pc">
						${pc.name }&nbsp;
					</lxq:forEach>
				</td>
				<td><a href="deleteProduct.do?id=${p.id}">删除</a> 
				<a href="getUpdatePage.do?id=${p.id}">更新</a></td>
			</tr>
		</lxq:forEach>
	</table>
</body>
</html>