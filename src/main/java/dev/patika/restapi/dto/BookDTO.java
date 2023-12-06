package dev.patika.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private Long id;
    private String name;
    private int publicationYear;
    private int stock;
    private Long author_id;
    private Long publisher_id;
}
