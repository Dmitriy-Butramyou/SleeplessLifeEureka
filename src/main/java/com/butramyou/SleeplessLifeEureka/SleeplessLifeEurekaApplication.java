package com.butramyou.SleeplessLifeEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SleeplessLifeEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleeplessLifeEurekaApplication.class, args);
	}

}
