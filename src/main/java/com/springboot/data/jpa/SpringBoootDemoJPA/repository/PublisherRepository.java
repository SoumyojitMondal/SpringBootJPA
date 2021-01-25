package com.springboot.data.jpa.SpringBoootDemoJPA.repository;

import com.springboot.data.jpa.SpringBoootDemoJPA.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
