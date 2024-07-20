package com.Map;
import java.util.*;
public class HashMapEx {
public static void main(String[] args) {
	HashMap<String,Integer> m= new HashMap();
//	m.put("Atul", 01);
//	m.put("Prashant", 01);
//	m.put("Angel", 02);
	
	m.put("Abc", 700);
	m.put("xyz", 800);
	m.put("KLM", 800);
	System.out.println(m);
	Set<String> s= m.keySet();
	System.out.println(s);
	
	Set s1 = m.entrySet();
	System.out.println(s1);
	
	Collection c = m.values();
	System.out.println(c);
	
}
}
