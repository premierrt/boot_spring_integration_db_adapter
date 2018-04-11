package rt.eureka;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import rt.eureka.db.Usluga;
import rt.eureka.db.UslugaRepository;


/**
 * https://stackoverflow.com/questions/41343822/setting-up-custom-scheme-using-datajpatest
 * @author rafal
 *
 */
@RunWith(SpringRunner.class)
//@SpringBootTest
@DataJpaTest
public class JpaUslugaTest {
	
	
	@Autowired
	UslugaRepository uslugaRepository;
	
	@Autowired
    TestEntityManager entityManager;
	
	
	private Usluga usluga;
	
	@Before
	public void setup(){
		 usluga = new Usluga();
		usluga.setName("usluga glowna1");
		entityManager.persist(usluga);
	}

	@Test
	public void testFindById(){
		 uslugaRepository.findAll().stream().map( l ->l.getId()).forEach(l -> System.out.println(l.toString()));
		assertThat(uslugaRepository.findById(new Integer(2)).getId()).isEqualTo(2);
		
	}
	
	@Test
	public void testFindAll() {
		
		assertThat(uslugaRepository.findAll()).isNotNull() ;
		/// nie dziala - zwraca 0???
		assertThat( uslugaRepository.findAll().size()).isEqualTo(1);
	}
	
	

}
