package com.security.elasticsearchpractice.dto.converter;

import com.security.elasticsearchpractice.dto.request.BookSaveRequest;
import com.security.elasticsearchpractice.dto.response.BookSaveResponse;
import com.security.elasticsearchpractice.entity.BookEntity;

public class BookConverter {
    public static BookEntity toBookEntity(BookSaveRequest bookSaveRequest) {

        BookEntity bookEntity = new BookEntity();

        bookEntity.setIsbn(bookSaveRequest.getIsbn());

        bookEntity.setTitle(bookSaveRequest.getTitle());
        bookEntity.setAuthor(bookSaveRequest.getAuthor());
        bookEntity.setGenre(bookSaveRequest.getGenre());
        bookEntity.setSummary(bookSaveRequest.getSummary());
        bookEntity.setRating(bookSaveRequest.getRating());
        bookEntity.setPublishedYear(bookSaveRequest.getPublishedYear());
        bookEntity.setPublisher(bookSaveRequest.getPublisher());
        bookEntity.setImageUrl(bookSaveRequest.getImageUrl());
        return bookEntity;
    }
    public static BookSaveResponse toBookSaveResponse(BookEntity bookEntity) {
        BookSaveResponse bookSaveResponse = new BookSaveResponse();
        bookSaveResponse.setIsbn(bookEntity.getIsbn());
        bookSaveResponse.setTitle(bookEntity.getTitle());
        bookSaveResponse.setImageUrl(bookEntity.getImageUrl());
        return bookSaveResponse;
    }
}
