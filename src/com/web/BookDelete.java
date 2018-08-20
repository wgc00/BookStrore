package com.web;

import com.dao.MyBookDAO;
import com.interfaces.InMeoryBookDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/delete")
public class BookDelete extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        InMeoryBookDAO bookDAO = new MyBookDAO();
        int id = Integer.parseInt(req.getParameter("id"));
         //  System.out.println(id);
        boolean bookDelete = bookDAO.getBookDelete(id);
        resp.sendRedirect("BookList");
       // req.getRequestDispatcher("jsp/book_index_page.jsp").forward(req,resp);
    }
}
