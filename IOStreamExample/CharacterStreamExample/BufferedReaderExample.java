import java.io.*;
import java.util.*;

public class BufferedReaderExample {
	public static void main(String[] args) {
		try {
			Scanner obj = new Scanner(System.in);

			// Writing on a file by a BufferedWriter

			FileWriter fw = new FileWriter("example1.txt"); // FileWriter and FileReader are always necessary for
															// BufferedWriter and BufferedReader
			// data filema append garnako lagi
			// FileWriter fw = new FileWriter("example1.txt",true);

			BufferedWriter bw = new BufferedWriter(fw);
			int ch;
			// String str;
			System.out.println("Enter your String:");

			// str = obj.nextLine();
			// bw.write(str);
			/*
			 * //scannerle directly single character lina sakdeina
			 * while(ch!='\0')//till user click Enter
			 * {
			 * ch = obj.nextInt(); //yaha ascii value as a integer save huncha,
			 * bw.write(ch);
			 * }
			 */

			while ((ch = System.in.read()) != '\n') // yaha character ko ascii value ma convert garera ch bhanne integer
			// type variable ma bascha
			{
				bw.write(ch); // feri yesle integer type data lai corresponding characterma convert grera
				// bufferedWrite methodle filema characterharu/String lekhcha
			}
			bw.close(); // sadhei bufferedwriter/reader close garne
			fw.close();

			// Reading from a file by BufferedWriter
			FileReader fr = new FileReader("example1.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			// line = br.readLine(); //ek chotima euta line read huncha multiple line read
			// garnako lagi while loop laune
			// System.out.println(line);

			// reading multiple lines
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			fr.close();
		} catch (IOException e) {

		}

	}
}