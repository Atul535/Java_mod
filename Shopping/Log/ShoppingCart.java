package com.Shopping.Log;

import java.util.*;


import com.Shopping.Product;

public class ShoppingCart {
	public static void main(String[] args) {
		Product p1= new Product("Soap",11,2000);
		Product p2= new Product("Shoes",12,3000);
		Product p3= new Product("Tshirt",13,4000);
		HashSet<Product> set= new HashSet<Product>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		//set.remove(p1);
		System.out.println(set);
		double prc= p1.getPrice()+p2.getPrice()+p3.getPrice();
		
		System.out.println("Total Price = "+prc);
		
		
	}
	
}
		
	