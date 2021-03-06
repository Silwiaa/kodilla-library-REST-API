package kodilla.com.library.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BorrowDto {

    private Long id;
    private Date borrowDate;
    private Date returnDate;
}
