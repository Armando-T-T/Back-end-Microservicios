package com.microservice.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootMicroserviceStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicroserviceStoreApplication.class, args);
	}

}
