package files_test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Fil_test1
{

	public static void main(String[] args) throws IOException
	
	
	
	{
		
		
		File f1= new File("C:/Users/Tera/Documents/Java Training/train.txt");
		
		f1.createNewFile();
		
		FileWriter W1= new FileWriter(f1);
		
		 W1.write("My name is Deepak");
		 W1.flush();
		 W1.close();
		 
		 
		 
		 FileReader r1= new FileReader(f1);
		 
		 int len = (int)f1.length();
			char[] c1 = new char[len];
			r1.read(c1);
			System.out.println(c1);
			String str = String.valueOf(c1);
		 
//		 BufferedReader br = new BufferedReader(r1);
//		 
//		 String st;
//		 while ((st = br.readLine()) != null) 
//			    System.out.println(st);
//		
//		 br.close();
		 
	}
	
	
}
