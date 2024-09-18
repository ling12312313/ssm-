package com.ling.service;

import com.ling.dao.BooksMapper;
import com.ling.pojo.Books;

import java.util.List;

public class BookServiceImpl  implements BookService{
    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }
    private BooksMapper booksMapper;

    @Override
    public int addBook(Books books) {
        // 代理模式+spring aop入其他操作
        return booksMapper.addBook(books);
    }

    @Override
    public int deleteBook(int id) {
        return booksMapper.deleteBook(id);
    }

    @Override
    public int updateBook(Books books) {
        return booksMapper.updateBook(books);
    }

    @Override
    public Books queryBookByID(int id) {
        return booksMapper.queryBookByID(id);
    }

    @Override
    public List<Books> queryAll() {
        return booksMapper.queryAll();
    }
}
