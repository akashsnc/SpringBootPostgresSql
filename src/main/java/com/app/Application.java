package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/*@Bean
	CommandLineRunner commandLineRunner(StudentRepository repo) {
		return args -> {
			repo.save(new Student("Rushikesh", "Shibe", "rushi@gmail.com", 26));
		};
	}*/
}
