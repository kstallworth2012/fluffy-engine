import junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMock;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

@ExtendWith(MockitoExtension.class)
public class QuoteDaoImplTests{
	
   @Mock
   private JdbcTemplate _jdbcTemplate;

   @InjectMocks
   private QuoteDaoImpl underTest

}