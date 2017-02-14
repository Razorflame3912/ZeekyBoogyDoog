/*======================================
  class MergeSortTester

  ALGORITHM:
  <INSERT YOUR DISTILLATION OF ALGO HERE>

  BIG-OH CLASSIFICATION OF ALGORITHM:
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester 
{

    public static void populate (int[] arr){
	for(int i = 0; i < arr.length; i++){
	    int randomInt = (int)(Math.random()*arr.length);
	    arr[i] = randomInt;
	}
    }

    public static void timer(int x){
	int[] one = new int[x];
	populate(one);
	//	MergeSort.printArray(one);
	long startTime = System.nanoTime();
	MergeSort.sort(one);
	long sortTime = System.nanoTime() - startTime;
	//MergeSort.printArray(one);
	System.out.println("Sorting time for n=" + x + ":"  + sortTime);
    }
    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {
	for(int i = 0; i<8; i++){
	    timer((int)Math.pow(10,i));
	}

    }//end main

}//end class
