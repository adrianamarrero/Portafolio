package com.adrianamarreroportafolio.portafolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan ("com.adrianamarreroportafolio.portafolio.Repository.IUserRepository")

public class PortafolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortafolioApplication.class, args);
                System.out.print("Funciona");
	}

}
