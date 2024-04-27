//fileInputStream ko example
//filema lekhna ko lagi integer plus string lai nei byte arrayma convert garnei parne huncha
import java.io.*;

public class InputStreamExample
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("myFile.txt"); //fileInputStream ko
			
			int byte_read;
			while((byte_read = fis.read())!=-1) //till last character
			{
			System.out.println("Message: "+(char)byte_read);
			}
			
			//second options
			// int byte_read = fis.read(); //fis.read() - FileInputStream classko method ho yaha euta character matra print huncha
		}
		catch(IOException e)
		{
			System.out.println("Wrong File name!");
		}
	}
}