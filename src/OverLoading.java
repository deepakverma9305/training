

public class OverLoading {

	
	
	public static void main(String[] args)

	{
		
		
		OverLoad test1= new OverLoad();
		
		int m= test1.Add(4, 5);
		
		System.out.println(m);
		

}
	
}


class OverloadingTest {

		
		public  int Add(int a, int b)
		
		{
					
			int j= a+b;
			return j;		
			
		}
		
		
		public  String Add(String i, String j)
		
		{
			String k=i+j;
			return k;			
					
		}
		
		public  float Add(float a, float b)
		{
			
			
			float g= a+b;
			
			return g;
					
			
		}
	}

	 class OverLoad extends OverloadingTest{
		
		
		@Override
		public int Add(int a, int b)
		
		{
			
			int l= a*b;
			return l;
			
			
		}
		
		
		




		
	}


