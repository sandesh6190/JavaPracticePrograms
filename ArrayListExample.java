import java.util.*;
class ArrayListExample
{
	public static void main(String[] args)
	{
		ArrayList<String> obj = new ArrayList<>();
		obj.add("Apple");                 //obj.add aayo , vectorma bhako bhaye obj.addElement() use hunthyo
		obj.add("Orange");
		obj.add("Mango");
		obj.add("A12342");
		obj.add("Papaya");
		
		for(String str:obj)
		{
			System.out.println(str);
		}
		
	}
}