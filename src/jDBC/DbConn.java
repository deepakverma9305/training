package jDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DbConn {
	
	public static Connection con1;
	public static Statement smt1;
	public static ResultSet res1;
	
	
	
	public static  void DbClosse()
	{
		
		try {
			 con1.close();
			 smt1.close();			
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static  void DbStart()
	{
		
		try {
			 con1= DriverManager.getConnection("jdbc:mysql://localhost:3306/deepak", "root", "Sunshine@123");
			
			 smt1= con1.createStatement();
			
				
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	public static void DisplayDb()
	
	{
		
		try {
			
			DbStart();		
			
			 res1=smt1.executeQuery("Select * from city where id= '1'");
			 
			
			while(res1.next())
				
			{
				
				System.out.println(res1.getString(2)+" "+res1.getString(3));
				
			
						
				
				
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
			
		DbClosse();
		
		
	}

	public static void  UpdateData(String sql)
	
	
	{
		
		DbStart();
		
		try {
			int count= smt1.executeUpdate(sql);
			
			if(count>0)
				
			{
				
				System.out.println("Dat set successfully");
				
			}else 
			
			
			{
				System.out.println("Dat was not set");
				
				
				
			}
			
			
		} catch (SQLException e) {
			
			System.out.println(e.toString());e.printStackTrace();
		}
		
		DbClosse();
		
		
	}
	
	public static void CreateData(String sql)
	
	{

		{
			
			DbStart();
			
			try {
				
				smt1.execute(sql);
				
				System.out.println("Table created");
				
				
			} catch (SQLException e) {
				
				System.out.println(e.toString());
				//e.printStackTrace();
			}
			
			DbClosse();
		
		}
		
	}
		
	public static void main(String[] args) 
	
	
	{

           Users u1= new Users();
           
           
           u1.setName("test1");
           u1.setEmail("test1@gmail.com");
           u1.setPhone("8004138796");
           
           
		//System.out.println(u1.getName()+ u1.getEmail()+ u1.getPhone());
		//	DisplayDb();
		//String qu2="insert into users(username,phone,email) values('deepak', '900418796','deepak.verma9305@gmail.com');";
           
	    UpdateData("insert into users(username,phone,email) values('"+u1.getName()+"', '"+u1.getPhone()+"','"+u1.getEmail()+"');");
	
			
		//String qu1= "CREATE TABLE users(username varchar(255),phone varchar(255), email varchar(255)     )";
			
	//	CreateData(qu1);
			
			
				
	
	}
			

	

			
			
	
}
		
		
		

	


