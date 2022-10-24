package com.nation.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class NationApplication {

	public static void main(String[] args) {
		SpringApplication.run(NationApplication.class, args);
	}

}
