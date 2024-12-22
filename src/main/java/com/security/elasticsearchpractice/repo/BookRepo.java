package com.security.elasticsearchpractice.repo;

import com.security.elasticsearchpractice.entity.BookEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.RefreshPolicy;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BookRepo implements ElasticsearchRepository<BookEntity, String> {
    @Override
    public Page<BookEntity> searchSimilar(BookEntity entity, String[] fields, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends BookEntity> S save(S entity, RefreshPolicy refreshPolicy) {
        return null;
    }

    @Override
    public <S extends BookEntity> Iterable<S> saveAll(Iterable<S> entities, RefreshPolicy refreshPolicy) {
        return null;
    }

    @Override
    public void deleteById(String s, RefreshPolicy refreshPolicy) {

    }

    @Override
    public void delete(BookEntity entity, RefreshPolicy refreshPolicy) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings, RefreshPolicy refreshPolicy) {

    }

    @Override
    public void deleteAll(Iterable<? extends BookEntity> entities, RefreshPolicy refreshPolicy) {

    }

    @Override
    public void deleteAll(RefreshPolicy refreshPolicy) {

    }

    @Override
    public <S extends BookEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends BookEntity> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<BookEntity> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<BookEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<BookEntity> findAllById(Iterable<String> strings) {
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
    public void delete(BookEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends BookEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Iterable<BookEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<BookEntity> findAll(Pageable pageable) {
        return null;
    }
}
