package arraysTest;

import java.util.ArrayList;

public class MainClass {
	public static void displayCartProds(ArrayList<Object> cart) 
	{
		for (int i = 0; i < cart.size(); i++) 
		{
			if (cart.get(i) instanceof Book) 
			{
				Book b1 = (Book) cart.get(i);
				b1.showBookDetails();
			}
			else
			{
				Shoes s1 = (Shoes) cart.get(i);
				s1.showShoesDetails();
			}
			
			System.out.println("-----------------");
		}
	}
	
	public static void showAllProdsDetails(ArrayList<Object> cart)
	{
		for (int i = 0; i < cart.size(); i++) 
		{
			System.out.println(cart.get(i).toString());
		}
	}

	public static void main(String[] args) {
		ArrayList<Object> cart=new ArrayList<Object>(); 
		//Object[] cart = new Object[7];
		
		Book B1= new Book("Life is What You Make it", "Shenoy Preeti", 90);
		cart.add(B1);
		Shoes S1 = new Shoes("Nike", "blue", 1200);
		cart.add(S1);
		Book B2 = new Book("Everyone Has A Story ", "Savi Sharma", 125);
		cart.add(B2);
		Shoes S2 = new Shoes("Reebok", "red", 2000);
		cart.add(S2);
		Book B3 = new Book("Train to Pakistan ", "Singh Khushwant", 144);
		cart.add(B3);
		Shoes S3 = new Shoes("Puma","black", 1400);
		cart.add(S3);
		
		//displayCartProds(cart);
		showAllProdsDetails(cart);

	}
	
	
	
	
	
	
	
}
