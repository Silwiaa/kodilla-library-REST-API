package kodilla.com.library.domain;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TitleDto {

    private Long id;
    private String author;
    private int publicationYear;
}
