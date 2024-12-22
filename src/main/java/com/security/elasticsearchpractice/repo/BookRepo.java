package com.security.elasticsearchpractice.repo;

import com.security.elasticsearchpractice.entity.BookEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.RefreshPolicy;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface BookRepo extends ElasticsearchRepository<BookEntity, String> {

    BookEntity findAllByIsbn(String isbn);

    Page<BookEntity> searchSimilar(BookEntity entity, String[] fields, Pageable pageable);

    <S extends BookEntity> S save(S entity, RefreshPolicy refreshPolicy);

    <S extends BookEntity> Iterable<S> saveAll(Iterable<S> entities, RefreshPolicy refreshPolicy);

    void deleteById(String s, RefreshPolicy refreshPolicy);

    void delete(BookEntity entity, RefreshPolicy refreshPolicy);

    void deleteAllById(Iterable<? extends String> strings, RefreshPolicy refreshPolicy);

    void deleteAll(Iterable<? extends BookEntity> entities, RefreshPolicy refreshPolicy);

    void deleteAll(RefreshPolicy refreshPolicy);

    <S extends BookEntity> S save(S entity);
}
