package dev.patika.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublisherDTO {
    private Long id;
    private String name;
    private int establishmentYear;
    private String address;
}
