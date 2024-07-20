package com.Array1;

import java.util.Scanner;

public class Hobbies {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String name = null,hobbies;
	int s=4;
	String arr[]= new String [s];
	System.out.println("Enter name: ");
	name=sc.nextLine();
	arr[0]=name;
	System.out.println("Hobbies are : ");
	for (int i=1; i<s; i++)
	{
		hobbies=sc.nextLine();
		arr[i]=hobbies;
	}
	System.out.println("Name is : "+arr[0]);
	System.out.print("Hobbies are : ");
	for(int i=1; i<s; i++)
	{
		System.out.print(arr[i]+" ");
	}
	
			
}
}
