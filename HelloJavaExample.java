class HelloPrinter extends Thread
{
	public void run()
	{
		System.out.println("Hello");
	}

}

class JavaPrinter extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
		
		}
		System.out.println("Java");
	}
}

class HelloJavaExample
{
	public static void main(String[] args)
	{
		HelloPrinter obj1 = new HelloPrinter();
		JavaPrinter obj2 = new JavaPrinter();
		
		obj1.start();
		
		try
		{
			obj1.join();
		}
		catch(InterruptedException e)
		{
		
		}
		obj2.start();
		try
		{
			obj2.sleep(3000);
		}
		catch(InterruptedException e)
		{
		
		}
	}

	
}