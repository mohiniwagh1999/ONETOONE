package com.map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.map.service.PersonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext c=
				SpringApplication.run(Application.class, args);
		
		PersonService p=c.getBean(PersonService.class);
		//p.savePerson();
		//p.getPerson();
		
		p.getPassport();
	}

}
