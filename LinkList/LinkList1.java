package com.LinkList;
import java.util.*;
public class LinkList1 {
public static void main(String[] args) {
	LinkedList<Double>list;
	list=new LinkedList<Double>();
	list.add(32.32);
	list.add(44.32);
	list.add(12.32);
	list.add(43.32);
	//Traversing list through iterator
	Iterator itr= list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
