package com.ling.service;

import com.ling.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    int  addBook(Books books);
    //删
    int deleteBook(int id);
    //改
    int updateBook(Books books);
    //查
    Books queryBookByID(int id );
    //查全部
    List<Books> queryAll();
}
