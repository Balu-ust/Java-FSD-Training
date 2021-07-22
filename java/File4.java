package com.ust.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File4 {

	public static void main(String[] args) {
		File file = new File("D:file5.txt");
		// writing file using buffered writer
		FileWriter fileWriter= null;
		BufferedWriter bufferedWriter= null;
		
		try {
			fileWriter= new FileWriter(file);
			bufferedWriter= new BufferedWriter(fileWriter);
			bufferedWriter.write("This is an example \n");
			bufferedWriter.write("of using bufferedwriter and \n");
			bufferedWriter.write("Bufferereader");
			bufferedWriter.flush();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fileWriter!=null) {
					fileWriter.close();
				}
				if(bufferedWriter!=null) {
					bufferedWriter.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		//reading file using buffered reader
		FileReader fileReader= null;
		BufferedReader bufferedReader= null;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line = null;
			
			while(( line=bufferedReader.readLine())!=null) {
				System.out.println(line);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		
		finally {
			try {
				if(fileReader!= null) {
					fileReader.close();
					
				}
				if(bufferedReader!= null) {
					bufferedReader.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
