package com.web;

import com.dao.MyBookDAO;
import com.entity.Book;
import com.interfaces.InMeoryBookDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class BookSearch extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String queryName = req.getParameter("queryName");
        InMeoryBookDAO bookDAO = new MyBookDAO();

        List<Book> books = bookDAO.getBookQueryName(queryName);
        req.getSession().setAttribute("books",books);
       // req.setAttribute("book",book);
        req.getRequestDispatcher("jsp/book_index_page.jsp").forward(req,resp);

    }
}
