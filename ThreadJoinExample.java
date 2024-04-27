class MyThread implements Runnable
{
	private String message;
	public MyThread (String message)
	{
		this.message=message;
	}
	public void run()
	{
		for(int i =1;i<=5;i++)
		{
		System.out.println(message+,"count:"+i);
		}
	}
}

class ThreadJoinExample
{
	public static void main(String[] args)
	{
		MyThread obj1 = new MyThread("Hello World");
		MyThread obj2 = new MyThread("Hello BCA");
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try
		{
			t1.join();
		}
		catch(InterruptedExecution e)
		{
			
		}
		
		t2.start();
	}
}