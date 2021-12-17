
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class QuickClient {
	public static void main(String []args) throws FileNotFoundException 
	{
		PrintWriter outputFile = new PrintWriter("sort.csv");
	
		File inputFile = new File("input200k.txt");
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
		
		//start recording time
		long start = System.currentTimeMillis();
		Quick.sort(originalArr, 0, arrSize - 1);
		long now = System.currentTimeMillis();
		System.out.printf("elapsed time for %,d words: %d milliseconds.",arrSize,(now - start));
		
		// writing sorted list to sortnew.csv
		outputFile.println("Sorted");
		for(int j = 0; j < arrSize; j++)
			outputFile.println(originalArr[j] + ",");

		outputFile.close();
	}
	
}
