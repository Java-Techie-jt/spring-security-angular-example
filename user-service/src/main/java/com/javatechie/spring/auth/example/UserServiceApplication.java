package com.javatechie.spring.auth.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class UserServiceApplication {


	@GetMapping("/")
	public String login(){
		return "authenticated successfully" ;
	}

	@GetMapping("/getUsers")
	public List<User> getUsers(){
		return Stream.of(new User(108,"Santosh","santosh@gmail.com","9087654321"),
				new User(101,"Basant","basant@gmail.com","8867101121")).
				collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
