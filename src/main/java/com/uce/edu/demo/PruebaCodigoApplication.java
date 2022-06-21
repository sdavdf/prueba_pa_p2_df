package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.agencia.service.IFachadaMatriculaService;

@SpringBootApplication
public class PruebaCodigoApplication implements CommandLineRunner{
	
	@Autowired
	private IFachadaMatriculaService fachadaMatriculaService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaCodigoApplication.class, args);
	}	
	@Override
	public void run(String... args) throws Exception {
			
		
	this.fachadaMatriculaService.matricularVehiculo("0401754601", "HCT");

		
		
	}

}
