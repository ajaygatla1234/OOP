package com.gl.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream_FileOutputAndInput {
	
	
	public static void writeToByteStream(String str) {
		
		try {
			byte[] mybytes=str.getBytes();  //Converts the String into binary format
			FileOutputStream fo=new FileOutputStream("smaple2");  //generic binary file containing raw byte data (if no extension is given)
			//The absence of a specific file extension like .txt or .bin does not change the nature of the file created by FileOutputStream; it remains a binary file.
			fo.write(mybytes);
			fo.flush();
			fo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Succesfully Inserted : "+str);
	}
	
	public static void readFromByteStream() {
		
		try {
			FileInputStream fi=new FileInputStream("smaple2");

//			byte[] readbytes=new byte[200];  //if we use this, after the displaying the data, the remaining bytes are filled with boxes which represent empty spaces in terms of uni-code \u0020.
			byte[] readbytes1=new byte[fi.available()]; //fi.available() is used to determine the exact number of bytes written to the file so that only that number of bytes is read.
			
			fi.read(readbytes1);
			
			String str=new String(readbytes1);
			System.out.println("Read Data: "+str);
			fi.close();  //it is not mandatory for FileInputStream
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		writeToByteStream("Hello World");
		readFromByteStream();

	}

}
