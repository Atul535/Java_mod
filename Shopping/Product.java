package com.Shopping;

public class Product {
	String name;
	int id;
	double price;
	public Product(String name, int id, double price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product name=" + name + ", id=" + id + ", price=" + price +"\n";
	}
	
	
}
