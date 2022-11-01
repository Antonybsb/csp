package com.api.csp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.api.csp.model.Cliente;
import com.api.csp.repository.ClienteRepository;

@SpringBootApplication
public class CspApplication {

	public static void main(String[] args) {
		SpringApplication.run(CspApplication.class, args);
	}

}
