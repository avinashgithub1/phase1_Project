package com.simplilearn.phase1_project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DeleteFile {
	void deleteFiles() throws IOException{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter file name to be deleted: ");
			String fileName = sc.nextLine();
			File directory = new File("C://Users/hp/Desktop/avi/Java_Home/Phase1_project/ABC/");
			File file = new File("C://Users/hp/Desktop/avi/Java_Home/Phase1_project/ABC//"+fileName);
			String[] flist = directory.list();
			int flag = 0;
			if (flist == null) {
					System.out.println("The Directory is Empty!!");
			}else {
				for (int i = 0; i < flist.length; i++) {
					String file1= flist[i];
							if (file1.equals(fileName)) {
								file.delete();
								flag = 1;
								System.out.println(fileName+" file is deleted");
								}
							}
				}
					if (flag == 0) {
						System.out.println("File Not Found!!");
						}
					/*System.out.println("Returning to Main Menu");
					OptionOne opt =  new OptionOne();
					opt.optionOne();*/
		}
}



