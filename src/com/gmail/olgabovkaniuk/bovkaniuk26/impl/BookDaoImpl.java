package com.gmail.olgabovkaniuk.bovkaniuk26.impl;

import com.gmail.olgabovkaniuk.bovkaniuk26.entity.Book;
import com.gmail.olgabovkaniuk.bovkaniuk26.dao.BookDao;
import com.gmail.olgabovkaniuk.bovkaniuk26.entity.Client;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BookDaoImpl extends GenericDaoImpl<Book> implements BookDao {

    public void createBookTable() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS t_book("
                + "id INTEGER (11) AUTO_INCREMENT NOT NULL, "
                + "title VARCHAR(50) NOT NULL, "
                + "client_id INTEGER, "
                + "PRIMARY KEY (id), "
                + "FOREIGN KEY (client_id) REFERENCES t_client(id)"
                + ")";
        execute(createTableSQL);
        System.out.println("Table 't_book' is created!");
    }

    @Override
    public void save(Book book) {
        String insertBookSQL = "INSERT INTO t_book (id, title, client_id) "
                + "VALUES ("
                + book.getId()
                + ", '"
                + book.getTitle()
                + "', "
                + book.getClient().getId()
                + ")";
        execute(insertBookSQL);
    }

    @Override
    public void saveAll(List<Book> bookList) {
        for (Book book : bookList) {
            save(book);
        }
    }

    @Override
    public Book getById(Long id) {
        String selectBookSQL = "SELECT b.id as bookId, b.title as bookTitle, b.client_id as clientId, c.name as clientName FROM t_book b INNER JOIN t_client c ON b.client_id = c.id WHERE b.id = " + id;
        List<Book> bookList = selectAll(selectBookSQL);
        return bookList.isEmpty() ? null : bookList.get(0);
    }

    @Override
    public List<Book> getBooks() {
        String selectBookSQL = "SELECT b.id as bookId, b.title as bookTitle, b.client_id as clientId, c.name as clientName FROM t_book b INNER JOIN t_client c ON b.client_id = c.id";
        return selectAll(selectBookSQL);
    }

    @Override
    protected Book buildEntity(ResultSet rs) throws SQLException {
        Long id = rs.getLong("bookId");
        String title = rs.getString("bookTitle");
        Long client_id = rs.getLong("clientId");
        String name = rs.getString("clientName");
        return new Book(id, title, new Client(client_id, name));
    }
}
