package com.example.DYmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // 엔티티에 대한 생성일자, 수정일자 정보를 자동으로 처리하기 위한 애노테이션
public class DYmallApplication {

	public static void main(String[] args) {
		SpringApplication.run(DYmallApplication.class, args);
	}
}
