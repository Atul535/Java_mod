package com.ArrayList;

public class Customer implements Comparable<Customer> {
String name;
int pa,age;
String gender;
public Customer(String name, int pa, int age, String gender) {
	super();
	this.name = name;
	this.pa = pa;
	this.age = age;
	this.gender = gender;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPa() {
	return pa;
}

public void setPa(int pa) {
	this.pa = pa;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

@Override
public String toString() {
	if(pa>2000 && age<50)
	{
		double pa2=pa-(pa*0.02);
		return "Customer [name=" + name + ", pa after discount=" + pa2 + ", age=" + age + ", gender="+gender+"]";
	}
	return "Customer [name=" + name + ", pa=" + pa + ", age=" + age + ", gender=" + gender + "]";
}

@Override
public int compareTo(Customer o) {
	
	return o.getAge()-this.getAge();
}



}
