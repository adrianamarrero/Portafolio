package com.adrianamarreroportafolio.portafolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan ({"com.adrianamarreroportafolio.portafolio.Repository.IUserRepository", "com.adrianamarreroportafolio.portafolio.Repository.IEducationRepository", "com.adrianamarreroportafolio.portafolio.Repository.IExperienceRepository", "com.adrianamarreroportafolio.portafolio.Repository.IProjectsRepository", "com.adrianamarreroportafolio.portafolio.Repository.ISkillsRepository"})
//@ComponentScan (basePackages = "com.adrianamarreroportafolio.portafolio.*")//
//@ComponentScan("com.adrianamarreroportafolio.portafolio")
public class PortafolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortafolioApplication.class, args);
                System.out.print("Funciona");
	}

}
