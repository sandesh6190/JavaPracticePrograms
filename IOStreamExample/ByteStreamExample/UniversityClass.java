//purano question

import java.io.*;

public class UniversityClass
{
	public static void main(String[] args)
	{
		try
		{
		FileOutputStream fos = new FileOutputStream("University.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		String college1_name = "GM College";
		String college1_address = "Birtamode, Jhapa";
		
		String college2_name = "PUSAT College";
		String college2_address = "Biratnagar";
		
		String college3_name = "Kantipur City College";
		String college3_address = "Kathmandu";
		
		//writing into file
		dos.writeUTF(college1_name);
		dos.writeUTF(college1_address);
		dos.writeUTF(college2_name);
		dos.writeUTF(college2_address);
		dos.writeUTF(college3_name);
		dos.writeUTF(college3_address);
		
		dos.close();
		fos.close();
		}
		catch(IOException e)
		{
			
		}
		
	}
}