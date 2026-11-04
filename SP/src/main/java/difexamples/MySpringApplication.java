package difexamples;

import books.Author;
import books.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import persistence.BooksRepository;

@SpringBootApplication
@ComponentScan(basePackages = {"difexamples", "controllers", "books"})
@EntityScan(basePackages = {"books"})
@EnableJpaRepositories(basePackages = {"persistence"})
public class MySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(BooksRepository booksRepository) {
        return args -> {
            Book book = new Book("Design Patterns");
            book.addAuthor(new Author("Erich", "Gamma"));

            booksRepository.save(book);

            System.out.println("--- Carte salvata cu succes! ---");
        };
    }
}