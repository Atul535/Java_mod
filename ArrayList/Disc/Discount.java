package com.ArrayList.Disc;

import java.util.ArrayList;
import java.util.Iterator;

import com.ArrayList.Customer;

public class Discount {
	public static void main(String[] args) {
		Customer c1= new Customer("Atul",2000,23,"Male");
		Customer c2= new Customer("Archana",3000,21,"Female");
		Customer c3= new Customer("Prashant",4000,20,"Male");
		Customer c4= new Customer("Jaya",2000,55,"Female");

		ArrayList<Customer>list=new ArrayList<Customer>();
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		
		ArrayList<Customer>male=new ArrayList<Customer>();
		ArrayList<Customer>female=new ArrayList<Customer>();
		for(int i=0; i<list.size();i++)
		{
			if(list.get(i).getGender()=="Male")
			{ 
				male.add(list.get(i));
			}
			else
				female.add(list.get(i));	
			
		}
		Iterator itr=male.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		itr=female.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
