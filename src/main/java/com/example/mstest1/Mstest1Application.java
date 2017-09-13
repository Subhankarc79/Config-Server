package com.example.mstest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Mstest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Mstest1Application.class, args);
	}
}
