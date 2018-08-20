package com.web;

import com.dao.MyBookDAO;
import com.entity.Book;
import com.interfaces.InMeoryBookDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(value = "/update")
public class BookUpdate extends HttpServlet {

    InMeoryBookDAO bookDAO = new MyBookDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Book book = bookDAO.getBookQueryId(id);
       // req.setAttribute("bookQueryId",bookQueryId);
        req.getSession().setAttribute("book",book);
        req.getRequestDispatcher("jsp/book_update_page.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        System.out.println(id);
        String name = req.getParameter("name");
        float price = Float.parseFloat(req.getParameter("price"));
        String author = req.getParameter("author");
        String prss = req.getParameter("prss");

        Book book = new Book(id,name,price,author,prss);
        bookDAO.getBookUpdate(book);
        resp.sendRedirect("BookList");


    }
}
