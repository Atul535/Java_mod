package com.HashSet;
import java.util.*;

public class SortSet {
public static void main(String[] args) {
	SortedSet<String> set = new TreeSet();
	set.add("One");
	set.add("Two");
	set.add("Three");
	set.add("Four");
//	set.add("Five");
	set.add("Five");
	System.out.println("Sorted : "+set);
	System.out.println(set.first());
	System.out.println(set.last());
	System.out.println("Headset : "+set.headSet("One"));
	System.out.println("Tailset : "+set.tailSet("One"));
	System.out.println("Subset : "+set.subSet("One","Two"));
	System.out.println("Comparator : "+set.comparator());
	
	set.remove("Five");
	
	
	
	System.out.println("After removing -"+ set);
	Iterator<String>i=set.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
		
	}
}
}
