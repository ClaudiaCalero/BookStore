package com.BookStore;

import com.BookStore.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.BookStore.repository.BookRepository;


@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner {
	@Autowired
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*	Book book1 = new Book(1, "Pride & Prejudice", "Jane Auten", "Romance/Drama", "12-01-1813");
		bookRepository.save(book1);
		Book book2 = new Book(2, "Persuasion", "Jane Auten", "Romance/Drama", "20-11-1817");
		bookRepository.save(book2);
		Book book3 = new Book(3, "Dracula", " Bram Stoker", "Terror/Fantasy", "26-05-1897");
		bookRepository.save(book3);
		Book book4 = new Book(4, "The Lord of the Rings", "J. R. R. Tolkien", "High Fantasy/Adventure", "29-06-1949");
		bookRepository.save(book4);
		Book book5 = new Book(5, " The Great Gatsby", "F. Scott Fitzgerald", "Novel/Fiction, Tragedy", "10-04-1925");
		bookRepository.save(book5);
		Book book6 = new Book(6, "Don Quixote", "Miguel de Cervantes", "Satire/Parody", "1605");
		bookRepository.save(book6);
		Book book7 = new Book(7, "One Hundred Years of Solitude", "Gabriel García Márquez", "Novel/Fiction/High Fantasy", "05-03-1967");
		bookRepository.save(book7);
		Book book8 = new Book(8, "The Da Vinci Code", "Dan Brown", "Novel/Suspense/Mystery/Fiction/Conspiracy/Thriller/Detective", "18-03-2003");
		bookRepository.save(book8);
		Book book9 = new Book(9, "The Art of War", "Sun Tzu", "Military/No Fiction", "475");
		bookRepository.save(book9);
		Book book10 = new Book(10, "Game Of Thrones", "George R. R. Martin", "Novel/High Fantasy/Politic Fiction", "01-08-1996");
		bookRepository.save(book10);*/
	}
}
