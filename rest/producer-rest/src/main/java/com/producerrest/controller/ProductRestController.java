package com.producerrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.producerrest.binding.RestSource;
import com.producerrest.dto.Message;
import com.producerrest.entity.Product;
import com.producerrest.message.RestProducer;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	@Autowired
	private RestSource restSource;

	@Autowired
	private RestProducer restProducer;

	@PostMapping("/process")
	public ResponseEntity<Message> processProduct(@RequestBody Product product) {
		boolean result = restProducer.sendMessageProduct(product, restSource);

		Message messageResult = new Message("Operação realizada com sucesso? " + result);
		return ResponseEntity.ok(messageResult);
	}
}