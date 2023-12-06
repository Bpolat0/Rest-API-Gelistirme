package dev.patika.restapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.patika.restapi.entities.Book;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "publishers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "serial")
    private Long id;

    @Column(name = "publisher_name", nullable = false)
    private String name;

    @Column(name = "publisher_establishmentYear", nullable = false)
    private Integer establishmentYear;

    @Column(name = "publisher_address", nullable = false)
    private String address;

    @JsonIgnore
    @OneToMany(mappedBy = "publisher", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Book> bookList;
}