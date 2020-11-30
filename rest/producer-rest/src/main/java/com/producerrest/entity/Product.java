package com.producerrest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

	private String name;

	private String category;

	private Double value;

	private Integer quantity;
}
