import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;


public class ReversalTest {

	@Test
	public void test() {
		File in = new File("in1.txt");
		File out = new File("out1.txt");
		File check = new File("check1.txt");
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
			s.close();
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test2() {
		File in = new File("in404.txt");
		File out = new File("out404.txt");
		try {
			Reversal.Reverse(in, out);
			fail();
		} catch (FileNotFoundException e) {
			assertTrue(true);
		}
	}
}