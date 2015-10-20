import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;


public class Reversal {
	public static void ReverseFile(File in, File out) throws FileNotFoundException{
		Scanner input = new Scanner(in);
		Stack<String> lines = new Stack<String>();
		Stack<String> words = new Stack<String>();
		PrintWriter output = new PrintWriter(out);
		String ls = System.getProperty("line.separator");
		while(input.hasNextLine()){
			String rline = "";
			Scanner s = new Scanner(input.nextLine());
			while(s.hasNext()){
				words.push(s.next());
			}
			while(!words.empty()){
				rline = rline + words.pop();
				if(!words.empty()){
					rline = rline + " ";
				}
			}
			lines.push(rline);
			s.close();
		}
		while(!lines.empty()){
			output.print(lines.pop()+ls);
		}
		output.close();
		input.close();
	}
}