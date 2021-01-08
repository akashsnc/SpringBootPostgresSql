package com.app;

import com.app.model.Student;
import com.app.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
