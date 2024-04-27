//writing on a file
//filema lekhna ko lagi integer plus string lai nei byte arrayma convert garnei parne huncha

import java.io.*;
import java.util.Scanner;

public class OutputStreamExample
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner();
		try
		{
			FileOutputStream fos = new FileOutputStream("Output.txt");
			//fos.write(65); //A bhanne character filema save huncha acccording to ascii value, yaha number chai write garna chhutei class import garnu parcha
			//String str = "This text will be stored in file"; //directly kehi lekheko
			//yo chai user bata k lekhne bhanera input magne
			System.out.println("Enter your string");
			String str = obj.nextLine(); //user bata input liyeko
			
			//write() bhanne method le integer le integer tarikale nei lincha
			byte[] b = str.getBytes(); //aako string lai byte arrayma convert gareko 
			fos.write(b); //write method le integer  ra byte array matrei lincha
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
}