package com.example.kafkatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
@SpringBootApplication
public class KafkaTestApplication {

	@KafkaListener(topics="msg")
	public void msgListener(String msg){
		System.out.println(msg);
	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaTestApplication.class, args);
	}

}
