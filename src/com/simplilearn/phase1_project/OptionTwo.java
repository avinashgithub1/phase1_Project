package com.simplilearn.phase1_project;

import java.io.IOException;
import java.util.Scanner;

public class OptionTwo {
	
	void optionTwo() throws IOException{
	System.out.println("1.Add File");
	System.out.println("2.Delete File");
	System.out.println("3.Search File");
	System.out.println("4.Main Menu");
	System.out.println("");
	
	Scanner scanner1 = new Scanner(System.in);
	int input2 = 0;
	boolean b= true;
	
	while(b){
		try{
			System.out.println("Enter your option:");
			input2 = scanner1.nextInt();
			b= false;
		}catch (Exception e) {
			System.out.println("Invalid Input");
			scanner1.next();
		}
	}
	
	if(input2==1)
	
	{
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
		OptionOne optOne = new OptionOne();
		optOne.optionOne();
		}
	}
}

