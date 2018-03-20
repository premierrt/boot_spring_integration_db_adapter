package rt.eureka.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/komponent")
public class DemoAddKomponetRestController {
	
	private static Log log = LogFactory.getLog(DemoKomponentyService.class);
	
	@Autowired
	private DemoKomponentyService demoKomponentyService;

	@RequestMapping(method=RequestMethod.POST)
	public void addKomponent(String name){
		log.info("jedzie addKomponent" );
		demoKomponentyService.saveKomponent(name);
		
	}
}
