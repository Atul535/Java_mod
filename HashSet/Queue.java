package com.HashSet;
import java.util.*;
public class Queue {
public static void main(String[] args) {
	//Creating Hashset and adding elements
	HashSet <String>set= new HashSet();
	set.add("Ravi");
	set.add("Vijay");
	//set.add("Ravi");
	set.add("Ajay");
	//Traversing elements
	Iterator<String>itr=set.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}