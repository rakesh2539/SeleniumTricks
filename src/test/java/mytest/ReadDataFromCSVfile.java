package mytest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class ReadDataFromCSVfile {
	
	
	public static void main(String[] args) throws IOException {
		
		
		// This is wirte the Data into CSV File
		
		String CSVFilepath=System.getProperty("user.dir")+"\\Datafiles\\example.csv";
		
		/*
		 * // FileWriter fw=new FileWriter(CSVFilepath); // //
		 * fw.append("Name,Age,Email \n"); //
		 * fw.append("Rakesh,20,rakesh@gmail.com \n"); //
		 * fw.append("mahesh,21,mahesh@gmail.com \n"); //
		 * fw.append("suresh,22,suresh@gmail.com \n"); // // fw.close(); // //
		 * System.out.println("data is written"); //
		 */		
		//Read the data From CSV File
		
		
		File f=new File(CSVFilepath);
		
		FileReader fr=new FileReader(f);
		
		BufferedReader bfreader=new BufferedReader(fr);
		
		String line;
		
		while((line=bfreader.readLine())!=null)
		{

           String[] data=line.split(",");
           
           for (String value : data) {
        	   
        	   System.out.print(value+"\t");
			
		}
    	   System.out.println();

		}

		
		
	}

}
