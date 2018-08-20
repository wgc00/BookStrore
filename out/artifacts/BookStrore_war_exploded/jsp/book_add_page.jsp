<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/8/18
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        #div1 {
            width: 780px;
            margin: auto;
        }

        #divText {
            margin-top: 3em;
        }
        #submitDiv{
            text-align: center;
        }
    </style>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script>
        window.onload = function() {

            var returnBtn = document.getElementById("returnBtn");
            returnBtn.onclick = function() {
                window.history.back();
            }
        }

    </script>
</head>
<body>
<%--<table>
    <caption>添加图书</caption>
    <tr>
        <td>编号：<input type="text" name="id"></td>
    </tr>
        <td>书名：<input type="text" name="name"></td>
    <tr>
        <td>价格：<input type="number" slot="0.01" name="price"></td>
    </tr>
    <tr>
        <td>作者：<input type="text" name="author"></td>
    </tr>
    <tr>
        <td>出版社：<input type="text" name="prss"></td>
    </tr>
    <tr>
        <td><input type="submit" value="添加"></td>
    </tr>
</table>--%>
<div id="divText">
    <form action="BookAdd" method="post">
        <h3 align="center">添加图书</h3>
        <br/>
        <hr style="width: 800px"/>
        <div id="div1">
            <div class="input-group">
                <div class="input-group-prepend">
                    <span class="input-group-text">编号&nbsp;&nbsp;&nbsp;</span>
                </div>
                <input type="text" aria-label="First name" class="form-control" name="id" value="${book.id}">
            </div>
            <br/>
            <div class="input-group">
                <div class="input-group-prepend">
                    <span class="input-group-text">书名&nbsp;&nbsp;&nbsp;</span>
                </div>
                <input type="text" aria-label="First name" class="form-control" name="name" value="${book.name}">
            </div>
            <br/>
            <div class="input-group">
                <div class="input-group-prepend">
                    <span class="input-group-text">价格&nbsp;&nbsp;&nbsp;</span>
                </div>
                <input type="text" aria-label="First name" class="form-control" name="price" value="${book.price}">
            </div>
            <br/>
            <div class="input-group">
                <div class="input-group-prepend">
                    <span class="input-group-text">作者&nbsp;&nbsp;&nbsp;</span>
                </div>

                <input type="text" aria-label="First name" class="form-control" name="author"
                       value="${book.author}">
            </div>
            <br/>
            <div class="input-group">
                <div class="input-group-prepend">
                    <span class="input-group-text">出版社</span>
                </div>
                <input type="text" aria-label="First name" class="form-control" name="prss" value="${book.prss}">
            </div>
        </div>
        <br/>
        <br/>
        <div id="submitDiv">
            <input type="submit" value="添加"> <input id="returnBtn" type="button" value="返回">
        </div>
    </form>
</div>
</body>
</html>
