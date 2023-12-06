package dev.patika.restapi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "book_borrowing")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "serial")
    private Long id;

    @Column(name = "borrower_name", nullable = false)
    private String borrower_name;

    @Temporal(TemporalType.DATE)
    @Column(name = "borrowing_on_date")
    private LocalDate onDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "borrowing_return_date")
    private LocalDate returnDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

}