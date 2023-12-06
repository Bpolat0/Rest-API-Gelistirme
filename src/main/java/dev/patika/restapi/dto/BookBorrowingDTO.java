package dev.patika.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowingDTO {
    private Long id;
    private String borrower_name;
    private LocalDate onDate;
    private LocalDate returnDate;
    private Long bookId;
}
