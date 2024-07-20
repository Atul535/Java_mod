package com.Client.Operations;

import com.Exceptions.CompileEx;
public class DivideClass {
	int a,b;

	public DivideClass(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getDivide() throws CompileEx{
		if(b==5)
			throw new CompileEx("not Div by ny 5");
		return a/b;			
	}
}
