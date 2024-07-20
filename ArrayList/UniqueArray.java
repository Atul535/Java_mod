package com.ArrayList;
import java.util.*;
public class UniqueArray {
public static void main(String[] args) {
	ArrayList<Integer> list= new ArrayList();
	list.add(1);
	list.add(3);
	list.add(1);
	list.add(2);
	list.add(4);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(4);
	list.add(5);
	
	//HashSet<Integer> set = new HashSet<>();
	LinkedHashSet<Integer>set=new LinkedHashSet();
    set.addAll(list);
    System.out.println(set);
    
    HashMap<Integer,Integer> map= new HashMap();
    for(int i=0; i<list.size(); i++)
    {
    	if(map.containsKey(list.get(i)))
    	{
    		map.put(list.get(i), map.get(list.get(i))+1);
    	}
    	else
    	{
    		map.put( list.get(i), 1);
    	}
    }
    
	System.out.println(map);

	
}
}
