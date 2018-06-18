package com.travel.angular.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.travel.angular.model.Links;
import com.travel.angular.resource.TimeTravelResource;

@SpringBootApplication
@ComponentScan(basePackageClasses=TimeTravelResource.class)
@ComponentScan(basePackageClasses=Links.class)
//@EnableAutoConfiguration(exclude = { JacksonAutoConfiguration.class })
public class TimeTravelApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeTravelApplication.class, args);
	}
}
