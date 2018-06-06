/**
 * 
 */
package com.demo.main;

import com.demo.model.Product;
import com.demo.service.ProductService;

/**
 * @author paaso
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductService service = new ProductService();
		ArrayList<Product> list = service.getAllProducts();
		
		list.forEach(System.out::println);

	}

}
