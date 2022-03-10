package com.simplilearn.phase1_project;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class RetrieveFiles {
    void retrieve() throws IOException{
    File folder = new File("C://Users/hp/Desktop/avi/Java_Home/Phase1_project/ABC/");
    if(folder.isDirectory())
    {
    	
        File[] fileList = folder.listFiles();
       
        Arrays.sort(fileList);
        System.out.println("Total number of files and their names are listed below: ");
        System.out.println("\nTotal number of items present in the directory: " + fileList.length );
        System.out.println("");
        if(fileList.length==0){
        	System.out.println("Folder is empty!! Please add files");
        }
        for(File file:fileList)
        {
            System.out.println(file.getName());
        }
    }
    
    /*System.out.println("");
    System.out.println("Please select one of the option to proceed further");
    OptionOne opt =  new OptionOne();
	opt.optionOne();*/
}
}


