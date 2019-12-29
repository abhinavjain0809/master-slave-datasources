package com.abhinavjain.masterslavedatasources.repository.readwrite;

import com.abhinavjain.masterslavedatasources.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksReadWriteRepository extends JpaRepository<Books, Long> {
}
