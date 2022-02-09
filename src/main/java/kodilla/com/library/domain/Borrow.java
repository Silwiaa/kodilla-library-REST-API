package kodilla.com.library.domain;

import lombok.*;
import javax.persistence.*;
import java.util.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "BORROWS")
public class Borrow {

    @Id
    @GeneratedValue
    @Column(name = "ID_BORROW")
    private Long id;

    @Column(name = "BORROW_DATE")
    private Date borrowDate;

    @Column(name = "RETURN_DATE")
    private Date returnDate;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_READER")
    private Reader reader;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_BOOK_COPIE")
    private BookCopy bookCopy;
}
