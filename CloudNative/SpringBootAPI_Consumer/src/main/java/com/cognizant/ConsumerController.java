package com.cognizant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

import com.fasterxml.jackson.databind.ObjectMapper;

@EnableBinding(RabbitMQChannel.class)
//@RefreshScope
public class ConsumerController {
	@StreamListener(RabbitMQChannel.PN_INPUT)
	public void messgaeConsumer(String message){
		
		System.out.println("Printing URL:");
		System.out.println("Consumed Message from RabbitMq-Payload = "+message);
	}
}
