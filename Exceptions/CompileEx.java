package com.Exceptions;

@SuppressWarnings("serial")
public class CompileEx extends Exception{
	String msg;
	public CompileEx(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "CompileEx [msg= " + msg + "]";
	}
}
