package com.practive.InterviewPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class InterviewPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPracticeApplication.class, args);
	}

}
