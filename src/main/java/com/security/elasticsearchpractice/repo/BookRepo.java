package com.security.elasticsearchpractice.repo;

import com.security.elasticsearchpractice.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.RefreshPolicy;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.Optional;

public class BookRepo implements ElasticsearchRepository<Book, String> {
    @Override
    public Page<Book> searchSimilar(Book entity, String[] fields, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Book> S save(S entity, RefreshPolicy refreshPolicy) {
        return null;
    }

    @Override
    public <S extends Book> Iterable<S> saveAll(Iterable<S> entities, RefreshPolicy refreshPolicy) {
        return null;
    }

    @Override
    public void deleteById(String s, RefreshPolicy refreshPolicy) {

    }

    @Override
    public void delete(Book entity, RefreshPolicy refreshPolicy) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings, RefreshPolicy refreshPolicy) {

    }

    @Override
    public void deleteAll(Iterable<? extends Book> entities, RefreshPolicy refreshPolicy) {

    }

    @Override
    public void deleteAll(RefreshPolicy refreshPolicy) {

    }

    @Override
    public <S extends Book> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Book> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Book> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<Book> findAll() {
        return null;
    }

    @Override
    public Iterable<Book> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Book entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Book> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Iterable<Book> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Book> findAll(Pageable pageable) {
        return null;
    }
}
