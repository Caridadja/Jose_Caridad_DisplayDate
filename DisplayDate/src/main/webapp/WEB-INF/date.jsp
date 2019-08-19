<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/app.js"></script>
<meta charset="UTF-8">
<title>Date</title>
</head>
<body onload="dateMessage()">
<h1 class="date"><c:out value="${date}"/></h1>
</body>
</html>