package kodilla.com.library.domain;

import lombok.*;
import javax.persistence.*;
import java.util.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "READERS")
public class Reader {

    @Id
    @GeneratedValue
    @Column(name = "ID_READER")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "CREATE_DATE")
    private Date createDate;
}
