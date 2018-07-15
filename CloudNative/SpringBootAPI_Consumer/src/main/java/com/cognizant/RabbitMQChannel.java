package com.cognizant;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface RabbitMQChannel {
	String PN_INPUT="customer_consumer";
	@Input(RabbitMQChannel.PN_INPUT)
	SubscribableChannel consumer();
}
