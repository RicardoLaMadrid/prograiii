package com.spring.demo;

import com.spring.demo.Services.ServicePersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private ServicePersona sPersona;
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Spring mode console running!!!");
		sPersona.Insertar("Ricardo");
	}
}
