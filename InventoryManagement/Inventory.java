package com.InventoryManagement;
import java.util.*;
import com.InventoryManagement.Products;

public class Inventory {
public static void main(String[] args) {
	
	Products p1= new Products(11,"Soap",2000);
	Products p2= new Products(12,"Shoes",3000);
	Products p3= new Products(13,"Tshirt",4000);
	
	
	HashSet <Products> set=new HashSet();
	
   set.add(p1);
   set.add(p2);
   set.add(p3);
   
   System.out.println(set);
	
}
}
