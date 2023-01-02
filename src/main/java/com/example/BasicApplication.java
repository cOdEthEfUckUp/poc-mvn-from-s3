package com.example;

import app.goog1e.Something;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicApplication.class, args);

		Something something = new Something(678);
		System.out.println(
			something.getX()
		);
	}
}
