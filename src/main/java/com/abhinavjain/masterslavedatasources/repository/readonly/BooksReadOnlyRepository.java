package com.abhinavjain.masterslavedatasources.repository.readonly;

import com.abhinavjain.masterslavedatasources.annotation.ReadOnlyRepository;
import com.abhinavjain.masterslavedatasources.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@ReadOnlyRepository
public interface BooksReadOnlyRepository extends JpaRepository<Books, Long> {
}
