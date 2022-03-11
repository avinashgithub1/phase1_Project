package com.simplilearn.phase1_project;

import java.io.IOException;

public class LockerMe {
		
	void welcome(){
		System.out.println("Welcome to LockersMe.com");
		System.out.println("Developer Name: V Avinash ");
		System.out.println("EmailMe@: avinashgoud98765@gmail.com");
		System.out.println();
		System.out.println();
	}
	public static void main(String[] args) throws IOException {
		LockerMe lockerMe = new LockerMe();
		lockerMe.welcome();
		OptionOne opt =  new OptionOne();
		opt.optionOne();
	}
}
