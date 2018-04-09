package rt.eureka.db;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UslugaRepository extends CrudRepository<Usluga, Integer>{

	
	public List<Usluga> findAll();
}
