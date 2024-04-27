import java.io.*;

public class FileReaderExample
{
	public static void main(String[] args)
	{
		try
		{
			//Writing on a file
			FileWriter fw = new FileWriter("example.txt");
			//fw.write(66); //corresponding character write huncha according to ascii value
			fw.write("Hello World");
			fw.close();
			
			//Reading on a file
			FileReader fr = new FileReader("example.txt");
			char [] ch = new char[1024];
			fr.read(ch); //ch bhanne character bufferma rakheko ho
			System.out.println(ch); //sabbei character print huncha as a string palei pilo
			//System.out.println(ch[0]); //suruko indexko character matrei print garne
			fr.close();
		}
		catch(IOException e)
		{
		
		}
		
		
		
	}
}