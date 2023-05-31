package com.example.springbootblogrestapi;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * The type Springboot blog rest api application.
 */
@SpringBootApplication
public class SpringbootBlogRestApiApplication {


	/**
	 * Model mapper model mapper.
	 *
	 * @return the model mapper
	 */
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}



	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootBlogRestApiApplication.class, args);
	}


}
