public class Insertion 
{
	
	public static void sort(String[] strings) 
	{
		int i = 0;
		int j = 0;
		String temp = "";  // Temporary variable for swap
			   
		for (i = 1; i < strings.length; ++i) 
		{
			j = i;
			// Insert numbers[i] into sorted part
			// stopping once numbers[i] in correct position
			while (j > 0 && strings[j].compareTo(strings[j - 1]) < 0) 
			{
			    // Swap numbers[j] and numbers[j - 1]
			    temp = strings[j];
			    strings[j] = strings[j - 1];
			    strings[j - 1] = temp;
			    j--;
			}
		}
	}

	
}
