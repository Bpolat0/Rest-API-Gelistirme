package dev.patika.restapi.dao;

import dev.patika.restapi.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// This interface is used to access the Publisher table in the database.
// JpaRepository<PublisherRepo, Long> means that the PublisherRepo interface extends the JpaRepository interface.
// The first parameter of the JpaRepository interface is the entity class that the PublisherRepo interface will access.
// The second parameter of the JpaRepository interface is the type of the primary key of the entity class.
// The JpaRepository interface provides us with CRUD operations.
@Repository
public interface PublisherRepo extends JpaRepository<Publisher, Long> {
}
