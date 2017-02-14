//Mansour Elsharawy
//APCS pd5
//HW06 --  Step 1: Split, Step 2: ?, Step 3: Sorted!
//2017-02-12  

/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm: The algorithm works recursively, so when working with mergeSort on an array, the algorithm tells the array to split itself evenishly into two arrays, and the algorithm returns the merged version of the sorted array, and if the array is of length 1, the array is just returned. It works all the time, 100% of the time. 

  ======================================*/

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) 
    {
	int[] output = new int[a.length + b.length];
	int index1 = 0;
	int index2 = 0;
	int outputIndex = 0;
	while(!(index1 == a.length &&  index2 == b.length)){
	    if(index1 == a.length){
		output[outputIndex] = b[index2];
		index2++;
	    }
	    else if(index2 == b.length){
		output[outputIndex] = a[index1];
		index1++;
	    }
	    else if(a[index1] < b[index2]){
		output[outputIndex] = a[index1];
		index1++;
	    }
	    else{
		output[outputIndex] = b[index2];
		index2++;
	    }
	    outputIndex++;
	    
	}
	return output;

    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) 
    {
	if(arr.length == 1)
	    return arr;
	else{
	    int[] thing1 = new int[arr.length/2];
	    for(int z = 0; z < thing1.length;z++){
		thing1[z] = arr[z];
	    }
	    int[] thing2 = new int[(arr.length/2) + arr.length%2];
	    for(int z = 0; z < thing2.length;z++){
		thing2[z] = arr[z+thing1.length];
	    }
	    return merge(sort(thing1),sort(thing2));

	}
    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {


	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};

	System.out.println("\nTesting mess-with-array method...");
	printArray( arr3 );
	mess(arr3);
	printArray( arr3 );

	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );

	System.out.println("\nMerging arr4 and arr6: ");
	printArray( merge(arr4,arr6) );

	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) );
	printArray( sort( arr7 ) );

    }//end main()

}//end class MergeSort

