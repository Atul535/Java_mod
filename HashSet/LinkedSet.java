package com.HashSet;
import java.util.*;
//for sorted hashset
public class LinkedSet {
public static void main(String[] args) {
	LinkedHashSet<String>set=new LinkedHashSet();
	set.add("One");
	set.add("Two");
	set.add("Three");
	set.add("Four");
//	set.add("Five");
	set.add("Five");
	Iterator<String>i=set.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
