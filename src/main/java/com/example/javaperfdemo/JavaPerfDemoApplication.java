package com.example.javaperfdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class JavaPerfDemoApplication {

	@Autowired
	private Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(JavaPerfDemoApplication.class, args);
	}
}
