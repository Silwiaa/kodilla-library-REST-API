package kodilla.com.library.domain;

import lombok.*;
import javax.persistence.*;
import java.util.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TITLE")
public class Title {

    @Id
    @GeneratedValue
    @Column(name = "ID_TITLE")
    private Long id;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "PUBLICATION_YEAR")
    private int publicationYear;

    @OneToMany(
            targetEntity = BookCopy.class,
            mappedBy = "title",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<BookCopy> bookCopy = new ArrayList<>();

}
