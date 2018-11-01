package com.labs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KafkaWebRestApplication {
	
//	@Autowired
//	private KafkaCommandLine kafka;

	public static void main(String[] args) {
		SpringApplication.run(KafkaWebRestApplication.class, args);
	}
	
	
	@RequestMapping("/kafka")
	public void consumeKafka() {
		//kafka.consumer();
	}
}
