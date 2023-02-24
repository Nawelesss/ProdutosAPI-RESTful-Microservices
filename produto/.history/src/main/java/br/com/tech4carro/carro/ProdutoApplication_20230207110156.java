package br.com.tech4carro.carro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CarroApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarroApplication.class, args);
	}

}
