package dev.patika.restapi.api;

import dev.patika.restapi.business.abstracts.IBookService;
import dev.patika.restapi.entities.Book;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class BookController {

    @Autowired
    private IBookService bookService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    public BookController(IBookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/books")
    @ResponseStatus(HttpStatus.CREATED)
    public Book save(@RequestBody Book book){
        return this.bookService.save(book);
    }

    @PutMapping("/books")
    @ResponseStatus(HttpStatus.OK)
    public Book update(@RequestBody Book book){
        return this.bookService.update(book);
    }

    @GetMapping("/books")
    @ResponseStatus(HttpStatus.OK)
    public List<Book> findAll(){
        return this.bookService.findAll();
    }

    @DeleteMapping("/books/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable int id){
        this.bookService.delete(id);
    }

    @GetMapping("/books/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book findById(@PathVariable int id){
        return this.bookService.getById(id);
    }
}
