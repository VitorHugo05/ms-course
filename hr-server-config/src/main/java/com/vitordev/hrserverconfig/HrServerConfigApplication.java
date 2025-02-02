package com.vitordev.hrserverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HrServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrServerConfigApplication.class, args);
	}

}
