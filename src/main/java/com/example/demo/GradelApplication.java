package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GradelApplication {
@RequestMapping("/vedikas")
public String test() {
	return "vedikas";
}
	public static void main(String[] args) {
		SpringApplication.run(GradelApplication.class, args);
		GradelApplication g=new GradelApplication();
		g.test();
	}

}
