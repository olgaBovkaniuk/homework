package com.gmail.olgabovkaniuk.bovkaniuk26.service;

import com.gmail.olgabovkaniuk.bovkaniuk26.entity.Book;
import com.gmail.olgabovkaniuk.bovkaniuk26.entity.Client;

import java.util.ArrayList;
import java.util.List;

public class GeneratorService {
    private static GeneratorService instance;

    public static GeneratorService getInstance() {
        if (instance == null) {
            instance = new GeneratorService();
        }
        return instance;
    }

    private GeneratorService() {
    }

    public List<Client> generateClientCollection(int listLength) {
        List<Client> clientList = new ArrayList<>();
        for (int i = 1; i <= listLength; i++) {
            clientList.add(new Client(
                    (long) i,
                    "Name" + i
            ));
        }
        return clientList;
    }

    public List<Book> generateBooksForClients(List<Client> clientList, int numberOfBooksPerClient) {
        List<Book> allBookList = new ArrayList<>();
        for (Client client : clientList) {
            allBookList.addAll(generateBookForOneClient(client, numberOfBooksPerClient));
        }
        return allBookList;
    }

    private List<Book> generateBookForOneClient(Client client, int numberOfBooksPerClient) {
        List<Book> books = new ArrayList<>();
        long i = client.getId() * numberOfBooksPerClient - numberOfBooksPerClient + 1;
        while (i <= client.getId() * numberOfBooksPerClient) {
            books.add(new Book(
                    (long) i,
                    "Title_" + i,
                    client
            ));
            i++;
        }
        return books;
    }
}
