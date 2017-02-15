// ZeekyBoogyDoog -- Mansour Elsharawy, David Frid, Chester Huang
// APCS2 pd5
// HW07 -- What Does the Data Say
// 2017-02-15

/*======================================
  class MergeSortTester

  ALGORITHM:
  Summary of MergeSort: The algorithm works recursively, so when working with mergeSort on an array, the algorithm tells the array to split itself evenishly into two arrays, and the algorithm returns the merged version of the sorted array, and if the array is of length 1, the array is just returned. It works all the time, 100% of the time. 

  BIG-OH CLASSIFICATION OF ALGORITHM: O(nlogn)


  Mean execution times for dataset of size n:
  Batch size:   10

  Example results:
  n = 1:        274
  n = 2:        2914
  n = 5:        8909
  n = 10:       23291
  n = 20:       56372
  n = 50:       43007
  n = 100:      33685
  n = 200:      121626
  n = 500:      342136
  n = 1000:     551675
  n = 2000:     743780
  n = 5000:     2270884
  n = 10000:    3172946
  n = 20000:    6165199
  n = 50000:    15096394
  n = 100000:   31905618
  n = 1000000:  357231166


  ANALYSIS:
  The runtime of mergesort is O(nlogn). For large values, as n is increased by
  some factor, the time it takes to sort increases by a relatively similar
  factor, albeit slighter higher. This rules out O(n^2) or worst as well as 
  O(n) or better, leaving O(nlogn). Graphing the data suggests that this is
  an accurate analysis.
  ======================================*/

public class MergeSortTester 
{

    public static void populate (int[] arr){
	for(int i = 0; i < arr.length; i++){
	    int randomInt = (int)(Math.random()*arr.length);
	    arr[i] = randomInt;
	}
    }

    public static String timer(int x){
	int[] arr = new int[x];
	populate(arr);
        long startTime, sortTime;
        long totalTime = 0;

        for (int i = 0; i < 10; i++) {
            startTime = System.nanoTime();
            MergeSort.sort(arr);
            sortTime = System.nanoTime() - startTime;
            
            totalTime += sortTime;
        }
        
        return "Sorting time for n = " + x + ": "  + (totalTime / 10);
    }
    
    /*
        The method populate fills an integer array with random values.
        The method timer calculates the time, in nanoseconds, to sort an
        array of length x. This is done using the nanoTime() method. Batch size
        is 10, average is taken.

        The main method consists of an array of test values that would be
        passed into the timer method.

        timer(1) runs all the methods once; this is neede because java
        takes longer the first time it runs a method         
    */
    public static void main( String[] args ) 
    {
        timer(1);

        int[] testValues = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000,
                            5000, 10000, 20000, 50000, 100000, 1000000};
        for(int i: testValues){
            System.out.println(timer(i));
	}

    }//end main

}//end class
