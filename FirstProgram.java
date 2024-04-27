class ForDisplay
{
	void display()
	{
		System.out.println("Calling first Program:....");
	}
}

class FirstProgram
{
	public static void main(String[] args)
	{
		ForDisplay obj = new ForDisplay();
		obj.display();
	}
}