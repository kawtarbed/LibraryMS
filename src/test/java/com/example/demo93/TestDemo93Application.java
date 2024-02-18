package com.example.demo93;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestDemo93Application {

	public static void main(String[] args) {
		SpringApplication.from(Demo93Application::main).with(TestDemo93Application.class).run(args);
	}

}
