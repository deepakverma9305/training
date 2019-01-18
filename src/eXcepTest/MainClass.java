package eXcepTest;

import java.util.Calendar;

public class MainClass 


{

	public static void Maths(int a) throws MathematicalException {
		if(a<1)
			
		{
			throw new MathematicalException("Number less than zero");
			
			
			
		} else {
		int b = 1000/a;
		
		System.out.println(b);
		}
	}
	
	public static void Data(String a) throws DataException
	
	{
		if(a=="")
			
		{
			throw new DataException("Data ot correct");
			
			
		}else {
		
		String b=a.substring(6, 9);
		
		System.out.println(b);}
		
		
		
	}
	
	public static void DateTime(int day) throws DateTimeException
	
	{
		Calendar c = Calendar.getInstance();
		
		
		if(day==Calendar.DAY_OF_WEEK)
		{
		
		
		System.out.println(Calendar.getInstance());
		}else
		{
			throw new DateTimeException("wrong day");
			
		}
		
	}
	
	
	public static void Type(int a) throws TypeException
	
	{
		if(a==5)
		{
		System.out.println(a);}
		
		else
			
		{
			
			throw new TypeException("Type not correct");
		}
		
		
		
	}
	
	
	public static void Valid(int a) throws ValidationException
	
	{
		
		if(a==10)
			
		{
			System.out.println("True");
		}
		else {
			
			throw new ValidationException("Not Valid Value");
			
			
		}
		
	}
	
	public static void main(String[] args) 
	
	
	{
		try {
		
		//Maths(0);
			//Valid(5);
			
			Type(1);
		
		}catch(TypeException e ) {//System.out.println(e.toString());
		
		
		
		}
		
	}
	
	
	
}
