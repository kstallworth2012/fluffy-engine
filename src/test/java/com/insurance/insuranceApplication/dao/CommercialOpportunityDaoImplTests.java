import junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMock;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

@ExtendWith(MockitoExtension.class)
public class CommercialOpportunityDaoImplTests{
	
   @Mock
   private JdbcTemplate _jdbcTemplate;

   @InjectMocks
   private CommercialOpportunityDaoImpl underTest

}