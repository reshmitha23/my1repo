package com.medicine;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class MedicareUserCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicareUserCartApplication.class, args);
		System.out.println("user service");
	}

}
