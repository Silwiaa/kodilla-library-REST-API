package kodilla.com.library.repository;

import kodilla.com.library.domain.BookCopy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCopyRepository extends CrudRepository<BookCopy, Long> {
}
