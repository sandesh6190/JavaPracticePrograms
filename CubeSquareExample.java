class SquareThread extends Thread
{
	public void run()
	{
		for(int i = 10;i<10;i++)
		{
			System.out.println("Square of "+i+"="i*i);
		}
	}
}

class CubeThread extends Thread
{
	public void run()
	{
		for(int i = 10;i<10;i++)
		{
			System.out.println("Cube of "+i+"="i*i*i);
		}
	}
}


class CubeSquareClass
{
	public static void main(String[] args)
	{
		SquareThread obj1 = new SquareThread();
		CubeThread obj2 = new CubeThread();
		
		obj1.start();
		obj2.start();
	}
}