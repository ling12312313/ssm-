package com.ling.dao;

import com.ling.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksMapper {
    //增
    int  addBook(Books books);
    //删
    int deleteBook(@Param("bookID") int id);
    //改
    int updateBook(Books books);
    //查
    Books queryBookByID(@Param("bookID") int id );
    //查全部
    List<Books> queryAll();
}
