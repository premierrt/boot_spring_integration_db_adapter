package rt.eureka.services;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service("fileToStringService")
public class FileToStringService {
private static final Log log=LogFactory.getLog(FileToStringService.class);
	
	public void processFile(String fileAsString){
		log.info("************************** processFile SA ****************");
		System.out.println(fileAsString.toString());
	}
}
