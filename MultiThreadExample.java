class MultiThreadingDemo extends Thread
{
	public void run()
	{
		for(int i = 0; i<=5;i++)
		{
			System.out.println("Thread 1:"+Thread.currentThread().threadId()+" count" +i);
		}
	}
}

class MultiThreadExample
{
	public static void main(String[] args)
	{
		MultiThreadingDemo obj = new MultiThreadingDemo();
		obj.start();
		for(int i = 0;i<=5;i++)
		{
			System.out.println("Thread 2:"+Thread.currentThread().threadId()+" count" +i);
		}
	}
}