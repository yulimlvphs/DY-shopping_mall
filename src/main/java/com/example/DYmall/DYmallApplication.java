package com.example.DYmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.DYmall", "com.example.DYmall.Member"})

public class DYmallApplication {
	public static void main(String[] args) {
		SpringApplication.run(DYmallApplication.class, args);
	}

}
