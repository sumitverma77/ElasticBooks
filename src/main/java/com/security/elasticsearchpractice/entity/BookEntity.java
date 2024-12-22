package com.security.elasticsearchpractice.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.UUID;


@Document(indexName= "books")
@Data
public class BookEntity {
    @Id
    private String id;
    public BookEntity() {
        this.id = UUID.randomUUID().toString();
    }
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
