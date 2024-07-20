package com.Array1;

import java.util.Scanner;

public class Result {
public static void main(String[] args) {
	int a=2,b=3;
	int ttlm=0,avg=0;
	int arr[][]=new int[a][b];
	Scanner sc =new Scanner(System.in);
	for(int i=0; i<a; i++)
	{
		System.out.println("Enter marks of Student "+(i+1)+" : ");
		for(int j=0; j<b; j++)
		{
			System.out.print("Enter marks of Subject "+(j+1)+" : ");
			arr[i][j]=sc.nextInt();
		}
		System.out.println();
	}
	
	for(int i=0; i<a; i++)
	{
		for(int j=0; j<b; j++)
		{
			ttlm+=arr[i][j];
			avg=ttlm/b;
		}
		System.out.println("Total marks of Student "+(i+1)+" : "+ttlm);
		System.out.println("Average marks of Student "+(i+1)+" : "+avg);
		ttlm=0;
		avg=0;
		
	}
	
}
}
