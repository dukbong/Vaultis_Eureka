package com.vaultis.vaultis_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class VaultisEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaultisEurekaApplication.class, args);
	}

}
