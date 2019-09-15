package com.example.msbook.repositories;

import com.example.msbook.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
