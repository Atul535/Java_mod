package com.Queue.PriorityQueue;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import com.ArrayList.Customer;

class CustComp implements Comparator<Customer>
{

	@Override
	public int compare(Customer o1, Customer o2) {
		
		return (o1.getPa() - o2.getPa());
	}
	
}

public class CustomerSort {
public static void main(String[] args) {
	Queue<Customer> lstCust= new PriorityQueue<Customer>(new CustComp());
	lstCust.add(new Customer ("Atul",2000,23,"Male"));
	lstCust.add(new Customer ("Archana",3000,21,"Female"));
	lstCust.add(new Customer ("Prashant",4000,20,"Male"));
	lstCust.add(new Customer ("Jaya",2000,55,"Female"));
	 
	 
	 while(!lstCust.isEmpty())
	 {
		 System.out.println(lstCust.poll());
	 }
}
}



