package com.example.msbook.services;

import com.example.msbook.models.Book;
import com.example.msbook.repositories.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAllBooks() {
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    public Optional<Book> findBookById(Long bookId) {
        return bookRepository.findById(bookId);
    }

    @Transactional
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long bookId) {
        bookRepository.deleteById(bookId);
    }

    public Book updateBook(Book book, Long bookId) {
        return null;
    }

    public Book updateBook(Map<String, String> updates, Long bookId) {
        return null;
    }
}
