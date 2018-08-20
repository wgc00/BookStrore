package com.dao;

import com.entity.Book;
import com.interfaces.InMeoryBookDAO;

import java.util.ArrayList;
import java.util.List;


public class MyBookDAO implements InMeoryBookDAO {

    private static ArrayList<Book> booDB = new ArrayList<>();

    static{
        Book book1 = new Book(1,"战争与和平",34.5f,"列夫·托尔斯泰","南方出版社");
        Book book2 = new Book(2,"Java编程",12.3f,"南方老师","南方出版社");
        Book book3 = new Book(3,"C语言",35.5f,"老外","北方出版社");
        Book book4 = new Book(4,"弟子规",3.5f,"贾仁存","西方出版社");
        booDB.add(book1);
        booDB.add(book2);
        booDB.add(book3);
        booDB.add(book4);
    }

    @Override
    public List<Book> listAll() {
        return booDB;
    }

    @Override
    public Book getBookQueryId(int id) {
        for (Book book : booDB) {
            if (book.getId() == id){

                return book;
            }
        }

        return null;
    }

    @Override
    public List<Book> getBookQueryName(String name) {
        ArrayList<Book> books = new ArrayList<>();
        for (Book book : booDB) {
            if (book.getName().toLowerCase().contains(name.toLowerCase())){
                books.add(book);
            }
        }
        return books;
    }

    @Override
    public Book getBookAdd(Book book) {
        if (booDB.add(book)){
            return book;
        }
        return null;
    }

    @Override
    public boolean getBookDelete(int id) {
        for (Book book : booDB) {
            if (book.getId() == id){
                return booDB.remove(book);
            }
        }
        return false;
    }

    @Override
    public boolean getBookUpdate(Book book) {

        for (Book book1 : booDB) {
            if (book.getId() == book1.getId()){
                book1.setName(book.getName());
                book1.setPrice(book.getPrice());
                book1.setAuthor(book.getAuthor());
                book1.setPrss(book.getPrss());
                return true;
            }
        }
        return false;
    }
}
