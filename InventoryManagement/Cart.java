package com.InventoryManagement;
import java.util.*;
import com.InventoryManagement.Products;

public class Cart {
public static void main(String[] args) {
	
	Products p1= new Products(11,"Soap",2000);
	Products p2= new Products(12,"Shoes",3000);
	Products p3= new Products(13,"Tshirt",4000);
	Products p4= new Products(14,"Perfume",4000);
	
	HashMap<Integer,Products> map= new HashMap();
	map.put(p1.getId(), p1);
	map.put(p2.getId(), p2);
	map.put(p3.getId(), p3);
	map.put(p4.getId(), p4 );
	
	System.out.println(map);
}
}
