package com.kaspperacademy.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Olá Mundo! SpringBoot";
	}

}
