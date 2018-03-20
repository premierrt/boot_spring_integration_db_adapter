package rt.eureka.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rt.eureka.services.KomponentGateway;
import rt.eureka.services.KomponentService;


@Service
public class DemoKomponentyService implements KomponentService  {

	 
	private KomponentGateway komponentGateway ;
	
	@Autowired
	public DemoKomponentyService(KomponentGateway komponentGateway){
		this.komponentGateway =komponentGateway;
	}
	
	
	
	/* (non-Javadoc)
	 * @see rt.eureka.demo.KomponentService#saveKomponent(java.lang.String)
	 */
	@Override
	public void saveKomponent(String name) {
		komponentGateway.saveKomponent(name);
		
	}

}
