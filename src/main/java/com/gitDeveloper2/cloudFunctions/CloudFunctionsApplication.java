package com.gitDeveloper2.cloudFunctions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CloudFunctionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudFunctionsApplication.class, args);

	}


}
