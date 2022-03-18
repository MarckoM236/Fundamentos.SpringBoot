package com.Fundamentos.SpringBoot.Fundamentos;

import com.Fundamentos.SpringBoot.Fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;

import com.Fundamentos.SpringBoot.Fundamentos.component.ComponentTwoImplement;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	//objeto de la interfaz ComponentDependency
	private ComponentDependency componentDependency;

	//constructor de la clase
	//@Qualifier("componentTwoImplement") define que implemtacion utilizar
	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency){
		this.componentDependency = componentDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	//Implementacion metodo de la interfaz CommandlineRunner (ejecutar)
	@Override
	public void run(String... args) throws Exception {
		//Ejecutar la implementacion
		componentDependency.saludar();

	}
}
