package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
public static void main(String[] args) {
	ArrayList Alist;
//	ArrayList<String> Alist;   //<string> - generic
	Alist =new ArrayList(); //creating arraylist
	Alist.add(1);      //Addinbg object in arraylist
	Alist.add("Vijay");
	Alist.add("Ravi");
	Alist.add("Ajay");
	//Traversing list through iterator
	Iterator itr=Alist.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
