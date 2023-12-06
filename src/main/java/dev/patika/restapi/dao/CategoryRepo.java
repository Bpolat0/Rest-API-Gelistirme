package dev.patika.restapi.dao;

import dev.patika.restapi.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// This interface is used to access the Category table in the database.
// JpaRepository<CategoryRepo, Long> means that the CategoryRepo interface extends the JpaRepository interface.
// The first parameter of the JpaRepository interface is the entity class that the CategoryRepo interface will access.
// The second parameter of the JpaRepository interface is the type of the primary key of the entity class.
// The JpaRepository interface provides us with CRUD operations.
@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {
}
