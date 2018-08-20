package com.test;

import com.dao.MyBookDAO;
import com.entity.Book;
import com.interfaces.InMeoryBookDAO;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        InMeoryBookDAO bookDAO = new MyBookDAO();

        /**添加*/
        //Book book1 = new Book(5,"黄帝内经",64.5f,"黄帝","东方出版社");
        //Book bookAdd = bookDAO.getBookAdd(book1);
        Book bookQueryId = bookDAO.getBookQueryId(3);
        /**数据Queryid*/
        System.out.println(bookQueryId.getName());
        System.out.println("===================================================");
        /**数据update*/
        Book book1 = new Book(3,"黄帝内经",64.5f,"黄帝","东方出版社");
        bookDAO.getBookUpdate(book1);
        System.out.println("===================================================");
        /**数据delete*/
        bookDAO.getBookDelete(1);


        /**数据查询All*/
        List<Book> books = bookDAO.listAll();

        for (Book book : books) {
            System.out.println(book.getName());
        }


    }
}
