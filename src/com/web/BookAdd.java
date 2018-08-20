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

@WebServlet(value = "/add")
public class BookAdd extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("jsp/book_add_page.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        float price = Float.parseFloat(req.getParameter("price"));
        String author = req.getParameter("author");
        String prss = req.getParameter("prss");

        Book book = new Book(id,name,price,author,prss);
        InMeoryBookDAO bookDAO = new MyBookDAO();
        bookDAO.getBookAdd(book);

//        req.getRequestDispatcher("jsp/book_index_page.jsp").forward(req,resp);
        resp.sendRedirect("BookList");
    }
}
