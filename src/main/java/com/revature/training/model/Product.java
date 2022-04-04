package com.revature.training.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Min(value = 200)
	private int productId;

	@Size(min = 5, max = 20, message = "Please enter between {min} and {max} characters.")
	private String productName;

	private int quantityOnHand;

	private int price;

}
