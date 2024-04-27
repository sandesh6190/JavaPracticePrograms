//BufferedInputStream ko example
import java.io.*;

public class BufferedInputStreamExample
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("myFile.txt"); //fileInputStream ko
			BufferedInputStream bis = new BufferedInputStream(fis,1024); //bufferedInputStream ko 1024 byte data lyako easma

			int byte_read;
			while((byte_read = bis.read())!=-1) //till last byte
			{
			System.out.println((char)byte_read);
			}			
		}
		catch(IOException e)
		{
			System.out.println("Wrong File name!");
		}
	}
}