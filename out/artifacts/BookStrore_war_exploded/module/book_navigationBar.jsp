<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/8/20
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8"  %>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">图书店</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">#</a></li>
                <li><a href="#">#</a></li>
                <li><a href="#">English</a></li>
                <li><a href="#">注册</a></li>
            </ul>
            <form  action="BookSearch" class="navbar-form navbar-right"  method="get">
                <input name="queryName" class="form-control mr-sm-2" type="search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">搜索</button>
            </form>
        </div>
    </div>
</nav>

<%@include file="book_left_nav.jsp"%>
