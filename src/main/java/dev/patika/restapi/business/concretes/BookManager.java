package dev.patika.restapi.business.concretes;

import dev.patika.restapi.business.abstracts.IBookService;
import dev.patika.restapi.entities.Book;
import dev.patika.restapi.dao.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookManager implements IBookService {

    @Autowired
    private BookRepo bookRepo;

    @Override
    public Book getById(int id) {
        return this.bookRepo.findById((long) id).orElse(null);
    }

    @Override
    public Book save(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public void delete(int book) {
        this.bookRepo.deleteById((long) book);
    }

    @Override
    public Book update(Book book) {
        if (book.getId() == 0){
            throw new RuntimeException("Lütfen id değeri olan bir book nesnesi gönderiniz.");
        }
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> findAll() {
        return this.bookRepo.findAll();
    }
}
