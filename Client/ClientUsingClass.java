package com.Client;

import com.Client.Operations.DivideClass;
import com.Exceptions.CompileEx;
import com.Exceptions.RuntimeEx;

public class ClientUsingClass {
	public static void main(String[] args) {
		String str = null;
		System.out.println(str);
		
		DivideClass objD=new DivideClass(12,5);

		try {
			System.out.println(objD.getDivide());
		} catch (CompileEx e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("--- END --- ");
	}
}
