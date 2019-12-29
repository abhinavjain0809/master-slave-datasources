package com.abhinavjain.masterslavedatasources.dao;

import com.abhinavjain.masterslavedatasources.entity.Books;
import com.abhinavjain.masterslavedatasources.repository.readonly.BooksReadOnlyRepository;
import com.abhinavjain.masterslavedatasources.repository.readwrite.BooksReadWriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BooksDAO implements BooksReadOnlyRepository, BooksReadWriteRepository {
    private BooksReadOnlyRepository booksReadOnlyRepository;
    private BooksReadWriteRepository booksReadWriteRepository;

    @Autowired
    public BooksDAO(BooksReadOnlyRepository booksReadOnlyRepository, BooksReadWriteRepository booksReadWriteRepository) {
        this.booksReadOnlyRepository = booksReadOnlyRepository;
        this.booksReadWriteRepository = booksReadWriteRepository;
    }

    public List<Books> getAllBooksFromMaster() {
        return booksReadWriteRepository.findAll();
    }

    public List<Books> getAllBooksFromSlave() {
        return booksReadOnlyRepository.findAll();
    }

    // Methods that come with JpaRepository
    @Override
    public List<Books> findAll() {
        return booksReadOnlyRepository.findAll();
    }

    @Override
    public List<Books> findAll(Sort sort) {
        return booksReadOnlyRepository.findAll(sort);
    }

    @Override
    public Page<Books> findAll(Pageable pageable) {
        return booksReadOnlyRepository.findAll(pageable);
    }

    @Override
    public List<Books> findAllById(Iterable<Long> iterable) {
        return booksReadOnlyRepository.findAllById(iterable);
    }

    @Override
    public long count() {
        return booksReadOnlyRepository.count();
    }

    @Override
    public void deleteById(Long aLong) {
        booksReadWriteRepository.deleteById(aLong);
    }

    @Override
    public void delete(Books books) {
        booksReadWriteRepository.delete(books);
    }

    @Override
    public void deleteAll(Iterable<? extends Books> iterable) {
        booksReadWriteRepository.deleteAll(iterable);
    }

    @Override
    public void deleteAll() {
        booksReadWriteRepository.deleteAll();
    }

    @Override
    public <S extends Books> S save(S s) {
        return booksReadWriteRepository.save(s);
    }

    @Override
    public <S extends Books> List<S> saveAll(Iterable<S> iterable) {
        return booksReadWriteRepository.saveAll(iterable);
    }

    @Override
    public Optional<Books> findById(Long aLong) {
        return booksReadOnlyRepository.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return booksReadOnlyRepository.existsById(aLong);
    }

    @Override
    public void flush() {
        booksReadWriteRepository.flush();
    }

    @Override
    public <S extends Books> S saveAndFlush(S s) {
        return booksReadWriteRepository.saveAndFlush(s);
    }

    @Override
    public void deleteInBatch(Iterable<Books> iterable) {
        booksReadWriteRepository.deleteInBatch(iterable);
    }

    @Override
    public void deleteAllInBatch() {
        booksReadWriteRepository.deleteAllInBatch();
    }

    @Override
    public Books getOne(Long aLong) {
        return booksReadOnlyRepository.getOne(aLong);
    }

    @Override
    public <S extends Books> Optional<S> findOne(Example<S> example) {
        return booksReadOnlyRepository.findOne(example);
    }

    @Override
    public <S extends Books> List<S> findAll(Example<S> example) {
        return booksReadOnlyRepository.findAll(example);
    }

    @Override
    public <S extends Books> List<S> findAll(Example<S> example, Sort sort) {
        return booksReadOnlyRepository.findAll(example, sort);
    }

    @Override
    public <S extends Books> Page<S> findAll(Example<S> example, Pageable pageable) {
        return booksReadOnlyRepository.findAll(example, pageable);
    }

    @Override
    public <S extends Books> long count(Example<S> example) {
        return booksReadOnlyRepository.count(example);
    }

    @Override
    public <S extends Books> boolean exists(Example<S> example) {
        return booksReadOnlyRepository.exists(example);
    }
}
