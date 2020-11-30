package com.producerrest.binding;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface RestSource {

	@Output("product-channel")
	public MessageChannel sendMessage();

}
