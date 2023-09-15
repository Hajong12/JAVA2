package ch13;

import java.io.*;
public class ExceptionTest06 {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		FileReader file = new FileReader("a.txt");
		int i;
		while((i = file.read()) != -1) {
			System.out.print((char)i);
		}
		file.close();
	}

}