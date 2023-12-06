package dev.patika.restapi.business.abstracts;

import dev.patika.restapi.entities.Book;

import java.util.List;

public interface IBookService {
    Book getById(int id);

    Book save(Book book);

    void delete(int book);

    Book update(Book book);

    List<Book> findAll();
}
