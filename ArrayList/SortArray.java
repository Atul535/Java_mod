package com.ArrayList;
import java.util.*;
public class SortArray {
public static void main(String[] args) {
	ArrayList<Integer> arr= new ArrayList();
	
	int temp=0;
	arr.add(5);
	arr.add(0);
	arr.add(2);
	arr.add(0);
	arr.add(2);
	arr.add(0);
	arr.add(0);
	arr.add(5);
	arr.add(0);
	arr.add(1);
	
	for(int i=0; i<arr.size(); i++)
	{
		if(arr.get(i)==0)
		{
			arr.remove(i);
			arr.add(0);
		}
	}
	
		System.out.println(arr);
}
}
