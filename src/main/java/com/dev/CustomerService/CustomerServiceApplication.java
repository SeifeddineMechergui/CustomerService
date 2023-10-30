package com.dev.CustomerService;

import com.dev.CustomerService.entity.customer;
import com.dev.CustomerService.repositories.customerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(customerRepository customerrepository){
		return args -> {
			customerrepository.save(new customer(null,"FSB","contact@fsb.tn"));
			customerrepository.save(new customer(null,"ISETB","contact@isetb.tn"));
			customerrepository.save(new customer(null,"FST","contact@fst.tn"));
			customerrepository.findAll().forEach(System.out::println);
		};
	}

}
