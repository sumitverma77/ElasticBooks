package com.security.elasticsearchpractice.dto.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class BookSaveRequest {
    private String isbn;

    private String title;
    private String author;
    private String genre;
    private String summary;
    private float rating;
    private int publishedYear;
    private String publisher;
    private String imageUrl;
}
