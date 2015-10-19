import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;


public class ReversalTest {

	@Test
	public void test() {
		File in = new File("C:/Users/Thomas/Desktop/in1.txt");
		File out = new File("C:/Users/Thomas/Desktop/out1.txt");
		File check = new File("C:/Users/Thomas/Desktop/check1.txt");
		try {
			Scanner s = new Scanner(check);
			Reversal.Reverse(in, out);
			Scanner output = new Scanner(out);
			StringBuilder sb = new StringBuilder("");
			StringBuilder sb2 = new StringBuilder("");
			while(s.hasNextLine()){
				sb.append(s.nextLine());
			}
			String c = sb.toString();
			while(output.hasNextLine()){
				sb2.append(output.nextLine());
			}
			String o = sb2.toString();
			assertEquals("Wrooong",c,o);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
