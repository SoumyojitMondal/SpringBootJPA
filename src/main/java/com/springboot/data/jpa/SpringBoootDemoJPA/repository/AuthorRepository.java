package com.springboot.data.jpa.SpringBoootDemoJPA.repository;

import com.springboot.data.jpa.SpringBoootDemoJPA.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
