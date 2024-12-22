package com.security.elasticsearchpractice.controller;

import com.security.elasticsearchpractice.dto.request.BookSaveRequest;
import com.security.elasticsearchpractice.dto.response.ApiResponseWrapper;
import com.security.elasticsearchpractice.dto.response.BookSaveResponse;
import com.security.elasticsearchpractice.entity.BookEntity;
import com.security.elasticsearchpractice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
public class ElasticSearchController {
  @Autowired
  private BookService bookService;
  @PostMapping("/save")
  public ApiResponseWrapper<BookSaveResponse> saveBook(@RequestBody BookSaveRequest bookSaveRequest) {
    return bookService.saveBook(bookSaveRequest);
  }

}
