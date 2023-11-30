package com.whizzy.rentcloud.configlocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigServer
public class ConfigLocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigLocalApplication.class, args);
	}

}
