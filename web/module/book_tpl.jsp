<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/8/20
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator"%>
<html>
<head>
    <meta charset="CESU-8">
    <meta http-equiv="x-ua-compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale-1">
    <title><sitemesh:title/></title>
    <sitemesh:head></sitemesh:head>
</head>
<body>
<%--顶部区域--%>

<%--主体区域--%>
<div class="container-fluid" >
    <div class="row">
        <%@include file="book_left_nav.jsp"%>
    </div>
</div>
</body>
</html>
