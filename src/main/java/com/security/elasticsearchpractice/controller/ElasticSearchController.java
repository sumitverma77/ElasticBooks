package com.security.elasticsearchpractice.controller;

import com.security.elasticsearchpractice.dto.request.BookSaveRequest;
import com.security.elasticsearchpractice.dto.response.ApiResponseWrapper;
import com.security.elasticsearchpractice.dto.response.BookGetResponse;
import com.security.elasticsearchpractice.dto.response.BookSaveResponse;
import com.security.elasticsearchpractice.entity.BookEntity;
import com.security.elasticsearchpractice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("books")
public class ElasticSearchController {
  @Autowired
  private BookService bookService;
  @PostMapping("/save")
  public ApiResponseWrapper<BookSaveResponse> saveBook(@RequestBody BookSaveRequest bookSaveRequest) {
    return bookService.saveBook(bookSaveRequest);
  }
  @GetMapping("/get")
  public ApiResponseWrapper<BookSaveResponse> getBook(@RequestParam String isbn) {
    return bookService.getBook(isbn);
  }
}
