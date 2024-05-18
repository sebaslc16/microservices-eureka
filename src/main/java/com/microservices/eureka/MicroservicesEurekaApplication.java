package com.microservices.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// Habilitar proyecto como eureka server
@EnableEurekaServer
@SpringBootApplication
public class MicroservicesEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesEurekaApplication.class, args);
	}

}
