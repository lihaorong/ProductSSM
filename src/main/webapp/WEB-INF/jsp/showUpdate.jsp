<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="lxq" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="a/css/index2.css" type="text/css" rel="stylesheet">
<script type="application/javascript" src="a/My97DatePicker/WdatePicker.js">
	
</script>
<title>Insert title here</title>
</head>
<body>
	<form action="updateProduct.do" method="post">
	
		<table>
			<tr>
				<td>商品名称:</td>
				<td><input type="text" name="name" value="${product.name}"></td>
			</tr>
			<tr>
				<td>商品价格:</td>
				<td><input type="text" name="price" value="${product.price}"></td>
			</tr>
			<tr>
				<td>上架时间:</td>
				<td><input type="text" name="createtime" value="${product.createtime}" onclick="WdatePicker()"></td>
			</tr>
			<tr>
				<td>商品描述:</td>
				<td><input type="text" name="detail" value="${product.detail}"></td>
			</tr>
			<tr>
				<td>商品类型</td>
				<td>
					<lxq:forEach items="${categories }" var="c">
						<lxq:set var="checked" value=""></lxq:set>
						<lxq:forEach items="${product.category }" var="pc">
							<lxq:if test="${c.id==pc.id}">
								<lxq:set var="checked" value="checked"></lxq:set>
							</lxq:if>
						</lxq:forEach>
						<input type="checkbox" name="ids" value="${c.id}" ${checked}/>${c.name}
					</lxq:forEach>
				</td>			
			</tr>
			<tr>
				<td><input type="text" name="id" value="${product.id}" style="display: none"></td>
				<td><input type="submit" value="更新"></td>
			</tr>			
		</table>
	</form>
</body>
</html>