class ParentClass
{
	void displayParentClass()
	{
		System.out.println("Parent Class method calling.");
	}
}

class ChildClass extends ParentClass
{
	void displayChildClass()
	{
		System.out.println("Child Class method calling.");
	}
}

class SingleInheritanceExample
{
	public static void main(String[] args)
	{
		ChildClass obj = new ChildClass();
		obj.displayChildClass();
		obj.displayParentClass();
	}
}

