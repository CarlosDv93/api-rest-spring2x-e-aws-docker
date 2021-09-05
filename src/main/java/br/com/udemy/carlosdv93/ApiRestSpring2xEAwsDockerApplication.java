package br.com.udemy.carlosdv93;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ApiRestSpring2xEAwsDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestSpring2xEAwsDockerApplication.class, args);
	}

}
