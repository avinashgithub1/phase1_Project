package com.simplilearn.phase1_project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SearchFile  {
		
	void searchFile() throws IOException{
		
			System.out.println("Enter file name to begin search: ");
			Scanner scanner = new Scanner(System.in);
			String filename = scanner.nextLine();
			File directory = new File("C://Users/hp/Desktop/avi/Java_Home/Phase1_project/ABC/");
			String[] flist = directory.list();
			int flag = 0;
			if (flist == null) {
					System.out.println("The Directory is Empty!!");
			}else {
				for (int i = 0; i < flist.length; i++) {
					String file1= flist[i];
							if (file1.equals(filename)) {
								System.out.println(filename + " file is found");
								flag = 1;
							}
					}
				}
					if (flag == 0) {
						System.out.println("File Not Found!!");	
					}
					System.out.println("Returning to Main Menu");
					OptionOne opt =  new OptionOne();
					opt.optionOne();
		}
}
