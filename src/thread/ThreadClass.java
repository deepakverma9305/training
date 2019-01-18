package thread;



class ThreadOne extends Thread

{
	
public void run()

{
	
System.out.println("Thread one is running");

}

}

class ThreadTwo extends Thread

{
	
	
	public void run()
	
	{
		
		System.out.println("Thread two is running");
		
		
		
		
	}
	
	
}


public class ThreadClass {

	
	
	public static void main(String[] args)
	
	{
		
		
		ThreadOne t1= new ThreadOne();
		t1.setPriority(2);
		
		
		ThreadTwo t2= new ThreadTwo();
		
		t2.setPriority(1);
		
		t1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t2.start();
		
	}
	
	
	
}

