class MultiThreadingDemo extends Thread
{
	public void run()
	{
		for(int i = 0; i<=5;i++)
		{
			System.out.println("Thread 1:"+thread.currentThread.getId()+" count" +i);
		}
	}
}

class MultiThreadExample2
{
	public static void main(String[] args)
	{
		MultiThreadingDemo obj = new MultiThreadingDemo();
		obj.start();
		for(int i = 0;i<=5;i++)
		{
			System.out.println("Thread 2:"+thread.currentThread.getId()+" count" +i);
		}
	}
}