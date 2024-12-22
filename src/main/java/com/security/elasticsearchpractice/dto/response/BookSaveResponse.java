package com.security.elasticsearchpractice.dto.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class BookSaveResponse {
    private String isbn;
    private String title;
    private String imageUrl;
}
