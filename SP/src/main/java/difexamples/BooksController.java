package controllers;

import books.Book;
import observer.AllBooksSubject;
import persistence.BooksRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksRepository booksRepository;
    private final AllBooksSubject allBooksSubject;

    public BooksController(BooksRepository booksRepository, AllBooksSubject allBooksSubject) {
        this.booksRepository = booksRepository;
        this.allBooksSubject = allBooksSubject;
    }

    @PostMapping
    public String newBook(@RequestBody Book newBookRequest) {
        Book book = booksRepository.save(newBookRequest);

        allBooksSubject.add(book);

        return "Book saved [" + book.getId() + "] " + book.getTitle();
    }
}