package com.mio.usaurioservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class UsaurioServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsaurioServiceApplication.class, args);
	}

}
