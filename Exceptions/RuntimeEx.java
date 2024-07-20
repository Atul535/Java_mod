package com.Exceptions;

@SuppressWarnings("serial")
public class RuntimeEx extends RuntimeException{
	String msg;

	public RuntimeEx(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "RuntimeEx [msg= " + msg + "]";
	}
	
}