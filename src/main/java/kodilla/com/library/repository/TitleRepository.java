package kodilla.com.library.repository;

import kodilla.com.library.domain.Title;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TitleRepository extends CrudRepository<Title, Long> {
    @Override
    List<Title> findAll();
}
