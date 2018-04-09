package rt.eureka;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import rt.eureka.db.UslugaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaUslugaTest {
	
	@Autowired
	UslugaRepository uslugaRepository;

	@Test
	public void testFindAll() {
		
		assertThat(uslugaRepository.findAll()).isNotNull() ;
		assertThat( uslugaRepository.findAll().size()).isEqualTo(2);
	}

}
