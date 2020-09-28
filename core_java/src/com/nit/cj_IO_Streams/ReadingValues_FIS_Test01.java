package com.nit.cj_IO_Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingValues_FIS_Test01 {

	public static void main(String[] args) {
		
		FileInputStream fis=null;
		
		try {
			
			//Creating connection to File FileInputStream
		     fis = new FileInputStream("abc.text");
			
			
	        //Retrieving data from file using read() method
			int data;
			while(( data=fis.read())!=-1) {
			System.out.println(data+" "+(char)data);
			}
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
	}

}
