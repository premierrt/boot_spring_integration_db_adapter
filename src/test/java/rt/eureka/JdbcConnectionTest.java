package rt.eureka;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.annotation.JsonFormat.Value;

@RunWith(SpringRunner.class)
@SpringBootTest
//@JdbcTest
public class JdbcConnectionTest {
	
	private static Log log = LogFactory.getLog(JdbcConnectionTest.class);
	private static String expectedNazwaUslugi = "usluga glowna1";
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Test
	public void test() {
		log.info("**************************** testy ");
		int result = jdbcTemplate.queryForObject(
			    "SELECT COUNT(*) FROM USLUGA", Integer.class);		
		assertEquals(result, 2);
	}
	
	@Test
	public void testName() {
		log.info("**************************** testy ");
		String result = jdbcTemplate.queryForObject(
			    "SELECT NAME FROM USLUGA WHERE id=?", new Object[]{1}, String.class);		
		assertThat(result).isEqualTo(expectedNazwaUslugi);
	}

}
