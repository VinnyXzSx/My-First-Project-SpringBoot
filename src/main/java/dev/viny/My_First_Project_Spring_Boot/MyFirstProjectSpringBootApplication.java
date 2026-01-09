package dev.viny.My_First_Project_Spring_Boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class MyFirstProjectSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectSpringBootApplication.class, args);
		System.out.println("Hello Worl");
	}

}
