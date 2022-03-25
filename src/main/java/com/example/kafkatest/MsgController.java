package com.example.kafkatest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class MsgController {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@GetMapping("/sendOrder")
	public void sendOrder(String msgId, String msg){
		kafkaTemplate.send("msg", msgId, msg);
	}
}
