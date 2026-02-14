package com.cibertron.api_gateway_cibertron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiGatewayCibertronApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayCibertronApplication.class, args);
	}

}
