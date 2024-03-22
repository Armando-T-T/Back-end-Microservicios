package com.microservice.celulares.config;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
						.select()
						.apis(RequestHandlerSelectors.base Package("com.microservice.celulares.controllers"))
						.paths(PathSelectors.any())
						.build()
						.apiInfo (getapiInfo());
		}
	
	private ApiInfo getapi Info () {
	
	
	return new ApiInfo("Celulares",
			"Servicio para venta celulares",
			"1.0.0",
			"Terminos de servicios",
			new Contact ("Juan", "https://www.google.com", "juan.rejone@uanl.edu.mx"),
			"LISENSE",
			"license url",
			Collections.emptyList()
			);
	}
}
