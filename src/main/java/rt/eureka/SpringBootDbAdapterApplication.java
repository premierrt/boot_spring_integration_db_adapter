package rt.eureka;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import rt.eureka.services.KomponentGateway;

@SpringBootApplication
@ImportResource({"classpath:springintegration-config.xml"})
public class SpringBootDbAdapterApplication {


	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDbAdapterApplication.class, args);
		
	}
}
