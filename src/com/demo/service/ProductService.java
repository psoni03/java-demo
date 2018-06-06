/**
 * 
 */
package com.demo.service;

import java.util.ArrayList;

import com.demo.model.Product;

/**
 * @author paaso
 *
 */
public class ProductService {
	
	ArrayList<Product> list = new ArrayList<Product>();
	
	ProductService(){
		Product product = new Product(100, "Book", 12.34);
		list.add(product);
		
	}

	public ArrayList<Product> getAllProducts() {
		
		return list;
		
	}
	
}
