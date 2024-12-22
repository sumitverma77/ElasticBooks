package com.security.elasticsearchpractice.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName= "books")
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private String genre;
    private String summary;
    private float rating;
    private int publishedYear;
}
