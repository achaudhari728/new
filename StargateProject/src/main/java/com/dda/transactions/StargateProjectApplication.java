package com.dda.transactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class StargateProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StargateProjectApplication.class, args);
	}
}
