
//yaha chai integer pani filema rakhne example ho
import java.io.*;

public class DataStreamExample {
	public static void main(String[] args) {
		try {
			// writing into file
			FileOutputStream fos = new FileOutputStream("file1.dat"); // datafile(binaryfile) type ho yaha txt file
																		// rakhda pani huntyo
			DataOutputStream dos = new DataOutputStream(fos); // yesle garda integer pani filema rakhna sakincha, yaha
																// byte array use garnu parena string haru filema lekhna
																// lai

			int intVal = 10;
			double doubleVal = 78.67;
			boolean booleanVal = true;
			String strVal = "Hello DataStream";

			dos.writeInt(intVal);
			dos.writeDouble(doubleVal);
			dos.writeBoolean(booleanVal);
			dos.writeUTF(strVal);

			// easari close gareko ramro ho, memory kam khancha
			dos.close();
			fos.close();

			// Reading from file
			FileInputStream fis = new FileInputStream("file1.dat"); // datafile(binaryfile) type ho yaha txt file rakhda
																	// pani huntyo
			DataInputStream dis = new DataInputStream(fis);

			intVal = dis.readInt();
			doubleVal = dis.readDouble();
			booleanVal = dis.readBoolean();
			strVal = dis.readUTF();
			System.out.println("Integer Value: " + intVal);
			System.out.println("Double Value: " + doubleVal);
			System.out.println("Boolean Value: " + booleanVal);
			System.out.println("String Value: " + strVal);
		} catch (IOException e) {

		}

	}
}