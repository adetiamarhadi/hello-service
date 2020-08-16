package com.github.adetiamarhadi.springcloudhelloservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpringCloudHelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHelloServiceApplication.class, args);
	}

	@GetMapping
	public String hello(@RequestHeader("x-location") final String location) {
		return "Hello from "+location+" !";
	}

}
