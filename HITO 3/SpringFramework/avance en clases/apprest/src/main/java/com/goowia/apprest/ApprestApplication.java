package com.goowia.apprest;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@Service
@SpringBootApplication
public class ApprestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApprestApplication.class, args);
	}
}