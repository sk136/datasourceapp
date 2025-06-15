package com.example.datasourceapp;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DatasourceappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatasourceappApplication.class, args);
	}

}
