package com.Client.voter;
import com.Client.Excpetions.AgeException;
import com.Client.Excpetions.NameException;
public class Voter {
	String name;
	int age;
	public Voter(String name, int age) throws AgeException{
		super();
		if(name.length()>20)
			throw new NameException(name);
		this.name = name;
		
		if(age<18)
			throw new AgeException(age);
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()>20)
			throw new NameException(name);
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws AgeException {
		if(age<18)
			throw new AgeException(age);
		this.age = age;
	}	
}