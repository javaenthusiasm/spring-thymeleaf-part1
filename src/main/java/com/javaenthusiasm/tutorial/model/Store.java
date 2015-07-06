package com.javaenthusiasm.tutorial.model;

import java.util.List;
import java.util.ArrayList;


public class Store {

	private List<Product> products = new ArrayList<Product>();

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}	

	public void initialize(){
		
		Product item1 = new Product("Alvin","Eclair","$0.87");
		Product item2 = new Product("Alan","Jellybean","$3.76");
		Product item3 = new Product("Jonathan", "Lollipop", "$7.00");
		Product item4 = new Product("Shannon", "KitKat", "$9.99");
		
		this.products.add(item1);
		this.products.add(item2);
		this.products.add(item3);
		this.products.add(item4);
		
	}
}
