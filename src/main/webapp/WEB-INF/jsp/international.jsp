<%--
  Created by IntelliJ IDEA.
  User: 8201
  Date: 2020/4/8
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>
选择语言：
<%--<a href="http://localhost:8080/spring_i18n/international?language=zh_CN">中文</a>--%>
<%--<a href="http://localhost:8080/spring_i18n/international?language=en_US">English</a>--%>

<a href="http://localhost:8080/spring_i18n/request/international?paramName=zh_CN">中文</a>
<a href="http://localhost:8080/spring_i18n/request/international?paramName=en_US">English</a>
<br>
<spring:message code="name"/>
</body>
</html>
