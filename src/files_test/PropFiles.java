package files_test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class PropFiles 

{
	
	public static void main(String[] args) throws FileNotFoundException
	
	{
		
		Scanner s1=new Scanner(System.in);
		String LoginName= s1.next();
		Scanner s2=new Scanner(System.in);
		String password= s2.next();
		
		System.out.println(LoginName);
		System.out.println(password);
		
		
		
		String Filepath= "C:\\Users\\Tera\\eclipse-workspace\\test\\src\\test.properties";
	
	FileReader f1= new FileReader(Filepath);
	
	Properties p1= new Properties();
	try {
		p1.load(f1);
		
		
		String str1= p1.getProperty("username");
		String str2= p1.getProperty("password");
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(LoginName.equals(str1) && password.equals(str2))
			
		{
			System.out.println("Login Successfull");
			
			
		}
		else { System.out.println("Login Failed");}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	}
	
	

}
