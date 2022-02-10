package kodilla.com.library.repository;

import kodilla.com.library.domain.Title;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitleRepository extends CrudRepository<Title, Long> {
}
