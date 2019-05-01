package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.remote.GhibliApi;
import com.example.demo.resolver.QueryResolver;
import com.example.demo.resolver.PersonResolver;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public PersonResolver personResolver(GhibliApi ghibliApi) {
		return new PersonResolver(ghibliApi);
	}

	@Bean
	public QueryResolver query(GhibliApi ghibliApi) {
		return new QueryResolver(ghibliApi);
}
}
