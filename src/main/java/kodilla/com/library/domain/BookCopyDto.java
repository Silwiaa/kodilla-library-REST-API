package kodilla.com.library.domain;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookCopyDto {

    private Long id;
    private Long idTitle;
    private String status;
}
