class MultiThreadingDemo extends Thread
{
	private string name;
	public MyThreads(string n)
	{
		name = n;
	}
	public void run()
	{
		for(int i = 0; i<=5;i++)
		{
			System.out.println(":Ram");
			try
			{
				Thread.sleep(2000);
			}
			
			catch(InterruptedException e)
			{
				System.out.println("Interrupted ");
			}
		}
	}
}

class MultiThreadExample4
{
	public static void main(String[] args)
	{
		MultiThreadingDemo obj1 = new MultiThreadingDemo("Thread1");
		MultiThreadingDemo obj2 = new MultiThreadingDemo("Thread2");
		obj1.start();
		obj2.start();
		for(int i = 0;i<=5;i++)
		{
			System.out.println("name: Ram" );
		}
	}
}