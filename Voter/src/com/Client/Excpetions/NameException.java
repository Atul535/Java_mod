package com.Client.Excpetions;

@SuppressWarnings("serial")
public class NameException extends RuntimeException{
	String msg;
	public NameException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg + "  can't be Less than 18 years can't be greater than 20 characters long";
	}
}