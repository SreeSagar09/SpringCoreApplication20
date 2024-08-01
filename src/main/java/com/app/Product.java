package com.app;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Product {
	
	@PostConstruct
	public void productPostConstruct() {
		System.out.println("From productPostConstruct method in Product class");
	}
	
	@PreDestroy
	public void productPreDestroy() {
		System.out.println("From productPreDestroy method in Product class");
	}

}
