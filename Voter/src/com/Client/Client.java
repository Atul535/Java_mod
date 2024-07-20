package com.Client;

import com.Client.Excpetions.AgeException;
import com.Client.Excpetions.NameException;
import com.Client.voter.Voter;

public class Client {

	public static void main(String[] args){
		Voter v1;
		try {
			v1 = new Voter("abc",23);
			System.out.println(v1.getName());
			System.out.println(v1.getAge());
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (NameException e) {
			System.out.println(e);
		}
		System.out.println("--End--");
	}

}
