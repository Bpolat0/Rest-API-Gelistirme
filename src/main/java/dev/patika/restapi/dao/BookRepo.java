package dev.patika.restapi.dao;

import dev.patika.restapi.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// This interface is used to access the Book table in the database.
// JpaRepository<Book, Long> means that the BookRepo interface extends the JpaRepository interface.
// The first parameter of the JpaRepository interface is the entity class that the BookRepo interface will access.
// The second parameter of the JpaRepository interface is the type of the primary key of the entity class.
// The JpaRepository interface provides us with CRUD operations.
@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

}
