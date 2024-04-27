//myFile bhanne file bata read garera myFile1 bhanne filema write gareko ho
//filema lekhna ko lagi integer plus string lai nei byte arrayma convert garnei parne huncha

import java.io.*;
//import java.util.Scanner; //needed only if user input string chai read garnu parda

public class InputOutputStreamExample
{
	public static void main(String[] args)
	{
		//Scanner obj = new Scanner(System.in);
		try
		{
			FileInputStream fis = new FileInputStream("myFile.txt");
			FileOutputStream fos = new FileOutputStream("myFile1.txt");
			
			byte[] str = new byte[1024];
			
			fis.read(str); //myFile bata read garera str bhanne string variablema rakheko
			
			//yaha byte string ma convert garnu parena kina bhanne myFile bata string read garda already byte arrayma huncha
			
			fos.write(str);//myFile1 bhanne filema write gareko
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
