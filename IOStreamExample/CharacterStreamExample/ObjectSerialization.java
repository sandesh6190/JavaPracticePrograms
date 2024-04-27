import java.io.*;

public class Student implements Serializable // serializable is necessary on objectoutputstream class
{
	int roll;
	String name;

	public Student(int roll, String name) {
		this.roll = roll; // this.roll->objectko roll
		this.name = name;
	}

	int getRoll() {
		return roll;
	}

	String getName() {
		return name;
	}

}

public class ObjectSerialization // main class
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	// yiniharu chai try catchko alternatives way ho
	{
		Student s = new Student(1, "ram");

		FileOutputStream fos = new FileOutputStream("serialization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(s); // writing object on oos->tespichadi sidhei filema read bhayo
		System.out.println("Successfully written to file");

		oos.close();
		fos.close();
	}
}
