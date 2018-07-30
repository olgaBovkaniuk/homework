package com.gmail.olgabovkaniuk.bovkaniuk26.dao;

import com.gmail.olgabovkaniuk.bovkaniuk26.entity.Book;

import java.util.List;

public interface BookDao extends GenericDao<Book> {
    void createBookTable();

    List<Book> getBooks();
}
