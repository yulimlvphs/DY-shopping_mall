package com.example.DYmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // 엔티티에 대한 생성일자, 수정일자 정보를 자동으로 처리
@ComponentScan(basePackages = {"com.example.DYmall", "com.example.DYmall.Member"}) // 클래스 경로 바로잡기 위함
public class DYmallApplication {
	public static void main(String[] args) {
		SpringApplication.run(DYmallApplication.class, args);
	}
}