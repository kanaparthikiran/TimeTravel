package com.travel.angular.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.travel.angular.resource.TimeTravelResource;

@SpringBootApplication
@ComponentScan(basePackageClasses=TimeTravelResource.class)
public class TimeTravelApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeTravelApplication.class, args);
	}
}
