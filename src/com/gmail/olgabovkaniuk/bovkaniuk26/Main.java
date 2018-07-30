package com.gmail.olgabovkaniuk.bovkaniuk26;

/*
    1. Создать базу данных library
    2. Создать две таблицы Client(id,name) и Book(id,title,client_id). У Book должно быть поле client_id, которое должно быть связано с полем id из таблицы Client
    2. Создать два класса
    class Book{
        private Long id;
        private String title;
        private Client client;
    }
    class Client{
        private Long id;
        private String name;
    }
    2. Создать два интерфейса и их имплементации
    interface ClientDao {
        void save(Client client);
        Client getById(Long id);
    }
    interface BookDao {
        void save(Book book);
        List<Book> getBooks();
    }
    3. Написать метод в GeneratorService(должен быть singleton) который генерирует 3 клиента и 15 книг по 5 для каждого.
    4. Записать эти данные в базу данных через ClientDao и BookDao
    5. Вызвать метод getBooks() и вывести результат на экран.
*/

import com.gmail.olgabovkaniuk.bovkaniuk26.dao.BookDao;
import com.gmail.olgabovkaniuk.bovkaniuk26.dao.ClientDao;
import com.gmail.olgabovkaniuk.bovkaniuk26.entity.Book;
import com.gmail.olgabovkaniuk.bovkaniuk26.entity.Client;
import com.gmail.olgabovkaniuk.bovkaniuk26.impl.BookDaoImpl;
import com.gmail.olgabovkaniuk.bovkaniuk26.impl.ClientDaoImpl;
import com.gmail.olgabovkaniuk.bovkaniuk26.service.GeneratorService;

import java.util.List;

public class Main {
    private static GeneratorService generatorService = GeneratorService.getInstance();
    private static ClientDao clientDao = new ClientDaoImpl();
    private static BookDao bookDao = new BookDaoImpl();

    public static void main(String[] args) {
        List<Client> clientList = generatorService.generateClientCollection(3);
        List<Book> bookList = generatorService.generateBooksForClients(clientList, 5);
        clientDao.createClientTable();
        clientDao.saveAll(clientList);
        bookDao.createBookTable();
        bookDao.saveAll(bookList);
        for (Book book : bookDao.getBooks()) {
            System.out.println(book);
        }
    }
}
