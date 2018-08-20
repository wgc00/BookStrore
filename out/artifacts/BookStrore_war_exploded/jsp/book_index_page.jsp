<%@ page import="com.entity.Book" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/8/18
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<jsp:useBean id="book" class="com.entity.Book" />--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <style>
        div {
            border: 1px solid black;
        }
    </style>
    <%@include file="/module/book_resource_css.jsp" %>
    <%@include file="/module/book_resource_js.jsp" %>
</head>
<body>
<%--导航栏--%>
<%@include file="/module/book_navigationBar.jsp" %>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
        <h2 align="center">图书列表</h2>
        <hr/>
        <table class="table">
            <tr>
                <th>多选</th>
                <th>编号</th>
                <th>书名</th>
                <th>价格</th>
                <th>作者</th>
                <th>出版社</th>
                <th>操作</th>
            </tr>
            <%--
                    <% List<Book> book = (List<Book>) request.getAttribute("book");
                        //request.getSession().setAttribute("book",book);
                        for (Book book1 : book) {
                    %>
            --%>
            <c:forEach items="${books}" var="book">
                <tr>
                    <td><input type="checkbox" name="id" value="${book.id}"></td>
                    <td>${book.id}
                    </td>
                    <td>${book.name}
                    </td>
                    <td>${book.price}
                    </td>
                    <td>${book.author}
                    </td>
                    <td>${book.prss}
                    </td>
                    <td><a href="/delete?id=${book.id}">删除</a>
                        <a href="/update?id=${book.id}">更新</a></td>
                </tr>
                <%-- <% } %>--%>
            </c:forEach>
        </table>
        <!-- Content here -->
        <%--
        <div>
            <a href="/add">图书添加</a>
        </div>
        --%>

    </div>
</body>
</html>
