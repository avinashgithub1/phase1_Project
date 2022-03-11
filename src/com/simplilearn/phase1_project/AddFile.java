package com.simplilearn.phase1_project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {
		void addFile() throws IOException{
			System.out.println("Enter the file name:");
			Scanner sc1 = new Scanner(System.in);
			String fileName = sc1.nextLine();
			File file = new File("C://Users/hp/Desktop/avi/Java_Home/Phase1_project/ABC/"+fileName);
			boolean isFileCreated = false;
			try {
				isFileCreated = file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(isFileCreated){
				System.out.println(fileName+" file is created");
			}else {
				System.out.println(fileName+" file already exists");
			}
			/*This is to go to main menu after add operation is performed
			 * System.out.println("Returing to Main Menu");
			OptionOne opt =  new OptionOne();
			opt.optionOne();*/
		}	
}