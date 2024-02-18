package com.example.demo93.Service;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.stereotype.Service;

import com.example.demo93.Entity.Author;
import com.example.demo93.Entity.Book;
import com.example.demo93.Entity.Patron;
import com.example.demo93.Repositories.AuthorRepository;
import com.example.demo93.Repositories.BookRepository;
import com.example.demo93.Repositories.PatronRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@Service
@AllArgsConstructor

public class LibService {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PatronRepository patronRepository;
}

public Author addAuthor(Author author) {

    return authorRepository.save(author);
}

public Book addBook(Book book) {
    return bookRepository.save(book);
}

public Patron addPatron(Patron patron) {
    return patronRepository.save(patron);
}

public void deleteAuthor(Long authorId) {
    authorRepository.deleteById(authorId);
}

public void deleteBook(Long bookId) {
    bookRepository.deleteById(bookId);
}

public void deletePatron(Long patronId) {
    patronRepository.deleteById(patronId);
}

public void updateAuthor(Author author) {
    authorRepository.save(author);
}

public void updateBook(Book book) {
    bookRepository.save(book);
}

public void updatePatron(Patron patron) {
    patronRepository.save(patron);
}

public List<Author> getAllAuthors() {
    return authorRepository.findAll();
}

public List<Book> getAllBooks() {
    return bookRepository.findAll();
}

public List<Patron> getAllPatrons() {
    return patronRepository.findAll();
}

public void borrowBook(Long patronId, Long bookId) {
    Patron patron = patronRepository.findById(patronId).orElseThrow(() -> new RuntimeException("Patron not found"));
    Book book = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));

    patron.getBooksBorrowed().add(book);
    patronRepository.save(patron);
}