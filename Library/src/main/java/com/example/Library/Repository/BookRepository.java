package com.example.Library.Repository;
import com.example.Library.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    public Book findByTitle(String bookTitle);

    public Book findByTitleIgnoreCase(String bookTitle);
}
