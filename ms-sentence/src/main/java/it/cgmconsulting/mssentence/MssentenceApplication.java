package it.cgmconsulting.mssentence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MssentenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MssentenceApplication.class, args);
	}

}
