package com.simplilearn.phase1_project;

import java.io.IOException;
import java.util.Scanner;

public class OptionOne {
	void optionOne() throws IOException{
		
		System.out.println("\n Select one of the given options:");
		System.out.println("1. Select 1 to Retrieve Files");
		System.out.println("2. Select 2 for More Business Operations");
		System.out.println("3. Select 3 Close Current Program");
		System.out.println();
		
		System.out.println("Enter your option here:");
		
		while(true){
			Scanner scanner = new Scanner(System.in);
			int input1 = scanner.nextInt();
			if(input1==1){
			RetrieveFiles ret = new RetrieveFiles();
			ret.retrieve();
			}
			else if(input1==2){
				System.out.println("1.Add File");
				System.out.println("2.Delete File");
				System.out.println("3.Search File");
				System.out.println("4.Main Menu");
				System.out.println("");
				System.out.println("Please select from above options to proceed ahead: ");
				
				int input2 = scanner.nextInt();
				if(input2==1){
					AddFile addFile = new AddFile();
					addFile.addFile();
				}
				else if(input2==2){
					DeleteFile delete = new DeleteFile();
					delete.deleteFiles();
				}
				else if(input2==3){
					SearchFile searchFile = new SearchFile();
					searchFile.searchFile();
				}
				else{
					optionOne();
				}
			}
			else{
				System.out.println("Program is Closed!! Start Again");
				System.out.println();
				
			}
			break;
		}
	}
}
