package kodilla.com.library.domain;

import lombok.*;
import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "BOOK_COPIES")
public class BookCopy {

    @Id
    @GeneratedValue
    @Column(name = "ID_BOOK_COPY")
    private Long id;

    @Column(name = "STATUS")
    private String status;

    @ManyToOne
    @JoinColumn(name = "ID_TITLE")
    private Title title;
}
