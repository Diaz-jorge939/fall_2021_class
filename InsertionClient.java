import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InsertionClient {
	public static void main(String[] args) throws FileNotFoundException 
	{
		PrintWriter outputFile = new PrintWriter("sorted.txt");
		
		File inputFile = new File("50k.txt");
		Scanner in = new Scanner(inputFile);
		int arrSize = in.nextInt();
		int i = 0;
		String [] originalArr = new String[arrSize];
		
		while(in.hasNext())
		{
			String strIn = in.next();
			originalArr[i] = strIn; 
			i++;
		}
		in.close();
		// start recording time
		long start = System.currentTimeMillis();
		Insertion.sort(originalArr);
		long now = System.currentTimeMillis();
		System.out.printf("elapsed time for %,d words: %d milliseconds.",arrSize,(now - start));
		// writing ordered list to sorted.txt
		outputFile.println("Insertion_Sorted");
		for(int j = 0; j < arrSize; j++)
			outputFile.println(originalArr[j] + ",");

		outputFile.close();
	}

}