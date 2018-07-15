package com.cvs.specialty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAutoConfiguration
@EnableAdminServer
public class SpringBootAdmin {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdmin.class, args);
	}
}
