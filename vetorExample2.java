import java.util.*;
class VectorExample2
{
	public static void main(String[] args)
	{
		Vector<Integer> v= new Vector<>(20);
		for(int i=0;i<100;i=i+10)
		{
			v.addElement(i);
		}
		System.out.println("Capacity:"+v.capacity());
		System.out.println("Size:"+v.size());
		
		for(int i:v)
		{
				System.out.println(i);
		}
	}
}