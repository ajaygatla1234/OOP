package com.gl.streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream_FileWriterAndReader {

    /*
     This statement indicates that the method can throw an IOException, 
     so any code calling fileWriter1 must handle or declare it because the method call can also have the same exception.
     */
	//Output Stream
	public static void fileWriter1(String a) throws IOException {
		String str=new String(a);
		FileWriter fw=new FileWriter("sample1.txt"); //if we don't provide complete path, it will be saved in the Project itself in workspace.
		//or FileWriter fw=new FileWriter("C:\\Users\\ajayg\\Desktop\\Utility Programs/sample.txt");   //specifying the complete path.                    
		fw.write(str);
		fw.flush();
		fw.close();
		System.out.println("successful insered : "+a);
	}
	
	//Output Stream
	public static void fileWriter2(String a) {
		String str=new String(a);
		FileWriter fw;
		try {
			fw = new FileWriter("sample1.txt");
			fw.write(str);  //writes data into the stream, not into the file directly
			fw.flush();  //It will push the data from the stream into the file.
			fw.close();  //if we removed or comment the flush and close, the the file is created but, data will not pushed from the stream into the file, it will be empty, some times file may also not be created.
			//If we remove or comment out the flush and close operations, the file will be created but the data will not be pushed from the stream into the file, resulting in an empty file. 
			//In some cases, the file may not be created at all.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("successful insered : "+a);
	}

	//This method is continuously running, Check End of the page for Reason
	//Input Stream
	public static void fileReader1() {
		char myChar;
		try {
			FileReader fr=new FileReader("sample1.txt");
			
			while((myChar=(char)fr.read())!=-1) {  //The read() method returns an integer representing the Unicode value of the character read. If the end of the stream is reached, it returns -1.
				System.out.print(myChar);
				System.out.flush(); //it is not mandatory for FileReader
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	//Input Stream
	public static void fileReader2() {
		
	    try  {
	    	FileReader fr = new FileReader("sample1.txt");
	        int myChar;
	        while ((myChar = fr.read()) != -1) {   //The read() method returns an integer representing the Unicode value of the character read. If the end of the stream is reached, it returns -1.
	            System.out.print((char) myChar);
	        }
	    } catch (FileNotFoundException e) {
	        System.out.println("File not found: " + e.getMessage());
	        e.printStackTrace();
	    } catch (IOException e) {
	        System.out.println("Error reading file: " + e.getMessage());
	        e.printStackTrace();
	    }
	}


	public static void main(String[] args) throws IOException {

		
		fileWriter1("Hello World");  //this method requires exception handling, as it is not handled internally
		fileWriter2("Welcome");      //this method does not require to handle, because it already handled internally using try catch
		fileReader1();               
		fileReader2();

		/*
		 * Issue arise or faced in fileReader1(); when we use char to store the returned Integer value of red():-
		 * 
		 * The issue in the fileReader1 method is due to using a char variable to store the result of fr.read(). 
		 * The read() method returns an int representing the Unicode value of the character read, or -1 if the end of the stream is reached. 
		 * If you cast this int directly to char, it can cause problems because char cannot represent -1.
		 * If the end of the stream is reached. When you cast this int directly to char, it causes problems because char cannot represent -1, leading to the loop not terminating and causing the console to run continuously without stopping.
		 * now use an int variable to store the result of fr.read(), ensuring proper handling of the end-of-stream condition (-1).
		 * This ensures that the -1 end-of-stream value is properly handled. because myChar & -1 both are int type, so they can be compared and if it is equal to -1, exits the loop
		 * This change will prevent the console from running continuously, as the loop will now properly terminated when the end of the file is reached.
		 * So try to use int instead of char.
		 * 
		 */
		
	}
}