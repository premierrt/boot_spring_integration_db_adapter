package rt.eureka;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import rt.eureka.services.KomponentGateway;

@RunWith(SpringRunner.class)
@JdbcTest
public class GatewayTest {

	
	@Autowired
	KomponentGateway cssService;
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	
	@Test
	public void test() {
		cssService.saveKomponent("dupa");
		String result = jdbcTemplate.queryForObject(
			    "SELECT NAME FROM USLUGA WHERE id=?", new Object[]{2}, String.class);		
		assertEquals(result, "dupa");
	}

}
