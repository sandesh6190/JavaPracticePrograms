import java.io.*;
class Student implements Serializable  //serializable is necessary on objectoutputstream class //yaha agadi public nagarne dui tin ota class huda main classlai matrei public banaune
{
	int roll;
	String name;
	public Student(int roll,String name)
	{
		this.roll = roll; //this.roll->objectko roll
		this.name = name;
	}
	
	int getRoll()
	{
		return roll; 
	}
	
	String getName()
	{
		return name;
	}
	
	
}

public class ObjectSerialization //main class
{
	public static void main(String[] args) throws IOException,ClassNotFoundException //yiniharu chai try catchko alternatives way ho
	{
		Student s = new Student(1,"ram");
		
		
		//Writing object on a file
		FileOutputStream fos = new FileOutputStream("serialization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s); //writing object on oos->tespichadi sidhei filema read bhayo
		System.out.println("Successfully written to file");
		
		oos.close();
		fos.close();
		
		//Reading from a file
		FileInputStream fis = new FileInputStream("serialization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s1 = (Student)ois.readObject();
		int r = s1.getRoll();
		String n = s1.getName();
		
		System.out.println("Your Roll: "+r);
		System.out.println("Your Name: "+n);
		
		ois.close();
		fis.close();
	}
}
		