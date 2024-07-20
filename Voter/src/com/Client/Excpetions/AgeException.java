package com.Client.Excpetions;

@SuppressWarnings("serial")
public class AgeException extends Exception {
	int msg;
	public AgeException(int msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Age = "+msg + " can't be Less than 18 years";
	}
}