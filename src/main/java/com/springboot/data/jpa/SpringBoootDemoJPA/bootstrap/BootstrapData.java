package com.springboot.data.jpa.SpringBoootDemoJPA.bootstrap;

import com.springboot.data.jpa.SpringBoootDemoJPA.model.Author;
import com.springboot.data.jpa.SpringBoootDemoJPA.model.Book;
import com.springboot.data.jpa.SpringBoootDemoJPA.model.Publisher;
import com.springboot.data.jpa.SpringBoootDemoJPA.repository.AuthorRepository;
import com.springboot.data.jpa.SpringBoootDemoJPA.repository.BookRepository;
import com.springboot.data.jpa.SpringBoootDemoJPA.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private  final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Start of Bootstrapping");

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");

        publisherRepository.save(publisher);

        System.out.println("Publisher Count: " + publisherRepository.count());

        Author myAuthor1 = new Author("Kathy", "Sierra");
        Book myBook1 = new Book("Head First Java","IBN13354");
        myAuthor1.getBooks().add(myBook1);
        myBook1.getAuthors().add(myAuthor1);
        myBook1.setPublisher(publisher);
        publisher.getBooks().add(myBook1);

        authorRepository.save(myAuthor1);
        bookRepository.save(myBook1);
        publisherRepository.save(publisher);

        Author myAuthor2 = new Author("Chetan","Bhagat");
        Book myBook2 = new Book("Five Point Someone","IBN4854385");
        myAuthor2.getBooks().add(myBook2);
        myBook2.getAuthors().add(myAuthor2);
        myBook2.setPublisher(publisher);
        publisher.getBooks().add(myBook2);

        authorRepository.save(myAuthor2);
        bookRepository.save(myBook2);
        publisherRepository.save(publisher);

        System.out.println("No. of books: "+ bookRepository.count());
        System.out.println("No.of books published by Publisher : "+publisher.getBooks().size());

        System.out.print("End of Bootstrapping");

    }
}
