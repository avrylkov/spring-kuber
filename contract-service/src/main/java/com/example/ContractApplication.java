package com.example;

import com.example.model.Contract;
import com.example.repository.ContractRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
@EnableDiscoveryClient
public class ContractApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContractApplication.class, args);
	}

	@Bean
	ContractRepository repository() {
		ContractRepository repository = new ContractRepository();
		repository.add(new Contract(1L, "N 001", 100L, new Date()));
		repository.add(new Contract(2L, "N 111", 100L, new Date()));
		repository.add(new Contract(3L, "N 1014", 101L, new Date()));
		repository.add(new Contract(4L, "N 2315", 101L, new Date()));
		return repository;
	}


}
