package com.producerrest.message;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import com.producerrest.binding.RestSource;
import com.producerrest.entity.Product;

@Component
public class RestProducer {

	public boolean sendMessageProduct(Product payload, RestSource restSource) {
		Message<Product> message = MessageBuilder.withPayload(payload).build();
		boolean success = restSource.sendMessage().send(message);
		return success;
	}

}