<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />   

<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Welcome BookMall</title>
<link rel="stylesheet" href="${contextPath}/resources/css/main.css">
</head>
<body>

<div class="wrapper">
	<div class="wrap">
		<div class="top_gnb_area">
			<h1>gnb area</h1>
		</div>
		<div class="top_area">
			<div class="logo_area">			
				<img src="${contextPath}/resources/images/logo.png" width="250" height="250" alt="logo">
			</div>
			<div class="search_area">
				<h1>Search area</h1>
				<!--  
				<form action="search.php" method="post">
					<input type="text" title="검색">
					<input type="submit" value="검색">
				</form> -->
			</div>
			<div class="login_area">
				<div class="login_button"><a href="${contextPath}/member/login.do">로그인</a></div>
				<span><a href="${contextPath}/member/join.do">회원가입</a></span>
			</div>
			<div class="clearfix"></div>			
		</div>
		<div class="navi_bar_area">
			<h1>navi area</h1>
		</div>
		<div class="content_area">
			<h1>content area</h1>
		</div>
	</div>
</div>

</body>
</html>