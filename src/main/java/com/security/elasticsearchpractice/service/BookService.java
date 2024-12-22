package com.security.elasticsearchpractice.service;

//import com.security.elasticsearchpractice.dto.converter.BookConverter;
import com.security.elasticsearchpractice.dto.converter.BookConverter;
import com.security.elasticsearchpractice.dto.request.BookSaveRequest;
import com.security.elasticsearchpractice.dto.response.ApiResponseWrapper;
import com.security.elasticsearchpractice.dto.response.BookSaveResponse;
import com.security.elasticsearchpractice.entity.BookEntity;
import com.security.elasticsearchpractice.enums.ApiResponseStatus;
import com.security.elasticsearchpractice.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookService {
@Autowired
BookRepo bookRepo;
    public ApiResponseWrapper<BookSaveResponse> saveBook(BookSaveRequest bookSaveRequest) {
     BookEntity book = BookConverter.toBookEntity(bookSaveRequest);
     bookRepo.save(book);
     return new ApiResponseWrapper<>(ApiResponseStatus.SUCCESS.getCode(), ApiResponseStatus.SUCCESS.getMessage(), BookConverter.toBookSaveResponse(book));
    }

}
