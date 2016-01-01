<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'book_list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function goPage(){
			var a=document.getElementById("goPage").value;
			var num=parseInt(a);
			if(num<1||num>${pageInfo.pageCount}||isNaN(num))
				return;
			document.getElementById("btn-jump").setAttribute("href", "${pageInfo.action}?pageInfo.currentPage="+num);
		}
	</script>

  </head>
  
  <body>
    <table border=1 width="400">
    	<tr>
    		<td>序號</td>
    		<td>書名</td>
    		<td>作者</td>
    		<td>操作</td>
    	</tr>
    		<c:forEach items="${pageInfo.list }" var="b" varStatus="state">
    			<tr>
    			<td>${state.count}</td>
    			<td>${b.bookname }</td>
    			<td>${b.author }</td>
    			<td>操作</td>
    			</tr>
    		</c:forEach>
    		
    		<tr>
	    		<td colspan="4">共${pageInfo.recordCount }条记录，共${pageInfo.pageCount }页，当前是第${pageInfo.currentPage }页
	    		&nbsp
	    		<a href="${pageInfo.action}?currentPage=1">首页</a>
	    		<c:if test="${pageInfo.currentPage!=1}">
    				<a href="${pageInfo.action}?pageInfo.currentPage=${pageInfo.currentPage-1}">上一页</a>
    			</c:if>
    			<c:if test="${pageInfo.currentPage!=pageInfo.pageCount}">
    				<a href="${pageInfo.action}?pageInfo.currentPage=${pageInfo.currentPage+1}">下一页</a>
    			</c:if>
	    		<a href="${pageInfo.action}?pageInfo.currentPage=${pageInfo.pageCount}">末页</a>
	    		&nbsp<input size="2" id="goPage"> <a href="${pageInfo.action}?pageInfo.currentPage=${pageInfo.currentPage }" onclick="goPage();" id="btn-jump">go </a>
	    		</td>
    		</tr>
    	
    </table>
    
    <a href="book_insert.jsp">插入圖書</a>
  </body>
</html>
