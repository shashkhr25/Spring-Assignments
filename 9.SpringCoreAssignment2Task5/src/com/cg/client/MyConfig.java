package com.cg.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cg.service.CarService;
import com.cg.service.carFactory;

@Configuration
public class MyConfig {

	@Bean(name="bean1")
	public carFactory getCar() {
		return new carFactory();
	}
	
	@Bean(name="bean2")
	public CarService getCar2() {
		return new CarService();
	}
}
