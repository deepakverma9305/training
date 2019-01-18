package overriding;

public class Assignment {

	
	public static void main(String[]args)

	{
		
		PrimCast c = new PrimCast();
		
		System.out.println(c.b);
		System.out.println(c.i);
		
		SubClass ref1= (SubClass) new SupClass();
		
		ref1.DeepTest();

	}
	
	

	}
	


interface TestInterf{
	
	public void DeepTest();
	
	
	
}
class SupClass{
	
	
public void DeepTest() {
		
		String k= "This is DownCastingcasting";
		System.out.println(k);
			}
	
}	

class SubClass extends SupClass implements TestInterf{

	
	
	
}
class PrimCast{
	
	
	// Widening
	
	
	int a=60;
	
	double b=a;
	
	
	//narrowing
	
	double g =60.00;
	
	
	int i= (int)g;
	
}




