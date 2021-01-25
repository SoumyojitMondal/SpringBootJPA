package com.springboot.data.jpa.SpringBoootDemoJPA.repository;

import com.springboot.data.jpa.SpringBoootDemoJPA.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
