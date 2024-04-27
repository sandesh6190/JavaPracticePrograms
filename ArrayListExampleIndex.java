import java.util.*;
class ArrayListExampleIndex
{
	public static void main(String[] args)
	{
		ArrayList<String> obj = new ArrayList<>();
		obj.add("Apple");                 //obj.add aayo , vectorma bhako bhaye obj.addElement() use hunthyo
		obj.add("Orange");
		obj.add("Mango");
		obj.add("A12342");
		obj.add("Papaya");
		
		
		// obj.remove(3);           yo chai individually specific index bata element remove garda
		
		for(String str:obj)
		{
			System.out.println(str);
		}
		
		obj.clear();
		boolean test = obj.isEmpty();
		if(test==true)
		{
			System.out.println("Array List is empty");
		}
		
	}
}