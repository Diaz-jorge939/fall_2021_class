
public class Quick 
{
	
	public static void sort(String[] words, int i, int k) 
	{
		int j = 0;
			   
		// Base case: If there are 1 or zero elements to sort,
		// partition is already sorted
		if (i >= k)
			return;
		// Partition the data within the array. Value j returned
		// from partitioning is location of last element in low partition.
		j = Partition(words, i, k);
			   
		// Recursively sort low partition (i to j) and
		// high partition (j + 1 to k)
		sort(words, i, j);
		sort(words, j + 1, k);	
	}
	/****************************************************
     * Method     : Partition()
     *
     * Purpose    : Partition method sorts the two partitions
     * 			  from index i which is the low side of the array
     * 	          and index k which is the high side of the array
     * Parameters : String [] words - strings from file
     * 				int i - index variable
     *              int k - index variable 
     * Returns    : returns h to sort() - h represents the 
     *				last index of the last element in the
     *				low partition.
     ****************************************************/
	public static int Partition(String[] numbers, int i, int k) 
	{
			   int l = 0;
			   int h = 0;
			   int midpoint = 0;
			   String pivot;
			   String temp;
			   boolean done = false;
			   
			   // Pick middle element as pivot
			   midpoint = i + (k - i) / 2;
			   pivot = numbers[midpoint];
			   
			   l = i;
			   h = k;
			   
			   while (!done) {
			      
			      // Increment l while numbers[l] < pivot
			      while (numbers[l].compareTo(pivot) < 0) {
			         ++l;
			      }
			      
			      // Decrement h while pivot < numbers[h]
			      while (numbers[h].compareTo(pivot) >0) {
			         --h;
			      }
			      
			      // If there are zero or one elements remaining,
			      // all numbers are partitioned. Return h
			      if (l >= h) {
			         done = true;
			      }
			      else {
			         // Swap numbers[l] and numbers[h],
			         // update l and h
			         temp = numbers[l];
			         numbers[l] = numbers[h];
			         numbers[h] = temp;
			         
			         ++l;
			         --h;
			      }
			   }
			   
			   return h;
	}

}