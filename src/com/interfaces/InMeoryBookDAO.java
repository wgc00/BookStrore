package com.interfaces;


import com.entity.Book;


import java.util.List;

public interface InMeoryBookDAO {

    //查询的接口
    List<Book> listAll();
    Book getBookQueryId(int id);
    List<Book> getBookQueryName(String name);

    //添加的接口
    Book getBookAdd(Book book);

    boolean getBookDelete(int id);

    boolean getBookUpdate(Book book );


}
