package com.simplilearn.phase1_project;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OptionOne {
	void optionOne() throws IOException, InputMismatchException{
		
		
		System.out.println("1. Select 1 to Retrieve Files");
		System.out.println("2. Select 2 for More Business Operations");
		System.out.println("3. Select 3 Close Current Program");
		System.out.println();
	
		int input1 = 0;
		while(true){
			Scanner scanner = new Scanner(System.in);
			boolean a = true;
			while(a){
			try{
				System.out.println("Enter your option here:");
				
			    input1 = scanner.nextInt();
			    a=false;
			}catch (InputMismatchException e) {
				System.out.println("Invalid Input ");
				scanner.next();
			}
			}
			if(input1==1)
			{
			RetrieveFiles ret = new RetrieveFiles();
			ret.retrieve();
			}
			else if(input1==2){
				OptionTwo opt2 = new OptionTwo();
				opt2.optionTwo();
			}
			
			else if(input1 == 3){
			System.out.println("Program is Closed!! Start Again");
			System.out.println();
			}
			
			break;
			}
		}
	}
			
			
