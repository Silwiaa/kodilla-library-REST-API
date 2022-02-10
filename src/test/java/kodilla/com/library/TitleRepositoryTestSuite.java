package kodilla.com.library;

import kodilla.com.library.domain.BookCopy;
import kodilla.com.library.domain.Title;
import kodilla.com.library.repository.TitleRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TitleRepositoryTestSuite {
    @Autowired
    private TitleRepository titleRepository;
    private Long id = null;
    private Long id2 = null;

    private Title title = Title.builder()
            .title("Harry Potter")
            .author("J.K. Rowling")
            .publicationYear(1997)
            .build();

    private Title title2 = Title.builder()
            .title("The Lord of the Rings")
            .author("J.R.R. Tolkien")
            .publicationYear(1954)
            .build();

    @BeforeEach
    public void before() {
        titleRepository.save(title);
        titleRepository.save(title2);
        id = title.getId();
        id2 = title2.getId();
    }

    @AfterEach
    public void after() {
        //CleanUp
        if (titleRepository.existsById(id)) {
            titleRepository.deleteById(id);
        }

        if (titleRepository.existsById(id2)) {
            titleRepository.deleteById(id2);
        }
    }


    @Test
    void testTitleRepositorySave() {
        //Given

        //When

        //Then
        Optional<Title> readTitle = titleRepository.findById(id);
        assertTrue(readTitle.isPresent());

    }

    @Test
    void testTitleRepositorySaveWithBookCopies() {
        //Given
        final List<BookCopy> bookCopies = new ArrayList<>();

        BookCopy bookCopy = BookCopy.builder()
                .status("available")
                .title(title)
                .build();

        bookCopies.add(bookCopy);
        title.setBookCopy(bookCopies);

        //When
        titleRepository.save(title);

        //Then
        id = title.getId();
        assertNotEquals(0, id);
    }

    @Test
    void testTitleRepositoryFindById() {
        //Given

        //When
        Optional<Title> readTitle = titleRepository.findById(id);

        //Then
        assertEquals(readTitle.get().getId(), id);
    }

    @Test
    void testTitleRepositoryFindAll() {
        //Given

        //When
        List<Title> allTitles = titleRepository.findAll();

        //Then
        assertEquals(allTitles.size(), 2);
    }

    @Test
    void testTitleRepositoryDeleteById() {
        //Given

        //When
        titleRepository.deleteById(id);

        //Then
        List<Title> allTitles = titleRepository.findAll();
        assertEquals(allTitles.size(), 1);
    }
}
