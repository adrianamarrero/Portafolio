package com.adrianamarreroportafolio.portafolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan ({"com.adrianamarreroportafolio.portafolio.Controller.UserController", "com.adrianamarreroportafolio.portafolio.Interface.IUserService","com.adrianamarreroportafolio.portafolio.Repository.IUserRepository", "com.adrianamarreroportafolio.portafolio.Repository.IEducationRepository", "com.adrianamarreroportafolio.portafolio.Repository.IExperienceRepository", "com.adrianamarreroportafolio.portafolio.Repository.IProjectsRepository", "com.adrianamarreroportafolio.portafolio.Repository.ISkillsRepository", "com.adrianamarreroportafolio.portafolio.Services.ImpUserService"})


public class PortafolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortafolioApplication.class, args);
                System.out.print("Funciona");
	}

}
