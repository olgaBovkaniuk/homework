package com.gmail.olgabovkaniuk.bovkaniuk26.entity;

import java.util.Objects;

public class Book {
    private Long id;
    private String title;
    private Client client;

    public Book(Long id, String title, Client client) {
        this.id = id;
        this.title = title;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) &&
                Objects.equals(title, book.title) &&
                Objects.equals(client, book.client);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title, client);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", client=" + client +
                '}';
    }
}
