interface drawable{
	void draw();
}

class InterfaceExample implements drawable{
	public void draw()
	{
		System.out.println("Drawing Circle....");
	}
	
	public static void main(String[] args)
	{
		Shape obj = new Shape();
		obj.draw();
	}
}