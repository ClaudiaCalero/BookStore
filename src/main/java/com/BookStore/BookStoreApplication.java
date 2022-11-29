package com.BookStore;

import com.BookStore.model.Book;
import com.BookStore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner {
	@Autowired
	BookRepository bookRepository;
	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	public void run(String... args) throws Exception {
		Book book1 = new Book(1, "Pride & Prejudice", "Jane Auten", "Romance/Drama", "12-01-1813");

		Book book2 = new Book(2, "Persuasion", "Jane Auten", "Romance/Drama", "20-11-1817");

		Book book3 = new Book(3, "Dracula", " Bram Stoker", "Terror/Fantasy", "26-05-1897");

		Book book4 = new Book(4, "The Lord of the Rings", "J. R. R. Tolkien", "High Fantasy/Adventure", "29-06-1949");

		Book book5 = new Book(5, " The Great Gatsby", "F. Scott Fitzgerald", "Novel/Fiction, Tragedy", "10-04-1925");

		Book book6 = new Book(6, "Don Quixote", "Miguel de Cervantes", "Satire/Parody", "1605");

		Book book7 = new Book(7, "One Hundred Years of Solitude", "Gabriel García Márquez", "Novel/Fiction/High Fantasy", "05-03-1967");

		Book book8 = new Book(8, "The Da Vinci Code", "Dan Brown", "Novel/Suspense/Mystery/Fiction/Conspiracy/Thriller/Detective", "18-03-2003");

		Book book9 = new Book(9, "The Art of War", "Sun Tzu", "Military/No Fiction", "475");

		Book book10 = new Book(10, "Game Of Thrones", "George R. R. Martin", "Novel/High Fantasy/Politic Fiction", "01-08-1996");

		bookRepository.saveAll(List.of(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10));

	}
}
